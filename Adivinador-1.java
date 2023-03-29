import java.util.Scanner;
public class Adivinador {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int min = 1;
        int max = 100;
        int intentos = 0;
        int adivinanza;
        char respuesta;
        do {
           intentos++;
           adivinanza = (min + max) / 2;
           System.out.print("¿El número pensado es mayor o igual a " + adivinanza + "?: ");
           respuesta = entrada.next().charAt(0);
           if (respuesta == 'S') {
              min = adivinanza + 1;
           } else {
              max = adivinanza - 1;
           }
        } while (min <= max && intentos < 7);
        if (min<= max) {
           System.out.println("¡No he podido adivinar el número en 7 intentos o menos!");
        } else {
           System.out.println("El número pensado es " + adivinanza);
        }
     }
  }
  
