package lista6;

import java.util.Scanner;

public class atividade5 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		System.out.print("Digite o seu número de telefone: ");
		String telefone = ent.nextLine().trim();
		if(telefone.length()<=9){	
		StringBuilder tel = new StringBuilder();
		String[] telTamanho = telefone.split("-");
		String telPronto="";
		
		if(telTamanho.length<9) {			
			telPronto = "9"+telefone;			
		}
		
		for(int i=0;i<telPronto.length();i++) {
			if(i==5) {
				tel.append("-");
			}else {
				tel.append(telPronto.charAt(i));
			}if(i==5) {
				tel.append(telPronto.charAt(i));
			}
			
		}
		System.out.print("Telefone sem formatação: ");
		System.out.println(telPronto);
		System.out.print("Telefone com formatação: ");
		System.out.println(tel);
	}else{
		System.out.println("Número inválido");
	}
		ent.close();
	}

}
