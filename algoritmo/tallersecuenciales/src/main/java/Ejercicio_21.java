
import java.util.Scanner;


public class Ejercicio_21 {
    public static void main(String[] args) {
    Scanner teclado=new Scanner(System.in);
    
    int A,B,AUXILIAR;
    
    System.out.println("ingrese el valor de A");
    A=teclado.nextInt();
    System.out.println("ingrese el valor de B");
    B=teclado.nextInt();
    
    AUXILIAR=A;
    A=B;
    B=AUXILIAR;
    
    System.out.println("el valor de A es: " +A);
    System.out.println("el valor de B es: " +B);
    
    
    
    }
   
}
