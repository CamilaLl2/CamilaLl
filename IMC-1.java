import java.util.Scanner;
public class IMC {
    public static void main(String[] args) {
        
    Scanner entrada= new Scanner(System.in);
    double peso, altura;
    
    System.out.println("Introduzca su peso en kg: ");
    peso=entrada.nextDouble();
    
    System.out.println("Introduzca su altura en metros: ");
    altura=entrada.nextDouble();
    
    double IMC;
    IMC=peso/(altura*altura);
   
    if(IMC<18.5){
    System.out.println("Estas bajo peso");
   }
   
   else if(IMC<24.9){
    System.out.println("Tienes un peso normal");
   }

   else if(IMC<29.9){
    System.out.println("Tienes sobrepeso");
   }
   
    else{
    System.out.println("Tienes obesidad");
   }
    }
}
