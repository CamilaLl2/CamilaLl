import java.util.Scanner;
public class AreaDeUnTriangulo {
    public static void main(String[] args) {
        double a,b,c;
        double semip,area;
        Scanner entrada = new Scanner(System.in);
            System.out.println("Introduzca el valor del lado a: ");
            a=entrada.nextDouble();
           
            System.out.println("Introduzca el valor del lado b: ");
            b=entrada.nextDouble();
            
            System.out.println("Introduzca el valor del lado c: ");
            c=entrada.nextDouble();
           
            semip=(a+b+c)/2;
            
             area=Math.sqrt(semip*(semip-a)*(semip-b)*(semip-c));
            System.out.println("el área del triángulo es: "+area);
   }
}
