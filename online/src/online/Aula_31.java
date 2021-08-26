package online;

import java.util.Scanner;

public class Aula_31 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int numAlunos = 5;
		double[] notaAlunos = new double[numAlunos];

		for (int i = 0; i < numAlunos; ++i) {
			System.out.println("insira a nota do " + (i + 1) + "ª Aluno: ");
			notaAlunos[i] = input.nextDouble();
		}
		for (int i = 0; i < numAlunos; ++i) {
			System.out.println("A nota do " + (i + 1) + "ª Aluno foi de: " + notaAlunos[i]);
		}

	}
}