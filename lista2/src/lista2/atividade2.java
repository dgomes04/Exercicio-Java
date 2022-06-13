package lista2;

import java.util.Scanner;

public class atividade2 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int valores,valoresPositivos = 0,valoresNegativos = 0,valoresNeutros = 0,valorTotal = 0;
		char sair;
				
			System.out.println("Digite C p/ começar || P p/ parar");
			sair = ent.next().charAt(0);
			
													
			while(sair == 'c' || sair == 'C') {
			System.out.println("Digite a sequencia de valores:");					
			valores = ent.nextInt();
			
			//Soma de todos os valores para fazer a média:
			valorTotal++;
			
			if(valores>0) {
				valoresPositivos++;
				}else if(valores<0) {
				valoresNegativos++;
				}else{
				valoresNeutros++;
				}
			System.out.println(" P p/ sair || digite C p/ continuar");
			sair = ent.next().charAt(0);
			}
		//Print com calculo da média de cada uma das porcentagens pedida na questão:
		System.out.println("A porcetagem de valores positivos é:" + (double)(valoresPositivos*100)/valorTotal);
		System.out.println("O total de valores negativos é:" + (double)(valoresNegativos*100)/valorTotal);
		System.out.println("O total de valores iguais a zero é:" + (double)(valoresNeutros*100)/valorTotal);
		ent.close();

	}

}
