package lista2;

import java.util.Scanner;

public class atividade4 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		//Declarado os dois primeiros termos como 0 e 1 pois esses s�o sempre iguais
		int t1 = 0, t2 = 1, t3, fn ,cont = 3; 
		
		System.out.println("Digite o n�mero serie de Fibonacci:");
		fn = ent.nextInt();
		
		while(cont <= fn) {
			//O terceiro termo � o resultado da soma desses dois
			t3 = t1 + t2;
			//printa termo a termo at� chegar no numero da serie pedido
			System.out.println(t3);
			//substitui os valores para poder refazer a conta
			t1 = t2;
			t2 = t3;		
			cont++;
		}
		ent.close();

	}

}
