package application;

import java.util.Scanner;

import entities.Aluno;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Nome do aluno: ");
		String nome = scan.nextLine();
		Aluno aluno = new Aluno(nome);

		System.out.println("1° nota: ");
		double nota1 = scan.nextDouble();
		System.out.println("2° nota: ");
		double nota2 = scan.nextDouble();
		System.out.println("3° nota: ");
		double nota3 = scan.nextDouble();

		System.out.println();

		aluno.resultado(nota1, nota2, nota3);

		if (aluno.getNotaFinal() >= 60) {
			System.out.printf("Aluno %s foi APROVADO\nMedia: %.2f ", aluno.getNome(), aluno.getNotaFinal());
		} else {
			System.out.printf("Aluno %s foi REPROVADO\nMedia %.2f", aluno.getNome(), aluno.getNotaFinal());
			System.out.printf("\nNota negativa: %.2f", (aluno.getNotaFinal() - 60));
		}

		scan.close();

	}

}
