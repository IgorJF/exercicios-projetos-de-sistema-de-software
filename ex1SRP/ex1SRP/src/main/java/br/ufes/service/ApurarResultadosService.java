package br.ufes.service;

import br.ufes.model.Candidato;
import br.ufes.model.Voto;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ApurarResultadosService {
    private List<Voto> votos;
    private List<Candidato> candidatos;
    private Map<Candidato, Integer> apuracao;
    
    public ApurarResultadosService(List<Voto> votos, List<Candidato> candidatos){
        this.votos = votos;
        this.candidatos = candidatos;
        apuracao = new HashMap<>();
    }
    
    public void contarVotosPorCandidato(){
        for(Candidato candidato : candidatos){
            int cont = 0;
            for(Voto voto : votos){
                if(voto.getNumVotado() == candidato.getNum()){
                    cont++;       
                }
            }
            apuracao.put(candidato, cont);
        }
    }

    public Map<Candidato, Integer> getApuracao() {
        return apuracao;
    }

    @Override
    public String toString() {
        return "Candidatos: \n" + 
               "{candidato, votos}\n " + 
                apuracao + "\n";
    }
}
