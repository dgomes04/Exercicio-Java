package lista2;

import java.util.Scanner;

public class atividade_1 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int valores,valoresPositivos = 0,valoresNegativos = 0,valoresNeutros = 0;
		char sair;
			
			//Op��o de parar direto ou come�ar o c�digo:
			System.out.println("Digite C p/ come�ar || P p/ parar");
			sair = ent.next().charAt(0);
												
			//Condi��o para rodar o c�digo:
			while(sair == 'c' || sair == 'C') {
			System.out.println("Digite a sequencia de valores:");					
			valores = ent.nextInt();
			
			//Resolu��o de positivos, negativos e neutros:
			if(valores>0) {
				valoresPositivos++;
				}else if(valores<0) {
				valoresNegativos++;
				}else{
				valoresNeutros++;
				}
			//Caso ele queria sair ou continuar:
			System.out.println(" P p/ sair || digite C p/ continuar");
			sair = ent.next().charAt(0);
			}
			
			
			
	
		
		//Printando os valores pedidos na quest�o
		System.out.println("O total de valores positivos �:" + valoresPositivos);
		System.out.println("O total de valores negativos �:" + valoresNegativos);
		System.out.println("O total de valores iguais a zero �:" +valoresNeutros);
		ent.close();
	}
	
	}

