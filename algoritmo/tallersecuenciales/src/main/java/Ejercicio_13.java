
import java.util.Scanner;


public class Ejercicio_13 {
    public static void main(String[] args) {
    Scanner teclado=new Scanner(System.in);
    
    double salario,deduccion,bonificacion,totalSalario;
    double DEDU=0.02,BONI=0.10;
    
    System.out.println("ingrese el salario");
    salario=teclado.nextDouble();
        
    bonificacion=salario*BONI;
    deduccion=salario*DEDU;
    totalSalario=salario-deduccion+bonificacion;
    
    System.out.println(" la deduccion del empleado es: "+deduccion);
    System.out.println(" la bonificacion del empleado es:" +bonificacion);   
    System.out.println("el empleado tiene un salario de: " +totalSalario);
    }
   
}
