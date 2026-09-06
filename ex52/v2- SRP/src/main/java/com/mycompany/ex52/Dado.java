
package com.mycompany.ex52;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author igor.j.ferraz
 */
public class Dado {
    private List<Double> numeros;
    private Resultado resultado;
    
    public Dado(List<Double> numeros) {
        this.numeros = numeros;
        resultado = new Resultado();
    }
    
    public List<Double> getNumeros(){
        return numeros;
    }  
}
