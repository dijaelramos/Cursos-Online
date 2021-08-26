
public class Gafanhoto extends Pessoa {
	private String login;
	private int totAssistido;

public Gafanhoto(String nome, int idade, String sexo, String login) {
		super(nome, idade, sexo);
		this.login = login;
		this.totAssistido = 0;
	}

//	public Gafanhoto(String nome, int idade, String sexo, String login) {
//		super(nome, idade, sexo);
//		this.login = login;
//		this.totAssistido = 0;
//	}

	public void viuMaisUm () {
		
	}

	public String isLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public int getTotAssistido() {
		return totAssistido;
	}


	public void setTotAssistido(int totAssistido) {
		this.totAssistido = totAssistido;
	}

	@Override
	public void ganharExp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return "Gafanhoto [login=" + login + ", totAssistido=" + totAssistido + "]";
	}
	
	
}
