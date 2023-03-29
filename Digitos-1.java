import java.util.Scanner;
public class Digitos {
public static void main(String[] args){

    Scanner entrada= new Scanner(System.in);
    int numero;
    System.out.println("Introduce un número: ");
    numero=entrada.nextInt();

    String numeroString = Integer.toString(numero);
      boolean contiene = false;
      
      for (int i = 0; i < numeroString.length(); i++) {
         char digito = numeroString.charAt(i);
         
         if (digito == '1' || digito == '3' || digito == '5') {
            contiene = true;
            break;
         }
      }
      
      if (contiene) {
         System.out.println("El número " + numero + " contiene al menos un dígito 1, 3 o 5.");
      } else {
         System.out.println("El número " + numero + " no contiene ningún dígito que sea 1,3 o 5.");
      }
   }
} 