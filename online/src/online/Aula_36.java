package online;

import java.util.Scanner;

public class Aula_36 {

	public static void main(String[] args) {
	
		retangulo();
		retangulo();
		retangulo();
		
		
	}
	
	public static void retangulo() {
		
		Scanner input = new Scanner(System.in);
		double base, altura, areaRetangulo, areaTotal = 0;
		
		System.out.println("Informe a base do Ret�ngulo");
		base = input.nextDouble();
		System.out.println("Informe a altura do Ret�ngulo");
		altura = input.nextDouble();
		
		areaRetangulo = base*altura;
		
		System.out.println("A �rea do ret�ngulo � de: " + areaRetangulo);
		
		areaTotal += areaRetangulo;
	}

}
