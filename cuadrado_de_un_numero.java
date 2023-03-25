import java.util.Scanner;
public class cuadrado_de_un_numero {
    public static void main(String[] args){

    Scanner input= new Scanner(System.in);
    int numero;
   
    do{
        System.out.println("Introduce el numero");
        numero=input.nextInt();
        if(numero!=42){
        System.out.println(Math.pow(numero,2));
        } 
    
    }while(numero!=42);
        System.out.println("Fin del porgrama");
    
    }

}
