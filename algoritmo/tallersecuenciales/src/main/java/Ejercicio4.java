
import java.util.Scanner;



public class Ejercicio4 {
public static void main(String[] args) {
Scanner teclado=new Scanner(System.in);

int horasLaboradas;
double tarifaHoras,salario;

System.out.println("ingrese las horas laboradas");
horasLaboradas=teclado.nextInt();

System.out.println(" ingrese el valor de tarifa por horas");
tarifaHoras=teclado.nextDouble();

salario=(horasLaboradas*tarifaHoras);

System.out.println("el salrio es:  " + salario);


        
 
 

    }
   
     
}
