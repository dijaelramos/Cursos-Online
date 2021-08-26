package onlineCombateEmojiCursoEmVideo;

import java.util.Random;

public class Luta {
	//Atributos
	private Lutador desafiado;
	private Lutador desafiante;
	private int rouds;
	private boolean aprovada;	
	
	//Metodos P�blicos
	public void marcarLuta(Lutador l1, Lutador l2) {
		if (l1.getCategoria().equals(l2.getCategoria()) 
				&& l1 != l2) {
			this.aprovada = true;
			this.desafiado = l1;
			this.desafiante = l2;
		} else {
			this.aprovada = false;
			this.desafiado = null;
			this.desafiante = null;
		}
		
	}
	public void lutar () {
		if (this.aprovada) {
			System.out.println("=== DESAFIADO ===");
			this.desafiado.apresentar();
			System.out.println("=== DESAFIANTE ===");
			this.desafiante.apresentar();
			
			Random aleatorio = new Random();
			int vencedor = aleatorio.nextInt(3); // 0 1 2
			System.out.println("============= RESULTADO DA LUTA =============");
			switch (vencedor) {
				case 0: //Empate
					System.out.println("Empataram!");
					this.desafiado.empatarLuta();
					this.desafiante.empatarLuta();
					break;
				case 1: //Desafiado Vence
					System.out.println("Vitoria do " + this.desafiado.getNome());
					this.desafiado.ganharLuta();
					this.desafiante.perderLuta();
					break;
				case 2: //Desafiante Vence
					System.out.println("Vit�ria do " + this.desafiante.getNome());
					this.desafiante.ganharLuta();
					this.desafiado.perderLuta();
					break;
			}
			
		} else {
			System.out.println("A luta n�o pode acontecer!");
		}
		
	}
	//Metodos Especiais
	public Lutador getDesafiado() {
		return desafiado;
	}
	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}
	public Lutador getDesafiante() {
		return desafiante;
	}
	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}
	public int getRouds() {
		return rouds;
	}
	public void setRouds(int rouds) {
		this.rouds = rouds;
	}
	public boolean isAprovada() {
		return aprovada;
	}
	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}	
}
