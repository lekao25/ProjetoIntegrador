public class PainelCoordenadorFactory extends PainelFactory {
    @Override
    public Painel criarPainel() {
        return new PainelCoordenador();
    }
}
