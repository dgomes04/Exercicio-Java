package lista6;

import java.util.Scanner;

public class atividade4 {
	
	public static void exibe(String frase) {
		for(int i=frase.length()-1;i>=0;i--) {
			System.out.print(frase.charAt(i));
		}
	}

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		System.out.print("Digite a frase: ");
		String frase = ent.nextLine();
		frase.trim();
		
		
		StringBuilder fraseSemEsp = new StringBuilder();
		
		for(int i=0;i<frase.length();i++) {
			if(frase.charAt(i)!=' ') {
				fraseSemEsp.append(frase.charAt(i));
			}			
		}
		
		int k=fraseSemEsp.length()-1,verPali=0;
		
		for(int i=0;i<fraseSemEsp.length()/2;i++) {
			if(fraseSemEsp.charAt(i)==fraseSemEsp.charAt(k)) {
				verPali++;
			}
			k--;
		}
		
		if(verPali==fraseSemEsp.length()/2) {
		System.out.print("É um palíndromo: ");
		System.out.print(frase+" | ");
		exibe(frase);
		System.out.println();
		}else {
			System.out.println("Não é um palíndromo.");
		}
		ent.close();
	}

}
