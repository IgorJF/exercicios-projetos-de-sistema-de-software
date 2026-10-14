package br.ufes.ex1;

import br.ufes.model.Pedido;

public class Ex1 {
    public static void main(String[] args) {
        Pedido pedido1 = new Pedido("A", "B", 20);
        pedido1.iniciaPreparacao();
        pedido1.finalizarPreparacao();
        pedido1.entregarPedido();
        
        System.out.println(pedido1);
        System.out.println(pedido1.getHistorico());
    }
}
