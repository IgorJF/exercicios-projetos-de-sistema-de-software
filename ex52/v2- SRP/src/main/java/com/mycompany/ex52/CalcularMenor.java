package com.mycompany.ex52;

import java.util.List;

/**
 *
 * @author igor.j.ferraz
 */
public class CalcularMenor extends Operacao {
    
    public CalcularMenor() {
        super("Menor", 2);
    }
    
    @Override
    public double calcular(List<Double> numeros){
        return java.util.Collections.max(numeros);
    }
}
