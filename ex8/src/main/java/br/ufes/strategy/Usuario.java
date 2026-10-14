package br.ufes.strategy;

public class Usuario implements IUsuario{
    private boolean autenticado = false;
    
    @Override
    public boolean isAutenticado() {
        if(autenticado == true){
            return true;
        }
        return false;
    }

    @Override
    public void setAutenticado(boolean autenticado) {
        this.autenticado = autenticado;
    }

    @Override
    public String toString() {
        return "Usuario{" + "autenticado=" + autenticado + '}';
    }
}
