package lista6;

import java.util.Scanner;



public class atividade8{
    
    public static void exibe(String[] f){
        for(int i=0;i<f.length;i++){
            System.out.print(f[i]);
        }
    }
    public static void main(String[] args) {
        Scanner ent = new Scanner (System.in);
        char carac;
        System.out.println("Digite uma frase para ser criptografada: ");
        String frase = ent.nextLine().trim().toUpperCase();        
        StringBuilder criptografada = new StringBuilder(frase);

        for(int i=0; i<frase.length();i++) {
            if (frase.charAt(i)>=65&&frase.charAt(i)<=87) {
                carac = frase.charAt(i);
                carac+=3;
                criptografada.setCharAt(i, carac);
            }
            else if (frase.charAt(i)==88){
                criptografada.setCharAt(i,'A');
            }
            else if (frase.charAt(i)==89){
                criptografada.setCharAt(i,'B');
            }
            else if (frase.charAt(i)==90){
                criptografada.setCharAt(i,'C');
            }
        }
        System.out.println(criptografada);
       
        ent.close();
    }
              
   }
      
