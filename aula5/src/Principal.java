public class Principal {
    public static void main(String[] args) {
        PainelFactory factoryAluno = new PainelAlunoFactory();
        Painel painelAluno = factoryAluno.criarPainel();
        painelAluno.exibir();

        PainelFactory factoryProfessor = new PainelProfessorFactory();
        Painel painelProfessor = factoryProfessor.criarPainel();
        painelProfessor.exibir();
    }
}
