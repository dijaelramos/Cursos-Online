package online;

import java.util.Scanner;

public class Aula_37 {

	public static void main(String[] args) {
		
		double areaRetangulo = retangulo();
		
		System.out.println(areaRetangulo);

	}
	
public static double retangulo() {
		
		Scanner input = new Scanner(System.in);
		double base, altura, areaRetangulo, areaTotal = 0;
		
		System.out.println("Informe a base do Retângulo");
		base = input.nextDouble();
		System.out.println("Informe a altura do Retângulo");
		altura = input.nextDouble();
		
		areaRetangulo = base*altura;
		
		return areaRetangulo;
	}

}
