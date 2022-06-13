package lista5;

import java.util.Scanner;

public class atividade6 {
	
	public static void trocaD(int[][]x) {
		int [][]salva=new int [10][10];
		int k=4;
		int c=9;
		
		for(int j=0;j<x[0].length;j++) {
				salva[k][j]=x[k][j];//linha 5 salva
			}
		System.out.println("Linha 5 -> coluna 10");
		for(int i=0;i<x.length;i++) {
			x[k][c]= x[i][c];//transformar 5 -> 9
			
			System.out.print(x[k][c]+" ");
		}
		System.out.println();
		System.out.println("Coluna 10 -> linha 5");
		for(int l=0;l<x.length;l++) {
			x[l][c]=salva[k][l];//transformar 9 -> 5
			System.out.print(x[l][c]+" ");
		}
		System.out.println();
	}
	
	public static void trocaC(int[][]x) {
		int [][]salva=new int[10][1];
		int j=x.length-1;
		int k = x.length-1;
		//salva o valor da diagonal principal
		for(int i=0;i<x.length;i++) {
			salva[i][0]=x[i][i];
		}
		System.out.println("Troca diagonal principal -> diagonal secundaria");
		//Troca diagonal principal -> diagonal secundaria
		for(int i=0;i<x.length;i++) {
			x[i][i]=x[i][j--];
			System.out.print(x[i][i]+" ");
		}
		System.out.println();
		System.out.println("Troca diagonal secundaria -> diagonal principal");
		//Troca diagonal secundaria -> diagonal principal
		for(int i=0;i<x.length;i++) {
			x[i][k]=salva[i][0];
			System.out.print(x[i][k]+" ");
			k--;
		}
		System.out.println();
	}
	
	public static void trocaB(int[][]x) {
		int[][] salva= new int[10][1];
		//salva o valor da coluna 4
		for(int i =0;i<x.length;i++) {
			salva[i][0]=x[i][3];			
		}
		System.out.println("Troca coluna 4 -> coluna 10");
		//coluna 4 -> coluna 10
		for(int i=0;i<x.length;i++) {
			x[i][3]=x[i][9];
			System.out.print(x[i][3]+" ");
		}
		System.out.println();
		System.out.println("Troca coluna 10 -> coluna 4");
		//coluna 10 -> coluna 4
		for(int i=0;i<x.length;i++) {
			x[i][9]=salva[i][0];
			System.out.print(x[i][9]+" ");
		}
		System.out.println();
	}
	
	public static void trocaA(int[][]x) {//
		
		int [][]salva=new int[1][10];
		
		//Salva o valor da linha 2
		for(int i=0;i<x.length;i++) {
				salva[0][i]=x[1][i];
		}
		System.out.println("Troca linha 2 -> 8");
		//linha 2 -> linha 8
		for(int i=0;i<x.length;i++) {
			x[1][i]= x[7][i];
			System.out.print(x[1][i]+" ");
		}
		System.out.println();
		//linha 8 -> linha 2
		System.out.println("Troca linha 8 -> 2");
		for(int i=0;i<x.length;i++) {
			x[7][i]=salva[0][i];
			System.out.print(x[7][i]+" ");
		}
		System.out.println();
		
	}//
	
	public static void preenche(int[][]x,Scanner ent) {
		for(int i=0;i<x.length;i++) {
			for(int j=0;j<x[i].length;j++) {
				System.out.println("Digite o valor:");
				x[i][j]=ent.nextInt();
			}
		}
	}

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		int [][]x=new int[10][10];
		
		preenche(x,ent);
		trocaA(x);
		trocaB(x);
		trocaC(x);
		trocaD(x);
		
		ent.close();

	}

}


























