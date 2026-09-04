public class Aluno extends Pessoa {
    private String matricula;
    private double media;

    public Aluno(String nome, String cpf, String matricula) {
        super(nome, cpf);
        setMatricula(matricula);
        this.media = 0.0;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        if (matricula != null && !matricula.trim().isEmpty()) {
            this.matricula = matricula;
        } else {
            throw new IllegalArgumentException("Matrícula não pode ser vazia.");
        }
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        if (media >= 0 && media <= 10) {
            this.media = media;
        } else {
            throw new IllegalArgumentException("Média deve estar entre 0 e 10.");
        }
    }

    @Override
    public String toString() {
        return super.toString() + " | Matrícula: " + matricula + " | Média: " + media;
    }
}
