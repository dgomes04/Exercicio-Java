package lista3;

import java.util.Scanner;

public class atividade4 {
	public static void triangulo(double x, double y, double z) {
		
		//Verificação de tipo de triangulos
		if(x==y && x==z) {
			System.out.println("Triangulo Equilátero");
		}else if((x==z || x==y || z==y) ) {
			System.out.println("Tringulo Isóceles");
		}else if(x!=z && x!=y && z !=y){
			System.out.println("Triangulo Escaleno");
		}else {
			System.out.println("Não é um Triangulo");
		}
	}

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		double x=1, y=1, z=1;
		char parada=0;

		//Condição de parada P pois ele poderia usar 0 para um não triangulo
		while(parada!='p') {
			System.out.println("Digite o valor de X:");
			x = ent.nextDouble();
			System.out.println("Digite o valor de Y:");
			y = ent.nextDouble();
			System.out.println("Digite o valor de Z:");
			z = ent.nextDouble();
			
			//verificação para saber se é um triangulo ou não
			if(x>0 && y>0 && z>0 && (x<y+z) && (y<x+z) && (z<y+x)){
				triangulo(x,y,z);
			}else {
				System.out.println("Não é um triangulo");
			}
		System.out.println("Digite p para parar ou c para continuar");
		parada = ent.next().charAt(0);
		}
		ent.close();
	}

}
