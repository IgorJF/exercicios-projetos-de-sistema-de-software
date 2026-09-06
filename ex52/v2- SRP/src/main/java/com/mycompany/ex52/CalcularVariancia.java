package com.mycompany.ex52;

import java.util.List;

/**
 *
 * @author igor.j.ferraz
 */
public class CalcularVariancia extends Operacao{
    
    public CalcularVariancia() {
        super("Variancia", 4);
    }
    
    @Override
    public double calcular(List<Double> numeros){
        double p1Var = 1/Double.valueOf(numeros.size() - 1);
        double somaQuadradosVar = 0;
        for (int counter = 0; counter < numeros.size(); counter++) {
            somaQuadradosVar += Math.pow(numeros.get(counter), 2);
        }
        double somaElementosVar = 0;
        for (int counter = 0; counter < numeros.size(); counter++) {
            somaElementosVar += numeros.get(counter);
        }
        double p2Var = somaQuadradosVar - (Math.pow(somaElementosVar, 2)/Double.valueOf(numeros.size()));
        return (p1Var * p2Var);
    }
}
