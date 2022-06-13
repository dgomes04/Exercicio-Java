package lista2;

import java.util.Scanner;

public class atividade6 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		double mercadoriaVenda=1,mercadoriaCompra=1,lucro10,porLucro,lucro20;
		double lucroMenor10=0,lucroMenor20=0,lucroMaior20=0,mercadoriaCompraTotal=0,mercadoriaVendaTotal=0,lucroTotal=0;
		
		
		
		while(mercadoriaCompra != 0 || mercadoriaVenda != 0) {
			
			System.out.println("Digite o valor de compra da mercadoria:");
			mercadoriaCompra = ent.nextDouble();
			
			System.out.println("Digite o valor de venda da mercadoria:");
			mercadoriaVenda = ent.nextDouble();
			
			//Valor total de compras, valor total de vendas e o lucro total
			mercadoriaCompraTotal += mercadoriaCompra;
			mercadoriaVendaTotal += mercadoriaVenda;
			lucroTotal += (mercadoriaCompraTotal - mercadoriaVendaTotal);
			
			//Porcentagem de lucros
			porLucro = ((mercadoriaVenda - mercadoriaCompra)*100) / mercadoriaCompra;
			
			//Lucros de 10% e 20% em cima do valor de compra
			lucro10 = (mercadoriaCompra * 10) /100;
			lucro20 = (mercadoriaCompra * 20) / 100;
					
			//prints
			if(porLucro<lucro10) {				
				lucroMenor10++;
				System.out.println("A quantidade de mercadoria que fornecem menos que 10% é:" +lucroMenor10);
			}else if(porLucro <=lucro20) {
				lucroMenor20++;
				System.out.println("A quantidade de mercadoria que fornecem menos que 20% é:" +lucroMenor20);
			}else if(porLucro>lucro20){
				lucroMaior20++;
				System.out.println("A quantidade de mercadoria que fornece mais que 20% é:"+ lucroMaior20);
			} 
				
			
		}
		System.out.println("O valor total de compra foi de " +mercadoriaCompraTotal);
		System.out.println("O valor total de vendas foi de "+mercadoriaVendaTotal);
		System.out.println("O valor total de lucro " +lucroTotal);
		ent.close();
	}

}
