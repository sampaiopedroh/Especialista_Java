package UNI_8.ArraysDeObjetos;

public class Turma {
    String identificacao;
    String nomeProfessora;
    // Ao invés disso:
    // String[] nomesAlunos;
    // int[] idadeAlunos;

    // Use isso:
    Aluno[] alunos;

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
