package br.ufes.state;

import br.ufes.model.Pedido;

public class PedidoEmPreparoState extends PedidoState{
    public PedidoEmPreparoState(Pedido pedido) {
        super(pedido);
    }
    
    @Override
    public void finalizarPreparo(){
        System.out.println("Pedido mudando para pronto");
    }
}
