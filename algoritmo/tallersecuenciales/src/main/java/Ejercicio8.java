
import java.util.Scanner;


public class Ejercicio8 {
    public static void main(String[] args) {
    Scanner teclado=new Scanner(System.in);
    
    double n1,n2,n3,n4,suma,promedio;
    
    System.out.println("ingrese el primer numero");
    n1=teclado.nextDouble();
    System.out.println("ingrese el segundo numero");
    n2=teclado.nextDouble();
    System.out.println("ingrese el tercer numero");
    n3=teclado.nextDouble();
    System.out.println("ingese el cuarto numero");
    n4=teclado.nextDouble();
    
    suma=n1+n2+n3+n4;
    promedio=suma/4;
    
    System.out.println("el resultado de sumar los los 4 numeros es: " +suma);
    System.out.println("el resultado del promedio es:" +promedio);
        
    
    

    }
   
}
