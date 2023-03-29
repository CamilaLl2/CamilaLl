import java.util.Scanner;
public class Triangulo {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        double lado1,lado2,lado3;
        
         System.out.println("Introduzca la longitud del lado 1"); 
         lado1 =  entrada.nextDouble();
         
         System.out.println("Introduzca la longitud del 2 Lado:");
         lado2 = entrada.nextDouble();
         
         System.out.println("Introduzca la longitud del 3 Lado:");
          lado3 = entrada.nextDouble();
          
          if(lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1){
            System.out.println("Es posible realizar un triangulo");
          
          }else if (lado1==lado2 && lado2==lado3){
          System.out.println("El Triangulo es equilatero");
          }     
            
          if (lado1==lado2 || lado1==lado3 || lado2==lado3){
          System.out.println("El Triangulo es isoceles");
                }
          else if (lado1!=lado2 || lado1!=lado3 || lado3!=lado2){
          System.out.println("El Triangulo es escaleno");
          }
          else{
            System.out.println("No es posible realizar un triangulo"); 
          }
  }
}