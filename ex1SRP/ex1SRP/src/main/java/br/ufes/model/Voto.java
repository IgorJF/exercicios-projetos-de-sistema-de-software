package br.ufes.model;

public class Voto {
    private Eleitor eleitor;
    private int numVotado;
    
    public Voto(Eleitor eleitor, int numVotado){
        this.eleitor = eleitor;
        this.numVotado = numVotado;
    }

    public Eleitor getEleitor() {
        return eleitor;
    }

    public int getNumVotado() {
        return numVotado;
    }
}
