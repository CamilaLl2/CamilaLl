import java.util.Scanner;
public class Cuadrado {
    public static void main(String[] args) {
    int lado;
        
    Scanner entrada=new Scanner(System.in);
    System.out.println("Introduzca la longitud del lado del cuadrado: ");
    lado=entrada.nextInt();
        
    for(int i=0;i<lado;i++){
         System.out.print("*");
         }
    System.out.println(" ");
         
    for(int i = 0; i < lado-2; i++) {
    System.out.print("*");
    for(int j = 0; j < lado-2; j++) {
    System.out.print(" ");
                   }
    System.out.println("*");
               }
             
     for(int i=0;i<lado;i++){
     System.out.print("*");
       }
      } 
    }

