package lista2;

import java.util.Scanner;

public class atividade4 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		//Declarado os dois primeiros termos como 0 e 1 pois esses são sempre iguais
		int t1 = 0, t2 = 1, t3, fn ,cont = 3; 
		
		System.out.println("Digite o número serie de Fibonacci:");
		fn = ent.nextInt();
		
		while(cont <= fn) {
			//O terceiro termo é o resultado da soma desses dois
			t3 = t1 + t2;
			//printa termo a termo até chegar no numero da serie pedido
			System.out.println(t3);
			//substitui os valores para poder refazer a conta
			t1 = t2;
			t2 = t3;		
			cont++;
		}
		ent.close();

	}

}
