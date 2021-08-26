
public class Aluno extends Pessoa {
	public Aluno(String nome, int idade, String sexo) {
		super(nome, idade, sexo);
		
	}


	private int mat;
	private String curso;
	
	
	public void cancelarMatr() {
		System.out.println("Matricula será cancelada");
		
	}


	public int getMat() {
		return mat;
	}


	public void setMat(int mat) {
		this.mat = mat;
	}


	public String getCurso() {
		return curso;
	}


	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	
}
