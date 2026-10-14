package br.ufes.model;

import java.time.LocalDateTime;

public class HistoricoPedido {
    private String nomeEstado;
    private LocalDateTime dataHoraDaMudanca;
    
    public HistoricoPedido(String nomeEstado, LocalDateTime dataHoraDaMudanca){
        this.nomeEstado = nomeEstado;
        this.dataHoraDaMudanca = dataHoraDaMudanca;
    }

    public String getNomeEstado() {
        return nomeEstado;
    }

    public LocalDateTime getDataHoraDaMudanca() {
        return dataHoraDaMudanca;
    }

    @Override
    public String toString() {
        return "nomeEstado=" + nomeEstado + ", dataHoraDaMudanca=" + dataHoraDaMudanca + '\n';
    }
    
    
}
