package com.mycompany.ex52;

import java.util.List;

/**
 *
 * @author igor.j.ferraz
 */
public class CalcularMaior extends Operacao{
    
    public CalcularMaior() {
        super("Maior", 3);
    }
    
    @Override
    public double calcular(List<Double> numeros){
        return java.util.Collections.min(numeros);
    }
}
