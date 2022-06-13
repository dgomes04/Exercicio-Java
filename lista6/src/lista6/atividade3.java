package lista6;

import java.util.Scanner;

public class atividade3 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);

		System.out.print("Digite a data: ");
		String data = ent.nextLine().trim();
		
		String[] dataT = data.split("/");
		String[] meses = {"Janeiro" ,"Fevereiro", "Março", "Abril", "Maio" ,"Junho", "Julho", "Agosto", "Setembro" ,"Outubro" ,"Novembro","Dezembro"};

		int mes = Integer.parseInt(dataT[1]);
		int dia = Integer.parseInt(dataT[0]);
		if(dia>0 && dia<=31) {
			System.out.println("Você nasceu no dia "+ dataT[0]+" de "+ meses[mes-1]+" do ano "+ dataT[2]);
		}else {
			System.out.println("Data inválida");
		}
		ent.close();
	}
}