package com.sistemaacademico;

import java.util.*;

public class Professor {

	private int id;
    private String nome;
    private List<Disciplina> disciplinas;
    
    public Professor(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.disciplinas = new ArrayList<>();
    }
    
    public int getId() {
        return id;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void adicionarDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }
    
    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }
    
    public String getHorario() {
        Set<String> horarios = new LinkedHashSet<>();
        for (Disciplina disciplina : disciplinas) {
            horarios.add(disciplina.getHorario());
        }
        return String.join(", ", horarios);
    }
} 
