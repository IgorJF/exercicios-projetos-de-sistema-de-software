package com.mycompany.ex52;

import java.util.List;

/**
 *
 * @author igor.j.ferraz
 */
public class CalcularMedia extends Operacao{
    
    public CalcularMedia() {
        super("Media Aritmetica", 0);
    }
    
    @Override
    public double calcular(List<Double> numeros){
        double total = 0;
        for (int i = 0; i < numeros.size(); i++) {
            total += numeros.get(i);
        }
        double resultado = total/numeros.size();
        return resultado;
    }
}
