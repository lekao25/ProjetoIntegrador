import java.util.ArrayList;
import java.util.List;

public class Turma {
    private String codigo;
    private Professor professor;
    private List<Aluno> alunos;

    public Turma(String codigo, Professor professor) {
        setCodigo(codigo);
        this.professor = professor;
        this.alunos = new ArrayList<>();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        if (codigo != null && !codigo.trim().isEmpty()) {
            this.codigo = codigo;
        } else {
            throw new IllegalArgumentException("Código da turma não pode ser vazio.");
        }
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void adicionarAluno(Aluno aluno) {
        if (aluno != null) {
            alunos.add(aluno);
        }
    }

    public void removerAluno(Aluno aluno) {
        alunos.remove(aluno);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Turma: ").append(codigo).append(" | Professor: ").append(professor.getNome()).append("\n");
        sb.append("Alunos:\n");
        for (Aluno a : alunos) {
            sb.append(" - ").append(a).append("\n");
        }
        return sb.toString();
    }
}
