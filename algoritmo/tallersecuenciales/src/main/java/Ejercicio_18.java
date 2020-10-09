
import java.util.Scanner;


public class Ejercicio_18 {
    public static void main(String[] args) {
    Scanner teclado=new Scanner(System.in); 
    
    int numeroHombres,numeroMujeres;
    double calcularMujeres,totalMujeres,calcularHombres,totalHombres,suma;
    
    System.out.println("ingrese la cantidad de hombres");
    numeroHombres=teclado.nextInt();
    System.out.println("ingrese la cantidad de mujeres");
    numeroMujeres=teclado.nextInt();
    
    suma=numeroHombres+numeroMujeres;
    
    calcularHombres=(100*numeroHombres)/suma;
    totalHombres=calcularHombres;
    calcularMujeres=(100*numeroMujeres)/suma;
    totalMujeres=calcularMujeres;
    
    System.out.println(" el porcentaje de hombres es: " +totalHombres);
    System.out.println("el porcentaje de mujeres es: " +totalMujeres);
    
    
    
    
        
    }
   
}
