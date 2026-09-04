public class Aluno {
    private String nome;
    private double mensalidadeBase;
    private Desconto desconto;

    public Aluno(String nome, double mensalidadeBase, Desconto desconto) {
        this.nome = nome;
        this.mensalidadeBase = mensalidadeBase;
        this.desconto = desconto;
    }

    public double calcularMensalidade() {
        return desconto.aplicar(mensalidadeBase);
    }

    public String getNome() {
        return nome;
    }
}
