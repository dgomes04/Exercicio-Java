package lista3;

import java.util.Scanner;

public class atividade9 {
	//Retorna valor Double
	public static double media(double n) {
		@SuppressWarnings("resource")
		Scanner ent = new Scanner(System.in);
		double notas;
		int aprovados=0;
		
		//Faz uma nota apenas por aluno e verifica se ele passou ou não na média
		for(int limite =1;limite<=n;limite++) {
			System.out.println("Digite a sua nota:");
			notas = ent.nextDouble();
			if(notas>=6) {
				aprovados++;
			}
	
		}
		return((aprovados*100)/n);
	}

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int alunos;
		
		//Limite de alunos
		System.out.println("Forneça a quantidade de alunos:");
		alunos = ent.nextInt();
		
		//Print de resultados
		System.out.printf("A média de alunos aprovados foi de: %.2f \n " , media(alunos));

		ent.close();
	}
	
	
	
	
			

}



















