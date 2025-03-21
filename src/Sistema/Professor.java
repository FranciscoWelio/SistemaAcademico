package Sistema;

import java.util.List;

public class Professor {

	public String nome;
	public String horario;
	public List<Disciplina> grade;
	public int id;

	
	
	public Professor(String nome, String horario, List<Disciplina> grade, int id) {
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
	
	public List<Disciplina> getGrade() {
		return grade;
	}
	public void setGrade(List<Disciplina> disciplina) {
		this.grade = disciplina;
	}
	public void addDisciplina(List<Disciplina> disciplina) {
		setGrade(disciplina);
	}
	public void getHoraDisciplina(List<String> grade) {
		
	}
} 
