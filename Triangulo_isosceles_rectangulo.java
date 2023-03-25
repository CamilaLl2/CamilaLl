import java.util.Scanner;
public class Triangulo_isosceles_rectangulo {
    public static void main(String[] args){
Scanner entrada= new Scanner(System.in);
System.out.println("Introduzca la longitud de los lados iguales: ");
int lado=entrada.nextInt();

    for(int i=0; i<lado; i++){
        for(int j=0; j<=i; j++){
    System.out.print("*");
    }
     System.out.println("");

    }


    }
}
