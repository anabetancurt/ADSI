
import java.util.Scanner;


public class Ejercicio_16 {
    public static void main(String[] args) {
    Scanner teclado=new Scanner(System.in);
    
    double numero1,numero2,numero3,resultado,suma;
    
    System.out.println("ingrese numero 1");
    numero1=teclado.nextDouble();
    System.out.println("ingrese el numero 2");
    numero2=teclado.nextDouble();
    System.out.println("ingrese el numero 3");
    numero3=teclado.nextDouble();
    
    suma=numero1+numero2+numero3;
    resultado=suma/5;
    
    System.out.println("la quinta parte de la suma es: " +resultado);
    
    }
   
}
