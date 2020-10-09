
import java.util.Scanner;


public class Ejercicio5 {
    public static void main(String[] args) {
    Scanner teclado=new Scanner(System.in);
    
    double area,base,altura;
    
    System.out.println("ingrese el valor de la base del triangulo");
    base=teclado.nextDouble();
        
    System.out.println("ingrese le valor de la altura del triangulo");
    altura=teclado.nextDouble();
    
    area=(base*altura)/2;
    
    System.out.println("el area del triangulo es: " +area);
    
    
    
    
    
    
    
    }
  
}
