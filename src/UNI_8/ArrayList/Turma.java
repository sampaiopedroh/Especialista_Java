package UNI_8.ArrayList;

import java.util.AbstractList;
import java.util.ArrayList;

public class Turma {
    String identificacao;
    String nomeProfessora;
    AbstractList<Aluno> alunos = new ArrayList<>();

    void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    // Iterando
    void imprimirListaDeAlunos() {
        for (int i = 0; i < alunos.size(); i++) {
            Aluno aluno = alunos.get(i);
            if (aluno != null) {
                System.out.printf("%d - %s (%d anos)%n", i + 1, aluno.nome, aluno.idade);
            }
            else {
                System.out.printf("%d - vago%n", i + 1);
            }
        }
    }

    void removerAluno(int indice) {
        alunos.remove(indice);
    }
}
