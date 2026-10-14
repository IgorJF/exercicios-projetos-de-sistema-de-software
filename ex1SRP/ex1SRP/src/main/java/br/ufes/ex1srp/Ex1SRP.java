package br.ufes.ex1srp;

import br.ufes.model.Candidato;
import br.ufes.model.Eleitor;
import br.ufes.repository.CandidatoRepository;
import br.ufes.repository.EleitorRepository;
import br.ufes.repository.VotoRepository;
import br.ufes.service.SistemaVotacao;

public class Ex1SRP {
    public static void main(String[] args) {
        CandidatoRepository candidatos = new CandidatoRepository(); 
        EleitorRepository eleitores = new EleitorRepository();
        VotoRepository votos = new VotoRepository();
        
        SistemaVotacao sistema = new SistemaVotacao(eleitores, candidatos, votos);
        
        sistema.adicionarCandidato(new Candidato("Lula", 13));
        sistema.adicionarCandidato(new Candidato("Flavio", 22));
        sistema.adicionarCandidato(new Candidato("Renan", 14));
        
        sistema.adicionarEleitor(new Eleitor("A", "1ES", "B"));
        sistema.adicionarEleitor(new Eleitor("C", "1RJ", "D"));
        sistema.adicionarEleitor(new Eleitor("E", "1MG", "F"));
        sistema.adicionarEleitor(new Eleitor("G", "1SP", "H"));
        sistema.adicionarEleitor(new Eleitor("I", "1PR", "J"));
        sistema.adicionarEleitor(new Eleitor("K", "1SC", "L"));
        
        sistema.registrarVoto("1ES", "B", 13);
        sistema.registrarVoto("1RJ", "D", 22);
        sistema.registrarVoto("1MG", "F", 13);
        sistema.registrarVoto("1SP", "H", 22);
        sistema.registrarVoto("1PR", "J", 13);
        sistema.registrarVoto("1SC", "L", 14);
        
        sistema.apurarResultados();
        System.out.println(sistema.mostrarResultados());
    }
}
