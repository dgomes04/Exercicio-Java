package lista2;

import java.util.Scanner;

public class atividade_1 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int valores,valoresPositivos = 0,valoresNegativos = 0,valoresNeutros = 0;
		char sair;
			
			//Opção de parar direto ou começar o código:
			System.out.println("Digite C p/ começar || P p/ parar");
			sair = ent.next().charAt(0);
												
			//Condição para rodar o código:
			while(sair == 'c' || sair == 'C') {
			System.out.println("Digite a sequencia de valores:");					
			valores = ent.nextInt();
			
			//Resolução de positivos, negativos e neutros:
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
			
			
			
	
		
		//Printando os valores pedidos na questão
		System.out.println("O total de valores positivos é:" + valoresPositivos);
		System.out.println("O total de valores negativos é:" + valoresNegativos);
		System.out.println("O total de valores iguais a zero é:" +valoresNeutros);
		ent.close();
	}
	
	}

