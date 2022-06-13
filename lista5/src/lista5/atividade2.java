package lista5;

import java.util.Scanner;

public class atividade2 {
	//Exibição
	public static void exibe(int []vet) {
		for(int i=0;i<vet.length;i++) {
			System.out.println(vet[i]);			
		}
	}
	
	//Verifica os negativos
	public static int[] teste(int[]vet) {		
		int tamanho=0;
		for(int i =0;i<vet.length;i++) {
			if(vet[i]<0) {				
				tamanho++;
			}
		}
		int  [] neg= new int[tamanho];
		int j=0;
		for(int i =0;i<vet.length;i++) {
			if(vet[i]<0) {				
				neg[j++] = vet[i];
			}
		}
		
		return neg;
	}

	//Preenche um vetor por vez
	public static void preenche(int[]vet,Scanner ent) {
		for(int i =0;i<vet.length;i++) {
			System.out.println("Digite o valor:");
			vet[i] = ent.nextInt();
		}
	}

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		//Criação de vetor
		int [] vet = new int [10];

		
		preenche(vet,ent);
		System.out.println("Todos os valores:");
		exibe(vet);
		System.out.println("Todos os valores negativos:");
		exibe(teste(vet));
	}

}