package com.mycompany.ex52;

import java.util.List;

/**
 *
 * @author igor.j.ferraz
 */
public class Ex52 {
    public static void main(String[] args) {
        List<Double> listaNumeros = List.of(3.0,7.0,8.0,1.0,2.0);
        List<Operacao> listaDeOperacoes = List.of(
            new CalcularMedia(),
            new CalcularSomatorio(),
            new CalcularMaior(),
            new CalcularMenor(),
            new CalcularVariancia(),
            new CalcularDesvioPadrao()
        );
        Dado listaDados = new Dado(listaNumeros);
        
        CalculadoraEstatistica calculadora = new CalculadoraEstatistica(listaDeOperacoes);
        calculadora.calcularResultados(listaDados.getNumeros());
        
        System.out.println(listaDados.getResultadoEscolhido(0));
    }
}
