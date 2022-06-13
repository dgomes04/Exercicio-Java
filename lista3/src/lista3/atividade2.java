package lista3;
import java.util.Scanner;

public class atividade2 {

	public static void prefeitura(double sal, double filhos) {
		System.out.println("A média do salario da população é:" + (sal/filhos));


	}

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);

		double salario=1,totalFilhos=0, totalSalario=0;
		int filhos=1;



		while(salario>0) {

			System.out.println("Digite o valor do seu salário ou digite '0' para parar");
			salario = ent.nextDouble(); //flag
			totalSalario+= salario;

			System.out.println("Digite a quantidade de filhos na sua família:");
			filhos = ent.nextInt();
			if(salario>0) {

				//Filhos +2 supondo que toda cidade tem pai e mãe
				totalFilhos+= filhos+2;
			}

		}
		prefeitura(totalSalario,totalFilhos);
		ent.close();
	}

}