package lista5;

import java.util.Scanner;

public class atividade3 {
	//Exibição de vetores
	public static void exibe(int[]x) {
		for(int i =0;i<x.length;i++) {
			System.out.print(x[i]+" ");
			
		}
		System.out.println();
	}
	//Criação de vetor intercalado
	public static void recebe(int []x,int[]y) {
		int[]vet = new int[20];
		int j=0,k=0;
		for(int i=0;i<vet.length;i++) {

			if(i%2==0){
				vet[i]=x[j++];
			}else {
				vet[i]=y[k++];				
			}
		}
		System.out.println("O vetor intercalado é: ");
		//Exibição de vetor intercalado
		exibe(vet);
	}
	
	//Preenchimento de um vetor por vez
	public static void preenche(int[]x,Scanner ent) {
		for(int i=0;i<x.length;i++) {
			System.out.println("Digite o valor: ");
			x[i] = ent.nextInt();
		}
	}

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		//Criação de Vetores
		int []x= new int[10];
		int []y= new int[10];
		
		//Preenchimento de vetores
		System.out.println("Preencha o vetor X: ");		
		preenche(x,ent);
		System.out.println("Preencha o vetor Y: ");	
		preenche(y,ent);
		recebe(x,y);
		System.out.println("O vetor X é: ");
		exibe(x);
		System.out.println("O vetor Y é: ");
		exibe(y);
		ent.close();

	}

}
