package Sistema;

import java.util.List;

public class Professor {

	public String nome;
	public String horario;
	public Disciplina grade;
	public int id;

	
	
	public Professor(String nome, String horario, Disciplina grade, int id) {
		this.nome = nome;
		this.horario = horario;
		this.grade = grade;
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public List<String> getGrade() {
		return grade;
	}
	public void setGrade(Disciplina disciplina) {
		this.grade = disciplina;
	}
	public void addDisciplina(Disciplina disciplina) {
		setGrade(disciplina);
	}
	public List<String> getHoraDisciplina(List<String> grade) {
		
	}
} 
