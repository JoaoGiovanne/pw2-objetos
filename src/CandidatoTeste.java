import java.time.LocalDate;

public class CandidatoTeste {
    public static void main(String[] args) {
        Candidato nossoCandidato = new Candidato();
        nossoCandidato.nome = "Lula";
        nossoCandidato.dataNascimento = LocalDate.of(1945, 10, 27);
        nossoCandidato.email = "LulaInaciona13CapaErraNunk@fogomeiu.com";
        nossoCandidato.celular = "(13) 91313-1313";
        nossoCandidato.escolaridade = "nao tem";
        nossoCandidato.funcao = "Presidente";
        nossoCandidato.pretencaoSalarial = 30934.70;
        nossoCandidato.empregado = true;
        nossoCandidato.estagio = false;
    }
}
