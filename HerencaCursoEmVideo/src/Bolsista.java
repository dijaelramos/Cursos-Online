
public class Bolsista extends Aluno {
	private float bolsa;
	
	public void renovarBolsa () {
		System.out.println("Ronovando bolsa de " + 
	this.getNome());
	}
	
	@Override
	public void pagarMensalidade () {
		System.out.println(this.getNome() + 
				" é bolsista! Pagamento ok!");
	}

	public float getBolsa() {
		return bolsa;
	}

	public void setBolsa(float bolsa) {
		this.bolsa = bolsa;
	}
}
