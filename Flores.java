import java.util.Scanner;
public class Flores {
    public static void main(String[] args){
    Scanner input= new Scanner(System.in);

     System.out.println("Introduce cuanto dinero usted tiene:");
     double dinero= input.nextDouble();
      
     int arreglo1= (int) dinero/70;
     double resto1 = dinero%70;

     int arreglo2= (int) dinero/120;
     double resto2= dinero%120;
    
     if(dinero<70){
        System.out.println("No puedes comprar ningun arreglo floral");
        }
      
    else{
        System.out.println("Puedes comprar " +arreglo1+ " arreglos florales de 70 pesos y te quedan " + resto1+ "pesos");
        System.out.println("Puedes comprar " +arreglo2+ " arreglos florales de 120 pesos y te quedan " + resto2+ "pesos");
     
        }
        
    }
 }
