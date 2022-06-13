package lista3;

import java.util.Scanner;

public class atividade10 {
	
	public static char categorias(int idade) {
		
		//Verificação de categoria
		if(idade<=5 && idade<=7) {						
			return('F');
		}else if(idade>=8 && idade <= 10) {
			return('E');
		}else if(idade >= 11 && idade <= 13) {
			return('D');
		}else if(idade>=14 && idade <=15) {
			return('C');
		}else if(idade >=16 && idade <=17) {
			return('B');
		}else {
			return('A');
		}
	}

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int idade;
		
		//Idade a ser verificada
		System.out.println("Forneça a sua idade:");
		idade = ent.nextInt();
		
		//Print de resultados
		System.out.println("A sua categoria é: " +categorias(idade));
		ent.close();

	}

}















































