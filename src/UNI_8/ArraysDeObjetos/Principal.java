package UNI_8.ArraysDeObjetos;

public class Principal {
    public static void main(String[] args) {
        Turma turmaB = new Turma();
        turmaB.identificacao = "Maternal B";
        turmaB.nomeProfessora = "Tia Maria";
        turmaB.alunos = new Aluno[3];

        // Maneira de atribuir valores a uma array de objeto
        turmaB.alunos[0] = new Aluno();
        turmaB.alunos[0].nome = "João";
        turmaB.alunos[0].idade = 3;

        // Outra maneira
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Laura";
        aluno1.idade = 4;
        turmaB.alunos[1] = aluno1;

        turmaB.imprimirListaDeAlunos();
    }
}
