package br.ufes.repository;

import br.ufes.model.Candidato;
import java.util.ArrayList;
import java.util.List;

public class CandidatoRepository {
    private List<Candidato> candidatos;
    
    public CandidatoRepository(){
        candidatos = new ArrayList<>();
    }
    
    public void adicionarCandidato(Candidato candidato){
        candidatos.add(candidato);
    }

    public List<Candidato> getCandidatos() {
        return candidatos;
    }
}
