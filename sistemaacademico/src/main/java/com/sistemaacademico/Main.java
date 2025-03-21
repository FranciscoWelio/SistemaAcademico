package com.sistemaacademico;


public class Main {

	public static void main(String[] args) {
        Professor prof1 = new Professor(1, "Dr. Silva");
        Professor prof2 = new Professor(2, "Dra. Souza");
        
        Disciplina d1 = new Disciplina("Matemática", "08:00 - 10:00", prof1);
        Disciplina d2 = new Disciplina("História", "10:00 - 12:00", prof2);
        
        prof1.adicionarDisciplina(d1);
        prof2.adicionarDisciplina(d2);
        
        Aluno a1 = new Aluno(101, "Carlos");
        Aluno a2 = new Aluno(102, "Ana");
        
        d1.adicionarAluno(a1);
        d1.adicionarAluno(a2);
        d2.adicionarAluno(a1);
        
        a1.adicionarDisciplina(d1);
        a1.adicionarDisciplina(d2);
        a2.adicionarDisciplina(d1);
        
     // Exibindo informações
        System.out.println("Disciplinas ministradas por " + prof1.getNome() + ": " + d1.getNome());
        System.out.println("Horário do Professor: " + prof1.getHorario());
        System.out.println("Alunos de " + d1.getNome() + ":");
        for (Aluno aluno : d1.getAlunos()) {
            System.out.println("- " + aluno.getNome());
        }
        System.out.println("Número de alunos na disciplina: " + d1.getNumeroDeAlunos());
        System.out.println("Disciplinas do aluno " + a1.getNome() + ": ");
        for (Disciplina disc : a1.getDisciplinas()) {
            System.out.println("- " + disc.getNome());
        }
        System.out.println("Horário do Aluno: " + a1.getHorario());
    }

}
