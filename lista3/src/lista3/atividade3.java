package lista3;

import java.util.Scanner;

public class atividade3 {
	
	public static void ordem(int a, int b, int c) {
		//Primeiro da ordem crescente
		if(a<b && a<c) {
			System.out.println(a);
		}if(b<a && b<c) {
			System.out.println(b);
		}if(c<a && c<b) {
			System.out.println(c);
		}
		
		//Segundo da ordem crescente
		if((a>b && a<c) || (a<b && a>c)) {
			System.out.println(a);
		}if((b>a && b<c) || (b<a && b>c)) {
			System.out.println(b);
		}if((c>a && c<b) || (c>b && c<a)) {
			System.out.println(c);
		}
		
		//Terceiro da ordem crescente
		if(a>b && a>c) {
			System.out.println(a);
		} if(b>a && b>c){
			System.out.println(b);
		} if(c>a && c>b) {
			System.out.println(c);
		}
	}

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int n;
		int val1,val2,val3;
		
		System.out.println("Digite quantos conjuntos:");
		n = ent.nextInt();
		
		
		for(int limiteConjuntos=0;limiteConjuntos<=n;limiteConjuntos++) {
			System.out.println("Digite o primeiro valor do conjunto:");
			val1 = ent.nextInt();
			System.out.println("Digite o segundo valor do conjunto:");
			val2 = ent.nextInt();
			System.out.println("Digite o terceiro valor do conjunto:");
			val3 = ent.nextInt();
			
			System.out.println("A ordem crescente é: ");
			ordem(val1,val2,val3);
		}

	ent.close();}

}
