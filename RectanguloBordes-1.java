import java.util.Scanner;
public class RectanguloBordes {
 public static void main(String[] args) {
 
    Scanner entrada=new Scanner(System.in);
    int largo;
    int ancho;

    System.out.println("Introduzca el largo del rectángulo: ");
    largo = entrada.nextInt();

    System.out.println("Introduzca el ancho del rectángulo: ");
    ancho=entrada.nextInt();

    for(int i=0;i<largo;i++){
        System.out.print("*");
            }
            System.out.println("    ");

            for(int i=0;i<ancho-2;i++){
                System.out.print("*");

                for(int j=0;j<largo-2;j++){
                    System.out.print(" ");
                }
                System.out.println("*");
            }

            for(int i=0;i<largo;i++){
                System.out.print("*");
                        }
             }
        
    }
