
package com.mycompany.ex52;

import java.util.List;

/**
 *
 * @author igor.j.ferraz
 */
public class CalculadoraEstatistica {
    private OperacoesRepository operacoes = new OperacoesRepository();
    
    public void calcularResultados(Dado numeros){
        for (Operacao o : operacoes.getOperacoes()) {
            switch (o.getCodigo()) { 
                case 0: 
                    double total = 0;
                    for (int i = 0; i < numeros.getNumeros().size(); i++) {
                        total += numeros.getNumeros().get(i);
                    }
                    double resultado = total / numeros.getNumeros().size();
                    numeros.adicionaResultado(o.getCodigo(), resultado);
                    break;
                case 1: 
                    double totalSomatorio = 0;
                    for (int counter = 0; counter < numeros.getNumeros().size(); counter++) {
                        totalSomatorio += numeros.getNumeros().get(counter);
                    }
                    numeros.adicionaResultado(o.getCodigo(), totalSomatorio);
                    break;
                case 2: 
                    double maior = java.util.Collections.max(numeros.getNumeros());
                    numeros.adicionaResultado(o.getCodigo(), maior);
                    break;
                case 3:
                    double menor = java.util.Collections.min(numeros.getNumeros());
                    numeros.adicionaResultado(o.getCodigo(), menor);
                    break;
                case 4: 
                    double p1Var = 1/Double.valueOf(numeros.getNumeros().size() - 1);
                    double somaQuadradosVar = 0;
                    for (int counter = 0; counter < numeros.getNumeros().size(); counter++) {
                        somaQuadradosVar += Math.pow(numeros.getNumeros().get(counter), 2);
                    }
                    double somaElementosVar = 0;
                    for (int counter = 0; counter < numeros.getNumeros().size(); counter++) {
                        somaElementosVar += numeros.getNumeros().get(counter);
                    }
                    double p2Var = somaQuadradosVar - (Math.pow(somaElementosVar, 2) / Double.valueOf(numeros.getNumeros().size()));
                    numeros.adicionaResultado(o.getCodigo(), p1Var * p2Var);
                    break;
                case 5:
                    double p1Dp = 1/Double.valueOf(numeros.getNumeros().size() - 1);
                    double somaQuadradosDp = 0;
                    for (int counter = 0; counter < numeros.getNumeros().size(); counter++) {
                        somaQuadradosDp += Math.pow(numeros.getNumeros().get(counter), 2);
                    }
                    double somaElementosDp = 0;
                    for (int counter = 0; counter < numeros.getNumeros().size(); counter++) {
                        somaElementosDp += numeros.getNumeros().get(counter);
                    }
                    double p2Dp = somaQuadradosDp - (Math.pow(somaElementosDp, 2)/Double.valueOf(numeros.getNumeros().size()));
                    numeros.adicionaResultado(o.getCodigo(), Math.sqrt(p1Dp * p2Dp));
                    break;
                default:
                    break;
            }
        }
    }
}
