package lista2;

import java.util.Scanner;

public class atividade3 {

	public static void main(String[] args) {
		
		try (Scanner ent = new Scanner(System.in)) {
			double n,conta,e = 1, fatorial = 1,salva= 0;
			
			System.out.println("Digite o valor de N:");
			n = ent.nextInt();
			
			for(conta= 1; conta<=n;conta++) {
				
				//Resolu��o apenas do fatorial
				
				//Faz o primeiro fatorial (1*1) depois repete e faz (1*2)
				fatorial *= conta;
				//Salva os resultados dos fatoriais (1*1 - que � o resultado de 1!) quando repetir estar� salvo e ser� (1*2 - resultado de 2!) e depois (1*2*3 - resultado de 3!) 
				salva =fatorial;
				
				
				
				/* 'e' come�a com o valor de 1 pois se fosse declarado como e = 1+1/salva; daria erro pois ele n�o mudaria o valor do primeiro 1, assim somando sempre mais um na conta;
				fazendo dessa forma temos oque � pedido na quest�o - e = e+ 1/salva; (salva � a mesma coisa que os fatoriais)   */
				e += 1/salva;			
			}
			System.out.println("O resultado final �:" +e);
			
			ent.close();
		}
	}

}
