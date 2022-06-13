package lista5;

import java.util.Scanner;

public class atividade5 {


	
	//Diferen�a das matrizes
	public static int[][] matrizDif(int[][]x,int[][]y){
		int[][] matriz = new int[4][6];
		
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[i].length;j++) {
				matriz[i][j]=x[i][j]-y[i][j];
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println("");
		}
		return matriz;
	}
	
	//Soma das matrizes
	public static int[][] matrizSoma(int[][]x,int[][]y){
		int[][]matriz =new int[4][6];
		
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[i].length;j++) {
				matriz[i][j]=x[i][j]+y[i][j];
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println(" ");
		}
		return matriz;
	}
	

	//Preenche uma matriz por vez
	public static void preenche(int[][]x,Scanner ent) {
		for(int i=0;i<x.length;i++) {
			for(int j=0;j<x[i].length;j++) {
				System.out.println("Digite o valor:");
				x[i][j] = ent.nextInt();
			}
		}
	}

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		int [][]a =new int[4][6];
		int [][]b =new int[4][6];
		
		//Preenchimento de matrizes
		System.out.println("Preencha a matriz A");
		preenche(a,ent);
		System.out.println("Preencha a matriz B");
		preenche(b,ent);
		System.out.println("Matriz A");
		


		
		System.out.println("A soma das duas matrizes");
		System.out.println(matrizSoma(a,b));
		
		//Diferen�a matriz
		System.out.println("A Diferen�a entre as duas matrizes");
		System.out.println(matrizDif(a,b));
		ent.close();
	}

}
