package br.ufes.model;

import br.ufes.state.PedidoAbertoState;
import br.ufes.state.PedidoEmPreparoState;
import br.ufes.state.PedidoEntregueState;
import br.ufes.state.PedidoProntoState;
import br.ufes.state.PedidoState;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private String nomeCliente;
    private String endereco;
    private double valor;
    private PedidoState estado;
    private List<HistoricoPedido> historico = new ArrayList<>();
    
    public Pedido(String nomeCliente, String endereco, double valor){
        this.nomeCliente = nomeCliente;
        this.endereco = endereco;
        this.valor = valor;
        estado = new PedidoAbertoState(this);
        historico.add(new HistoricoPedido(estado.getNomeEstado(), LocalDateTime.now()));
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public String getEndereco() {
        return endereco;
    }

    public double getValor() {
        return valor;
    }

    public List<HistoricoPedido> getHistorico() {
        return historico;
    }

    public PedidoState getEstado() {
        return estado;
    }

    public void setEstado(PedidoState estado) {
        this.estado = estado;
    }
    
    public void iniciaPreparacao(){
        estado.preparar();
        setEstado(new PedidoEmPreparoState(this));
        historico.add(new HistoricoPedido(estado.getNomeEstado(), LocalDateTime.now().plusMinutes(20)));
    }
    
    public void finalizarPreparacao(){
        estado.finalizarPreparo();
        setEstado(new PedidoProntoState(this));
        historico.add(new HistoricoPedido(estado.getNomeEstado(), LocalDateTime.now().plusMinutes(40)));
    }
    
    public void entregarPedido(){
        estado.entregar();
        setEstado(new PedidoEntregueState(this));
        historico.add(new HistoricoPedido(estado.getNomeEstado(), LocalDateTime.now().plusMinutes(60)));
    }

    @Override
    public String toString() {
        return "Pedido{" + "nomeCliente=" + nomeCliente + ", endereco=" + endereco + ", valor=" + valor + "}\n";
    }
}
