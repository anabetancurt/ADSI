
import java.util.Scanner;


public class Ejercicio_10 {
    public static void main(String[] args) {
    Scanner teclado=new Scanner(System.in);
    
    double precioVenta,ganancia,impuesto,total;
    double PORCG1=0.12,PORCI2=0.06;
    
    System.out.println("ingrese el precio del vehiculo");
    precioVenta=teclado.nextDouble();
    
    ganancia=precioVenta*PORCG1;
    impuesto=precioVenta*PORCI2;
    total=precioVenta+ganancia+impuesto;
    
    System.out.println("el costo total del vehivulo es: " +total);
    System.out.println("el valor del impuesto es:" +impuesto);
    System.out.println("el valor de la ganancia es:" +ganancia);
    }
   
}
