import Classes.Bolsista;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Adicionando 3 objetos de disciplinas
        Disciplina d1 = new Disciplina("MAT101", "Matemática", "2024.1");
        Disciplina d2 = new Disciplina("FIS101", "Física", "2024.1");
        Disciplina d3 = new Disciplina("QUI101", "Química", "2024.1");

        // Adicionando 3 objetos de Alunos (2 Regulares e 1 Bolsista)
        Aluno a1 = new Regular("12345678901", "João Silva", 20, "20230101");
        Aluno a2 = new Regular("23456789012", "Maria Souza", 21, "20230102");
        Aluno a3 = new Bolsista("34567890123", "Carlos Pereira", 22, "20230103");

        // Adicionando 1 objeto professor
        Professor p1 = new Professor("45678901234", "Dr. Almeida", 45, "Centro de Ciências");

        // Adicionando 2 objetos visitante
        Visitante v1 = new Visitante("56789012345", "Visitante 1", 30);
        Visitante v2 = new Visitante("67890123456", "Visitante 2", 35);

        // Adicionando o primeiro objeto turma (contendo todos os alunos, o professor e 1 disciplina)
        Turma t1 = new Turma("TURMA01", d1, p1);
        t1.adicionarAluno(a1);
        t1.adicionarAluno(a2);

        //Adicionando o segundo objeto turma (contendo todos os alunos, o professor e 1 disciplina)
        Turma t2 = new Turma("TURMA02", d2, p1);
        t2.adicionarAluno(a3);

        //Adicionando o terceiro objeto turma (contendo todos os alunos, o professor e 1 disciplina)
        Turma t3 = new Turma("TURMA03", d3, p1);
        t3.adicionarAluno(a1);
        t3.adicionarAluno(a2);
        t3.adicionarAluno(a3);

        //Imprimindo informações da turma
        System.out.println("Informações das Turmas:");
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);

        // Imprimindo na tela a informação de cada turma, seu código, o professor e 1 disciplina em cada turma criada
    }
}