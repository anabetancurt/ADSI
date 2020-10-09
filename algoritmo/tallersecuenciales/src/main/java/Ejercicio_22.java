
import java.util.Scanner;


public class Ejercicio_22 {
    public static void main(String[] args) {
    Scanner teclado=new Scanner(System.in);   
    int A,B;
    
    System.out.println("igrese el valor de A");
    A=teclado.nextInt();
    System.out.println("ingrese el valor de B");
    B=teclado.nextInt();
    
    B=A-B;
    A=A-B;
    B=A+B;
    
    System.out.println("el valor de A es:" +A);
    System.out.println("el valor de B es:" +B);
    }
    
}
