
import java.util.Scanner;


public class Ejercicio_15 {
    public static void main(String[] args) {
    Scanner teclado=new Scanner(System.in); 
    
    double gradoCentigrado,formula;
    double FAHRENHEIT=1.8,CELSIUS=32;
       
    System.out.println("ingresar el numero que desea convertir");
    gradoCentigrado=teclado.nextDouble();
    
    formula=gradoCentigrado*FAHRENHEIT+CELSIUS;
    
    System.out.println("el resultado es: " +formula);
    }
   
}
