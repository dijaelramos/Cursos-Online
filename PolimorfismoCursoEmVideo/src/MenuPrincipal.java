
public class MenuPrincipal {

	public static void main(String[] args) {
	Mamifero m = new Mamifero ();
	Reptil r = new Reptil ();
	Peixe p = new Peixe ();
	Ave a = new Ave ();
	Canguru c = new Canguru ();
	Cachorro k = new Cachorro ();
	Cobra j = new Cobra ();
	Tartaruga t = new Tartaruga ();
	GoldFish g = new GoldFish ();
	Arara e = new Arara ();
	
		
	m.setPeso(35.3f);
	m.setCorPelo("Marrom");
	m.alimentar();
	m.emitirSom();
	
	m.locomover();
	r.locomover();
	p.locomover();
	a.locomover();
	c.locomover();
	k.locomover();
	j.locomover();
	t.locomover();
	g.locomover();
	e.locomover();
	
	
	k.emitirSom();
	c.emitirSom();

	}

}
