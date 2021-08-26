
public class MenuPrincipal {

	public static void main(String[] args) {
	
		//Polimofismo de Sobrecarga
		
		//Funções com comandos iguais mas respostas diferentes
		Cachorro c = new Cachorro ();
		c.reagir("Cheguei"); //String
		c.reagir("Vai apanhar"); //String
		c.reagir(11,45); // 2 inteiros
		c.reagir(21,00); // 2 inteiros
		c.reagir(true); // Bolenano
		c.reagir(false); //Boleano
		c.reagir(2,12.5f); // Inteiro e Real
		c.reagir(17,4.5f); // Inteiro e Real

	}

}
