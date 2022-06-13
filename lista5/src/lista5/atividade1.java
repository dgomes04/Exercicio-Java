package lista5;

import java.util.Scanner;

public class atividade1 {
	//Exibição de vetor
	public static void exibe(int [] vetor) {
		int x=0,passou=0;
		for(int i =0;i<vetor.length; i++) {
			x += vetor[i];
		}
		x = x/vetor.length;
		for(int b=0;b<vetor.length;b++) {
			if(vetor[b]>x) {
				passou++;
			}
		}
		System.out.println("A média da turma foi: "+x);
		System.out.println("A quantidade de alunos que passou foi: "+passou);
	}
	//Preenchimento de vetor
	public static void preenche(int [] vetor,Scanner interno) {
		
		for(int i = 0;i<vetor.length;i++) {
			System.out.println("Digite o valor da nota:");
			vetor[i] = interno.nextInt();			
		}
	}

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		//Criação de vetor
		int vet []  = new int [10];
		
		//Preenchimento de vetor
		preenche(vet,ent);
		
		//Exibição de vetor
		exibe(vet);
		
		ent.close();

	}

}

