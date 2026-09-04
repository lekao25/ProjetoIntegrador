public class DescontoRegular implements Desconto {
    @Override
    public double aplicar(double valorMensalidade) {
        return valorMensalidade; // sem desconto
    }
}
