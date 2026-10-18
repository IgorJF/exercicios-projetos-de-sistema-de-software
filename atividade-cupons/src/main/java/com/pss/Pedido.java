package com.pss;

/**
 *
 * @author igorj
 */

import java.time.LocalDateTime;
import java.util.List;
import java.util.ArrayList;

class Pedido {
    private double taxaEntrega = APITaxaDescontoMock.getTaxaEntregaPadrao();
    private Cliente cliente;
    private List<Item> itens = new ArrayList<>();
    private LocalDateTime data;
    private double valorTotalItens = 0;
    private List<CupomDescontoEntrega> cuponsTaxaEntrega = new ArrayList<>();
    private CupomDescontoPedido cupomDescontoPedido;
    private double valorDescontoPedido;

    public Pedido(LocalDateTime data, Cliente cliente) {
        if (data == null) {
            throw new IllegalArgumentException("Data inválida. Informe uma data válida.");
        }
        if (cliente == null) {
            throw new IllegalArgumentException("Informe um cliente válido");//nullpointerexecetion nao é o ideal por que cliente eh instaciado
        }
        this.data = data;
        this.cliente = cliente;
        this.itens = new ArrayList<>();//inicializar lista
        this.cuponsTaxaEntrega = new ArrayList<>();//inicializar lista
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<Item> getItens() {
        return itens;
    }
    
    public LocalDateTime getData(){
        return data;
    }

    public double getTaxaEntrega() {
        return taxaEntrega;
    }
    
    public void adicionarItem(Item item) {
        this.itens.add(item);
        valorTotalItens += item.getValorTotal();
    }

    public List<CupomDescontoEntrega> getCuponsDescontoEntrega() {
        return cuponsTaxaEntrega;
    }
    
    public CupomDescontoPedido getCupomDescontoPedido(){
        return cupomDescontoPedido;
    }
    
    public double getValorTotalPedido(){
        return valorTotalItens + APITaxaDescontoMock.getTaxaEntregaPadrao();
    }
    
    public double getDescontoTaxaEntrega() {
        return APITaxaDescontoMock.getTaxaEntregaPadrao() - taxaEntrega;
    }

    public void aplicarDescontoTaxaEntrega(double desconto) {
        double limite = APITaxaDescontoMock.getTaxaEntregaPadrao();
        double concedido = limite - taxaEntrega;

        double disponivel = limite - concedido;

        if (desconto > disponivel) {
            desconto = disponivel;
        }

        taxaEntrega -= desconto;
    }
    
    public void adicionarCupomDescontoPedido(CupomDescontoPedido cupom){
        this.cupomDescontoPedido = cupom;
    }
    
    public void aplicarDescontoCupomPedido(double desconto){
        this.valorDescontoPedido = desconto;
    }
    
    public double getDescontoPedido(){
        return valorDescontoPedido;
    }

    public double getValorPedidoComDesconto() {
        return getValorTotalPedido() - getDescontoPedido();
    } 
    
    public double getValorFinalPedido() {
        return getValorPedidoComDesconto() - getDescontoTaxaEntrega();
    } 
    

    @Override
    public String toString() {
        return "Cliente: " + cliente +
                "\nData: " + data +
                "\nItens: " + itens +
                "\nValor dos Itens: R$ " + valorTotalItens +
                "\nValor Total: R$ " + getValorTotalPedido() + 
                "\nCupons Utilizados: " + cuponsTaxaEntrega +
                "\nDesconto Concedido no Pedido: Cupom: " + cupomDescontoPedido + "| Valor: R$ " + getDescontoPedido() +
                "\nTaxa de Entrega: R$ " + taxaEntrega +
                "\nDesconto Concedido Taxa de Entrega: " + getDescontoTaxaEntrega() + 
                "\nValor Final do Pedido: R$ " + getValorFinalPedido() +
                "\n";
    }
}
