public class Main {
    public static void main(String[] args) {
        Professor prof = new Professor("Vagner dos Santos", "12345678901", "TP2");
        Turma turma = new Turma("TP2-A", prof);

        Aluno a1 = new Aluno("João Silva", "11122233344", "2024001");
        a1.setMedia(8.5);

        Aluno a2 = new Aluno("Maria Souza", "22233344455", "2024002");
        a2.setMedia(9.2);

        turma.adicionarAluno(a1);
        turma.adicionarAluno(a2);

        System.out.println(turma);
    }
}
