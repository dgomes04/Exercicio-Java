package lista6;

import java.util.Scanner;


public class atividade7
{
   public static void main(String[] args)
   {
      Scanner ent = new Scanner (System.in);

      System.out.print("Digite a frase: ");
      String frase = ent.nextLine();
      char c;

      for(int i=0; i<frase.length();i++){
         if(frase.charAt(i)>=97 && frase.charAt(i)<=122){
            c= frase.charAt(i);
            c-=32;
            System.out.print(c);
         }
      }
     
      
      ent.close();
   }
}