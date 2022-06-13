package lista2;

import java.util.Scanner;

public class atividade5 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int t1 = 0, t2 = 1, t3, fn ,cont = 3; 
		
		System.out.println("Digite o número serie de Fibonacci:");
		fn = ent.nextInt();
		
		//realiza o bloco de código até o numero de serie anterior ao pedido pelo usuário 
		while(cont < fn) {
			t3 = t1 + t2;
			System.out.println(t3);
			t1 = t2;
			t2 = t3;		
			cont++;
		}
		ent.close();
	}

}
