
public class MenuPrincipal {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa (null, 0, null);
		Aluno p2 = new Aluno (null, 0, null);
		Professor p3 = new Professor (null, 0, null);
		Funcionario p4 = new Funcionario (null, 0, null);
		
		//Adicionar as caracteristicas das classes
		p1.setNome("Pedro");
		p2.setNome("Maria");
		p3.setNome("Cláudio");
		p4.setNome("Fabiana");
		
		p2.setIdade(18);
		p2.setSexo("F");
		
		
		
		
		
		
		
		
		//Exibir na tela
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());

	}

}
