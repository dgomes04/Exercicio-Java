package lista5;

import java.util.Scanner;

public class atividade4 {

	//Soma linha 4
	public static int l4(int [][]x) {
		int valor=0;

		for(int i=0;i<x.length;i++) {
			valor+=x[4][i];
		}
		return valor;
	}
	//Soma coluna 2
	public static int c2(int [][]x) {

		int salva=0;
		for(int i=0;i<x.length;i++) {
			salva+=x[i][2];
		}
		return salva;
	}
	//Soma diagonal principal
	public static int diagPrincipal(int [][]x) {
		int salva=0;
		for(int i=0;i<x.length;i++) {
			salva+=x[i][i];
					
		}
		return salva;
	}
	//Soma diagonal Secundária
	public static int diagSecond(int [][]x) {

		int salva=0,j=x.length-1;
		
		for(int i=0;i<x.length;i++) {
			salva+=x[i][j--];
		}
		return salva;
	}
	//Soma total da matriz
	public static int totalMatriz(int [][]x) {

		int salva=0;
		for(int i=0;i<x.length;i++) {
			for(int j=0;j<x[i].length;j++) {
				salva+=x[i][j];
			}
		}
		
		return salva;
	}

	//Retorna o resultado da opção selecionada pelo usuário
	public static int exibe(int[][]x,char escolha){
		if(escolha=='a'|| escolha=='A') {
			return(l4(x));
		}else if(escolha=='b'|| escolha=='B') {
			return(c2(x));
		}else if(escolha=='c'|| escolha=='C') {
			return(diagPrincipal(x));
		}else if(escolha=='d'|| escolha=='D') {
			return(diagSecond(x));
		}else if(escolha=='e'|| escolha=='E') {
			return(totalMatriz(x));
		}else {
			System.out.println("Operação inválida");
			return 0;
		}
		
	}
	
	//Preencher matriz
	public static void preenche(int[][]x,Scanner ent) {
		for(int i=0;i<x.length;i++) {

			for(int j=0;j<x[0].length;j++) {
				System.out.println("Digite o valor: ");
				x[i][j] = ent.nextInt();
			}
		}
	}

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		char escolha;
		int [][]m = new int[5][5];
		preenche(m,ent);
		
		//Escolha de questão
		System.out.println("Escolha uma letra: (a-b-c-d-e)");
		escolha = ent.next().charAt(0);
		//Exibição
		System.out.println(exibe(m,escolha));
		ent.close();

	}

}
