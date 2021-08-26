
public class MenuPrincipal {

	public static void main(String[] args) {
		
		//Classe Aluno
		Aluno a1 = new Aluno ();
		a1.setNome("Cláudio");
		a1.setMatricula(1111);
		a1.setCurso("Informática");
		a1.setIdade(16);
		a1.setSexo("M");
		a1.pagarMensalidade();
		System.out.println(a1.toString());
		
		
		
		//Classe Bolsista
		Bolsista b1 = new Bolsista ();
		b1.setMatricula(22222);
		b1.setNome("Jubileu");
		b1.setBolsa(12.5f);
		b1.setSexo("M");
		
		//Pagar mensalidade duplicada por conta do @Override
		b1.pagarMensalidade();
		System.out.println(b1.toString());
		
		
	}

}
