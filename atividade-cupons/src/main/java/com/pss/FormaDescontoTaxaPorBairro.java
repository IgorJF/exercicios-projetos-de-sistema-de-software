package com.pss;
/**
 *
 * @author igorj
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class FormaDescontoTaxaPorBairro implements IFormaDescontoTaxaEntrega {
    private Map<String, Double> bairroCliente;
    
    public FormaDescontoTaxaPorBairro() {
        bairroCliente = new HashMap<>();
        bairroCliente.put("Centro", 2.00);
        bairroCliente.put("Cidade Maravilhosa", 1.50);
        bairroCliente.put("Bela Vista", 3.00);
    } 
    @Override
    public Optional<CupomDescontoEntrega> calcularDesconto(Pedido pedido){
        Optional<CupomDescontoEntrega> optCupomDescontoEntrega = Optional.empty();
        String bairro = pedido.getCliente().getBairro();

        if(bairroCliente.containsKey(bairro)){
            double valor = bairroCliente.get(bairro);
            optCupomDescontoEntrega = Optional.of(new CupomDescontoEntrega("Desconto Bairro " + bairro, valor));
        }
        return optCupomDescontoEntrega;
    }
}
