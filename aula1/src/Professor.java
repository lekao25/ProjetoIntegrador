public class Professor extends Pessoa {
    private String disciplina;

    public Professor(String nome, String cpf, String disciplina) {
        super(nome, cpf);
        setDisciplina(disciplina);
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        if (disciplina != null && !disciplina.trim().isEmpty()) {
            this.disciplina = disciplina;
        } else {
            throw new IllegalArgumentException("Disciplina não pode ser vazia.");
        }
    }

    @Override
    public String toString() {
        return super.toString() + " | Disciplina: " + disciplina;
    }
}
