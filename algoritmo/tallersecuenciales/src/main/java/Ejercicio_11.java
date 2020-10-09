
import java.util.Scanner;


public class Ejercicio_11 {
    public static void main(String[] args) {
    Scanner teclado=new Scanner(System.in);
    
    double lunes,miercoles,viernes,suma,resultado;
    
    System.out.println("ingtrese el valor del  lunes");
    lunes=teclado.nextDouble();
    System.out.println("ingrese el valor del miercoles");
    miercoles=teclado.nextDouble();
    System.out.println("ingrese el valor del viernes");
    viernes=teclado.nextDouble();
    
    suma=lunes+miercoles+viernes;
    resultado=suma/3;
    
    System.out.println("el promedio que la persona tarda em recoorrer la misma ruta es: " +resultado);
    
    
    
    
    
    
    
    
        
    }
  
}
