package lista6;

import java.util.Scanner;

public class atividade1 {

	

	public static void main(String[] args) {
		Scanner ent  = new Scanner(System.in);

		String nome;
		System.out.println("Digite o seu nome:" );
		nome = ent.nextLine().toUpperCase();

		String[] nomeVet = nome.split(" ");

		String conect = "e do da dos das de  di  du";
		
		StringBuilder iniciais = new StringBuilder();
			
		for(int i=0;i<nomeVet.length;i++) {
			if (! conect.contains(nomeVet[i].toLowerCase())) { 
				iniciais.append(Character.toUpperCase(nomeVet[i].charAt(0)));
	
			}
		}
		System.out.println(iniciais);
		ent.close();
	}
}	


