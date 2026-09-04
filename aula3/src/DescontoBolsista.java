public class DescontoBolsista implements Desconto {
    @Override
    public double aplicar(double valorMensalidade) {
        return valorMensalidade * 0.5; // 50% de desconto
    }
}
