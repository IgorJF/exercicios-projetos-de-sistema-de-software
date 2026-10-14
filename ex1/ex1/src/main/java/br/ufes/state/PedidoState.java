package br.ufes.state;

import br.ufes.model.Pedido;

public abstract class PedidoState {
    private Pedido pedido;
    
    public PedidoState(Pedido pedido){
        this.pedido = pedido;
    }
    
    public void preparar(){
        throw new RuntimeException("Nao e possivel preparar no estado de " + getNomeEstado());
    }
    public void finalizarPreparo(){
        throw new RuntimeException("Nao e possivel finalizar preparo no estado de " + getNomeEstado());
    }
    public void entregar(){
        throw new RuntimeException("Nao e possivel entregar no estado de " + getNomeEstado());
    }
    
    public String getNomeEstado(){
        return this.getClass().getSimpleName();
    }
}
