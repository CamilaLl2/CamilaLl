import java.util.Scanner;
public class cuadrado {
    public static void main(String[] args){
    Scanner input= new Scanner(System.in);
        System.out.println("Introduce la longitud del lado: " );
        int lado=input.nextInt();

        for(int i=0; i<lado; i++){
        for(int j=0; j<=lado; j++){
        System.out.print("*");
        }
        System.out.println();
    
        }
    }
}