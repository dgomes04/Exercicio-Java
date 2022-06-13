package lista6;

import java.util.Scanner;

public class atividade2 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);

		System.out.print("Digite a frase: ");
		String palavra = ent.nextLine().trim();
		
		StringBuilder palavraT = new StringBuilder();

		for(int i=0;i<palavra.length();i++) {
			if(palavra.charAt(i)!=' '){
				palavraT.append(palavra.charAt(i));
			}
			
			if(palavra.charAt(i)==' ' && palavra.charAt(i+1)!=' ') {
				palavraT.append(" ");
			}
		}
		System.out.println(palavraT);

		ent.close();
	}
}	