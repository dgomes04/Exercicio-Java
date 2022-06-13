package lista3;

import java.util.Scanner;

public class atividade5 {


	public static void escola(double media) {
	
		//Verificação de conceito
		if(media<=39) {
			System.out.println("Conceito F");
		} else if(media>=40 && media<=59) {
			System.out.println("Conceito E");
		}else if(media>=60 && media <=69) {
			System.out.println("Conceito D");
		}else if(media>=70 && media <=79) {
			System.out.println("Conceito C");
		}else if(media>=80 && media <=89) {
			System.out.println("Conceito B");
		}else {
			System.out.println("Conceito A");
		}
	}

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int n;
		double media;

		System.out.println("Digite o valor de N:");
		n = ent.nextInt();

		//Valor limite N sendo apenas 1 nota por aluno
		for(int alunos=0; alunos<=n;alunos++) {
			System.out.println("Digite a sua média:");
			media = ent.nextDouble();
			

			escola(media);
		}
		ent.close();
	}

}
