package lista3;

import java.util.Scanner;

public class atividade6 {
	//Retora um valor double, porém recebe inteiro
	public static double fatorar( int n) {
		double fatorar =1;
		double salva =0;
		double s= 1;
		
		//calculo fatoração
		for(int limite=1;limite<=n;limite++) {
						
			fatorar *=limite;
			
			salva =fatorar;
			s += 1/salva;
			
		}
		return(s);
		
	}

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int n;
		
		//valor limite
		System.out.println("Digite o valor de N:");
		n = ent.nextInt();
		//print de resultado
		System.out.println("S = "+fatorar(n));
		ent.close();
	}
}
