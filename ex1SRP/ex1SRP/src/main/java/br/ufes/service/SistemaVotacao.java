package br.ufes.service;

import br.ufes.model.Candidato;
import br.ufes.model.Eleitor;
import br.ufes.model.Voto;
import br.ufes.repository.CandidatoRepository;
import br.ufes.repository.EleitorRepository;
import br.ufes.repository.VotoRepository;

public class SistemaVotacao {
    private EleitorRepository eleitores;
    private CandidatoRepository candidatos;
    private VotoRepository votos;
    private AutenticarEleitorService autenticarEleitor;
    private ApurarResultadosService apurarResultado;
    
    public SistemaVotacao(EleitorRepository eleitores, CandidatoRepository candidatos, VotoRepository votos){
        this.eleitores = eleitores;
        this.candidatos = candidatos;
        this.votos = votos;
        autenticarEleitor = new AutenticarEleitorService();
        apurarResultado = new ApurarResultadosService(votos.getVotos(), candidatos.getCandidatos());
    }
    
    public void registrarVoto(String cpf, String senha, int num){
        for(Eleitor eleitor : eleitores.getEleitores()){
            if(autenticarEleitor.autenticarEleitor(cpf, senha, eleitor)){
                votos.registrarVoto(new Voto(eleitor, num));
            }
        }
    }
    
    public void adicionarEleitor(Eleitor eleitor){
        eleitores.adicionarEleitor(eleitor);
    }
    
    public void adicionarCandidato(Candidato candidato){
        candidatos.adicionarCandidato(candidato);
    }
    
    public void apurarResultados(){
        apurarResultado.contarVotosPorCandidato();
    }
    
    public String mostrarResultados(){
        return apurarResultado.toString();
    }
}
