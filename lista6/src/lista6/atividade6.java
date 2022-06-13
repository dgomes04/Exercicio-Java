package lista6;

import java.util.Scanner;

public class atividade6{
	public static void proced(int n, String palavra)
	{	
		if(n==1)
	 	{
			System.out.println(palavra.charAt( 0));
		}
		else
		{
			proced(n-1,palavra);
			
			for(int i=2;i<=n;i++)
			{
				System.out.print(" ");
			}
			System.out.print(palavra.charAt(n-1));
			System.out.println();			
		}
	}

   public static void main(String[] args) 
   {
		Scanner ent = new Scanner (System.in);
		
		System.out.print("Digite a palavra: ");
		String palavra = ent.nextLine().trim().toUpperCase();

	  	proced(palavra.length(),palavra);		

		ent.close();
   }
}

