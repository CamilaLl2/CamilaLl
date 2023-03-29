import java.util.Scanner;
public class Multiplo {
   public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      System.out.print("Introduzca el valor de N: ");
      int n = entrada.nextInt();
    
      int minimoMultiplo = (n % 2 == 0) ? n : 2 * n;
      System.out.println("El menor múltiplo de " + n + " que es también múltiplo de 2 es " + minimoMultiplo + ".");
   }
} 

