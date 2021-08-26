package onlineAula42;

public class MenuDaTelevisao {

	public static void main(String[] args) {

		TV televisao1 = new TV();
		
	System.out.println("Essa televisão é da marca: "+televisao1.fabricante+
		". A televisão está "+(televisao1.ligado == true ? "ligada" :"desligada")+
		". O volume esta em "+televisao1.volume);
		
		televisao1.ligar();
		televisao1.aumentarVolume();
		televisao1.aumentarVolume();
		televisao1.aumentarVolume();

	System.out.println("Essa televisão é da marca: "+televisao1.fabricante+
	". A televisão está "+(televisao1.ligado == true ? "ligada" :"desligada")+
	". O volume esta em "+televisao1.volume);
		
	}

}
