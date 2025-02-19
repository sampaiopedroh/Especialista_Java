package UNI_8.RemovendoElementos;

import java.util.Arrays;

public class Turma {
    String identificacao;
    String nomeProfessora;
    // Ao invés disso:
    // String[] nomesAlunos;
    // int[] idadeAlunos;

    // Use isso:
    Aluno[] alunos = new Aluno[0];

    void adicionarAluno(Aluno aluno) {
        this.alunos = Arrays.copyOf(this.alunos, this.alunos.length + 1);
        alunos[alunos.length - 1] = aluno;
    }

    // Iterando
    void imprimirListaDeAlunos() {
        for (int i = 0; i < alunos.length; i++) {
            Aluno aluno = alunos[i];
            if (aluno != null) {
                System.out.printf("%d - %s (%d anos)%n", i + 1, aluno.nome, aluno.idade);
            }
            else {
                System.out.printf("%d - vago%n", i + 1);
            }
        }
    }
}
