package com.mycompany.ex52;

import java.util.List;

/**
 *
 * @author igor.j.ferraz
 */
public class CalcularSomatorio extends Operacao{
    
    public CalcularSomatorio() {
        super("Somatorio", 1);
    }
    
    @Override
    public double calcular(List<Double> numeros){
        double total = 0;
        for (int counter = 0; counter < numeros.size(); counter++) {
            total += numeros.get(counter);
        }
        return total;
    }
}
