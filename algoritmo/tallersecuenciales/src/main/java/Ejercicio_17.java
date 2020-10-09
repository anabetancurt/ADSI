
import java.util.Scanner;


public class Ejercicio_17 {
    public static void main(String[] args) {
    Scanner teclado=new Scanner(System.in);
    
    int cantidadMetros,centimetro;
    
    System.out.println("ingrese la cantida de metros");
    cantidadMetros=teclado.nextInt();
    
    centimetro=cantidadMetros*100;
    
    System.out.println("el valor en centimetros es: " +centimetro);
    }
   
}
