import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        List<Aluno> alunos = new ArrayList<>();
        alunos.add(new Aluno("Maria", 500.0, new DescontoBolsista()));
        alunos.add(new Aluno("João", 500.0, new DescontoRegular()));

        for (Aluno aluno : alunos) {
            System.out.printf("Aluno: %s | Mensalidade: R$ %.2f%n",
                    aluno.getNome(), aluno.calcularMensalidade());
        }
    }
}
