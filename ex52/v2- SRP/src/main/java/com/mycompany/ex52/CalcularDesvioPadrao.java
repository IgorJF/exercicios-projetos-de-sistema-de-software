package com.mycompany.ex52;

import java.util.List;

/**
 *
 * @author igor.j.ferraz
 */
public class CalcularDesvioPadrao extends Operacao{
    
    public CalcularDesvioPadrao() {
        super("Desvio Padrao", 5);
    }
    
    @Override
    public double calcular(List<Double> numeros){
        double p1Dp = 1/Double.valueOf(numeros.size() - 1);
        double somaQuadradosDp = 0;
        for (int counter = 0; counter < numeros.size(); counter++) {
            somaQuadradosDp += Math.pow(numeros.get(counter), 2);
        }
        double somaElementosDp = 0;
        for (int counter = 0; counter < numeros.size(); counter++) {
            somaElementosDp += numeros.get(counter);
        }
        double p2Dp = somaQuadradosDp - (Math.pow(somaElementosDp, 2)/Double.valueOf(numeros.size()));
        return Math.sqrt(p1Dp * p2Dp);
    }
}
