package br.ufes.repository;

import br.ufes.model.Voto;
import java.util.ArrayList;
import java.util.List;

public class VotoRepository {
    private List<Voto> votos;
    
    public VotoRepository(){
        votos = new ArrayList<>();
    }
    
    public void registrarVoto(Voto voto){
        votos.add(voto);
    }

    public List<Voto> getVotos() {
        return votos;
    }
}
