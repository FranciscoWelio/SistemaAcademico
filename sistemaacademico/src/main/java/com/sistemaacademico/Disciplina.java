package com.sistemaacademico;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
	
	private String nome;
    private String horario;
    private List<Aluno> alunos;
    private Professor professor;
    
    public Disciplina(String nome, String horario, Professor professor) {
        this.nome = nome;
        this.horario = horario;
        this.professor = professor;
        this.alunos = new ArrayList<>();
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getHorario() {
        return horario;
    }
    
    public Professor getProfessor() {
        return professor;
    }
    
    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }
    
    public List<Aluno> getAlunos() {
        return alunos;
    }
    
    public int getNumeroDeAlunos() {
        return alunos.size();
    }
}
