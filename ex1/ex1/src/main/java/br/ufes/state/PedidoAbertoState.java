package br.ufes.state;

import br.ufes.model.Pedido;

public class PedidoAbertoState extends PedidoState{
    public PedidoAbertoState(Pedido pedido) {
        super(pedido);
    }
    
    @Override
    public void preparar(){
        System.out.println("Pedido em preparacao");
    }
}
