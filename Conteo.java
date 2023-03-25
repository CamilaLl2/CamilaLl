import java.util.Scanner;
public class Conteo {
    public static void main(String[] args){
    Scanner input= new Scanner(System.in);
    int valor;
    System.out.println("Introduce el valor:");
    valor=input.nextInt();

    for(int i=valor; i>=0; i--){
    System.out.println(i+ " segundos...");
        }
    }
}