package Sistema;
import java.util.List;
public class Disciplina {

	public String nome;
	public String horario;

	public Disciplina(String nome, String horario) {
		super();
		this.nome = nome;
		this.horario = horario;
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
	
	public void addAluno(List<String> aluno) {
		aluno.add(nome);
 	}
	public int countAluno(List<String> aluno) {
		return aluno.size();
		
	}
	public List<String> quaisAlunos(List<String> aluno){
		return aluno;
	}
}
	