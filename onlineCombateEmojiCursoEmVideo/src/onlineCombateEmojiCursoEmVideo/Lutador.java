package onlineCombateEmojiCursoEmVideo;

public class Lutador {
	//Atributos
	private String nome; 
	private String nacionalidade;
	private int idade;
	private float altura;
	private float peso;
	private String Categoria;
	private int vitorias, derrotas, empate;
	
	//Metodos plublicos:
	public void apresentar() {
		System.out.println("=============================================");
		System.out.println("Apresentamos o Lutador: " + this.getNome());
		System.out.println("Diretamente de " + this.getNacionalidade());
		System.out.println("com " + this.getIdade() + " anos e " + this.getAltura() + "m de altura");
		System.out.println("pesando " + this.getPeso() + "Kg");
		System.out.println(this.getVitorias() + " vitorias");
		System.out.println(this.getDerrotas() + " derrotas");
		System.out.println(this.getEmpate() + " empates!");
		System.out.println("=============================================");
		
	}
	public void  status() {
		System.out.println("=============================================");
		System.out.println(this.getNome() + " lutador de Categoria: " + this.getCategoria());
		System.out.println("Ganhou: " + this.getVitorias() + " vezes");
		System.out.println("Perdeu: " + this.getDerrotas() + " vezes");
		System.out.println("Empatou: " + this.getEmpate() + " vezes");
		System.out.println("=============================================");
	}
	public void  ganharLuta() {
		this.setVitorias(getVitorias() + 1); 
		
	}
	public void perderLuta() {
		this.setDerrotas(this.getDerrotas() + 1);
		
	}
	public void empatarLuta() {
		this.setEmpate(this.getEmpate() + 1);
		
	}
		
	//Metodos Especiais:
	public Lutador(
	String no, String na, int id, float al, float pe, int vi, int de, int em) {
		
		this.nome = no;
		this.nacionalidade = na;
		this.idade = id;
		this.altura = al;
		this.setPeso(pe);
		this.vitorias = vi;
		this.derrotas = de;
		this.empate = em;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
		this.setCategoria();
	}
	public String getCategoria() {
		return Categoria;
	}
	private void setCategoria() {
		if (this.peso < 52.2) {
			this.Categoria = "Inválido";
		} else if (this.peso <= 70.3) {
			this.Categoria = "Leve";
		} else if (this.peso <= 83.9) {
			this.Categoria = "Médio";
		} else if (this.peso <=120.2) {
			this.Categoria = "Pesado";
		} else {
			this.Categoria = "Inválido";
		}
	}
	public int getVitorias() {
		return vitorias;
	}
	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}
	public int getDerrotas() {
		return derrotas;
	}
	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}
	public int getEmpate() {
		return empate;
	}
	public void setEmpate(int empate) {
		this.empate = empate;
	}
}
