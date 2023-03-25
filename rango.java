import java.util.Scanner;
public class rango {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int a,b;
    int contador=0;
    
    System.out.println("Introduce el primer número del rango");
    a=sc.nextInt();
    
    System.out.println("Introduce el segundo número del rango");
    b=sc.nextInt();
    
    for(int i=a; i<=b; i++){
        int UltimoDigito=i%10;
        if(UltimoDigito==2|| UltimoDigito==3||UltimoDigito==6 ){
        contador++;
        }
    }
   
    System.out.println("La cantidad de numeros que terminan en 2,6 o 3 en el rango ["+a+","+b+"] es: "+contador);    
   
    }
}
