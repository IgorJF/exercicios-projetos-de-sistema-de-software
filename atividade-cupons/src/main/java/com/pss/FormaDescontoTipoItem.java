package com.pss;

/**
 *
 * @author igorj
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

class FormaDescontoTipoItem implements IFormaDescontoTaxaEntrega {

    private Map<String, Double> descontosPorTipoItem;

    public FormaDescontoTipoItem() {
        descontosPorTipoItem = new HashMap<>();//para nao manter ordem especifica e ter relacao chave-valor
        descontosPorTipoItem.put("Alimentacao", 5.00);
        descontosPorTipoItem.put("Educacao", 2.00);
        descontosPorTipoItem.put("Lazer", 1.50);
    }

    @Override
    public Optional<CupomDescontoEntrega> calcularDesconto(Pedido pedido) {
        Optional<CupomDescontoEntrega> optCupomDescontoEntrega = Optional.empty();
        double descontoTotal = 0;

        for (Item item : pedido.getItens()) {
            String tipo = item.getTipo();
            if (descontosPorTipoItem.containsKey(tipo)) {
                descontoTotal += descontosPorTipoItem.get(tipo);
            }
        }

        if (descontoTotal > 0) {
            optCupomDescontoEntrega = Optional.of(new CupomDescontoEntrega("Desconto Item", descontoTotal));
        }
        return optCupomDescontoEntrega;
    }
}
