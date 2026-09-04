public class PainelAlunoFactory extends PainelFactory {
    @Override
    public Painel criarPainel() {
        return new PainelAluno();
    }
}
