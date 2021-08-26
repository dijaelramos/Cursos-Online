package online;

import java.util.Scanner;

public class Aula_35 {

	public static void main(String[] args) {

		final int TOTAL_ALUNOS = 4;
		final int TOTAL_BIMESTRE = 4;
		final double NOTA_MINIMA = 70.0;
		
		Scanner input = new Scanner(System.in);
		String[] nomeAlunos = new String[TOTAL_ALUNOS];
		double[][] notaAlunos = new double[TOTAL_ALUNOS][TOTAL_BIMESTRE];
		double[] mediaAlunos = new double[TOTAL_ALUNOS];

		//Nome dos alunos:
		for(int i=0; i<TOTAL_ALUNOS; ++i) {
			System.out.println("Informe o nome do " + (i+1) + 
					"° Aluno:");
			nomeAlunos[i] = input.nextLine();
		}
		
		System.out.println("");
		
		//Obter as notas dos Alunos de cada Bimestre:
		for(int i=0; i<TOTAL_ALUNOS; ++i) {
			for(int j=0; j<TOTAL_BIMESTRE; ++j) {
				System.out.println("Insira a nota do Aluno: " +nomeAlunos[i]
				+ " para o " + (j+1) + "° Bimestre.");
				notaAlunos[i][j] = input.nextDouble();
			}			
		}
		
		//calcular media dos Alunos
		for(int i=0; i<TOTAL_ALUNOS; ++i) {
			for(int j=0; j<TOTAL_BIMESTRE; ++j) {
				mediaAlunos[i] += notaAlunos[i][j];
			}
			mediaAlunos[i] /= TOTAL_BIMESTRE;
		}
		
		//Mostrar a situação dos Alunos
		System.out.println("===== RESULTADO FINAL DO ALUNOS =====");
		
		for(int i =0; i<TOTAL_ALUNOS; ++i) {
			
			if(mediaAlunos[i] >= NOTA_MINIMA) {
				System.out.println("Nome " + nomeAlunos[i] + " | Média:"
						+ mediaAlunos[i] + " | Situação: APROVADO");
				continue;
			}
			System.out.println("Nome " + nomeAlunos[i] + " | Média:"
					+ mediaAlunos[i] + " | Situação: REPROVADO");
		}
	}
}