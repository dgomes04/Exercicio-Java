package lista3;

import java.util.Scanner;

public class atividade1 {


	public static void notas(double a, double b, double c, char letra) {
		//calculo das médias:
		switch(letra) {
		case 'a':
			System.out.println("A sua média aritimética é: "+ (a+b+c)/3);
			break;
		case 'p':
			System.out.println("A sua média ponderada é: "+ ((a*5)+(b*3)+(c*2)/(5+3+2)));
			break;

		}
		
		
	
	}

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		char op;
		double n1,n2,n3;
		int n;
		
		//limite da repetição
		System.out.println("Digite quantos alunos terão:");
		n = ent.nextInt();

		for(int limiteAlunos=0;limiteAlunos<=n;limiteAlunos++) {

			System.out.println("Digite a sua primeira nota:");
			n1 = ent.nextDouble();
			System.out.println("Digite a sua segunda nota:");
			n2 = ent.nextDouble();
			System.out.println("Digite a sua terceira nota:");
			n3 = ent.nextDouble();
			//Apaga o 'enter' do buffer
			ent.nextLine();
			System.out.println("Digite a sua letra:");
			op = ent.next().charAt(0);

			notas(n1,n2,n3,op);
		}


		ent.close();
	}

}
