package com.mycompany.ex52;

import java.util.List;

/**
 *
 * @author igor.j.ferraz
 */
public class Ex52 {
    public static void main(String[] args) {
        List<Double> listaNumeros = List.of(3.0,7.0,8.0,1.0,2.0);
        Dado dado = new Dado(listaNumeros);
        
        CalculadoraEstatistica calculadora = new CalculadoraEstatistica();
        
        calculadora.calcularResultados(dado);
        
        System.out.println(dado.getResultadoEscolhido(0));
        
    }
}
