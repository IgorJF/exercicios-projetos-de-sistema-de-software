package br.ufes.repository;

import br.ufes.model.Eleitor;
import java.util.ArrayList;
import java.util.List;

public class EleitorRepository {
    private List<Eleitor> eleitores;
    
    public EleitorRepository(){
        eleitores = new ArrayList<>();
    }
    
    public void adicionarEleitor(Eleitor eleitor){
        eleitores.add(eleitor);
    }

    public List<Eleitor> getEleitores() {
        return eleitores;
    }
}
