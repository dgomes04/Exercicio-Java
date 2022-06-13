package lista3;

import java.util.Scanner;

public class atividade7 {
	//Retorna booleano pois é true ou false
	public static boolean verifica(int valor) {
		if(valor>0) {
			return(true);
		}
		return(false);
	}

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int n,valor;
		
		//Valor de N como limite de números
		System.out.println("Digite o valor de N:");
		n = ent.nextInt();
		
		for(int limite=1;limite<=n;limite++) {
			System.out.println("Digite o valor a ser verificado:");
			valor = ent.nextInt();
			//Chama a função para cada valor a ser verificado
			System.out.println(verifica(valor)); 
		}
		ent.close();
	}

}
