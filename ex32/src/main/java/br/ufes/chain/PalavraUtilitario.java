package br.ufes.chain;

public abstract class PalavraUtilitario {
    private PalavraUtilitario proximaPalavra;
    
    public void setProxima(PalavraUtilitario proximaPalavra) {
       this.proximaPalavra = proximaPalavra;
    }
    
    public abstract void trocarPalavra(String texto);
}
