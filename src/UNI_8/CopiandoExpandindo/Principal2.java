package UNI_8.CopiandoExpandindo;

public class Principal2 {
    public static void main(String[] args) {
        Turma turmaB = new Turma();
        turmaB.identificacao = "Maternal B";
        turmaB.nomeProfessora = "Tia Maria";

        Aluno aluno1 = new Aluno();
        aluno1.nome = "Laura";
        aluno1.idade = 4;

        Aluno aluno2 = new Aluno();
        aluno2.nome = "Pedro";
        aluno2.idade = 4;

        turmaB.adicionarAluno(aluno1);
        turmaB.imprimirListaDeAlunos();

        System.out.println();

        turmaB.adicionarAluno(aluno2);
        turmaB.imprimirListaDeAlunos();
    }
}
