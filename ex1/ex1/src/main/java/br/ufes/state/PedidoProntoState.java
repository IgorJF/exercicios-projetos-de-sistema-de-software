package br.ufes.state;

import br.ufes.model.Pedido;

public class PedidoProntoState extends PedidoState{
    public PedidoProntoState(Pedido pedido) {
        super(pedido);
    }
    
    @Override
    public void entregar(){
        System.out.println("Pedido para sair para entrega");
    }
}
