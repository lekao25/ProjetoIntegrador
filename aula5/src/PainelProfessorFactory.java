public class PainelProfessorFactory extends PainelFactory {
    @Override
    public Painel criarPainel() {
        return new PainelProfessor();
    }
}
