package lista3;

import java.util.Scanner;

public class atividade8 {
	//Retorna o valor em double
	public static double conta(int n) {
		double s=0;
		//Calculo matematico
		for(double limite=1;limite<=n;limite++) {
		s += ((limite *limite)+1)/(limite+3);
	
		
		}
		return(s);
		
	}

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int n;
		
		//N como valor limite de fórmula
		System.out.println("Digite o valor de N:");
		n = ent.nextInt();
		
		//Print de resultados
		System.out.println("O valor de N: " +conta(n)); 
		
		ent.close();
	}

}
