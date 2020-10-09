
import java.util.Scanner;


public class Ejercicio9 {
    public static void main(String[] args) {
    Scanner teclado=new Scanner (System.in);
    
    double altura;
    double PUL=2.54,PIES=12,pulgada,pies;
    
    System.out.println("ingrese la altura en centimetros");
    altura=teclado.nextDouble();
    
   pulgada=altura*PUL;
   pies=altura*PIES;
   
   System.out.println("la altura en pugadas es: " +pulgada);
   System.out.println("la altura en pies es: " +pies);
   
    
    
    
    }
    
}
