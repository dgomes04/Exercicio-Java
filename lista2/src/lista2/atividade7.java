package lista2;

import java.util.Scanner;

public class atividade7 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int voto, voto1 = 0,voto2 = 0,voto3 = 0,voto4 = 0, nulo = 0, branco = 0;
		
		//opção de votos
		System.out.println("1 - Candidato 1");
		System.out.println("2 - Candidato 2");
		System.out.println("3 - Candidato 3");
		System.out.println("4 - Candidato 4");
		System.out.println("5 - Voto nulo");
		System.out.println("6 - Voto em branco");
		voto = ent.nextInt(); //flag
		
		while(voto > 0 ) {

		
			if(voto == 1) {
				System.out.println("Você votou no candidato 1");
			voto1++;
			} else if(voto == 2) {
				System.out.println("Você votou no candidato 2");
			voto2++;
			} else if(voto == 3) {
				System.out.println("Você votou no candidato 3");
			voto3++;
			} else if(voto == 4) {
				System.out.println("Você votou no candidato 4");
			voto4++;
			}else if(voto == 5) {
				System.out.println("Você votou nulo");
			nulo++;
			}else if(voto == 6) {
				System.out.println("Você votou branco");
			branco++;
			}else {
				System.out.println("Opção inválida");
			}
			System.out.println("1 - Candidato 1");
			System.out.println("2 - Candidato 2");
			System.out.println("3 - Candidato 3");
			System.out.println("4 - Candidato 4");
			System.out.println("5 - Voto nulo");
			System.out.println("6 - Voto em branco");
			
			//Caso queira encerrar a votação
			System.out.println("Ou Digite 0 p/ parar a votação");
			voto = ent.nextInt();
		}
		
		//Prints				
		System.out.println("O total de votos para o candidato 1: " +voto1);
		System.out.println("O total de votos para o candidato 2: " +voto2);
		System.out.println("O total de votos para o candidato 3: " +voto3);
		System.out.println("O total de votos para o candidato 4: " +voto4);
		System.out.println("O total de votos nulos: " +nulo);
		System.out.println("O total de votos brancos: "+branco);
		ent.close();
	}
	
}
