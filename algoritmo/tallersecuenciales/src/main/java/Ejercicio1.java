
import java.util.Scanner;


public class Ejercicio1 {
    public static void main(String[] args) {
    Scanner teclado=new Scanner(System.in);
    
    double n1,n2,n3,suma;
    
    System.out.println("ingrese el nuemero n1");
    n1=teclado.nextDouble();
    
    System.out.println("ingrese el numero n2");
    n2=teclado.nextDouble();
    
    System.out.println("ingrse el numero n3");
    n3=teclado.nextDouble();
    
    suma=(n1+n2)/n3;
    
    
    System.out.println("el resultado es:" +suma);
    
        
    
            
    }
}
