
import java.util.Scanner;


public class Ejercicio_19 {
    public static void main(String[] args) {
    Scanner teclado=new Scanner(System.in);
    
    String inversionista1,inversionista2,inversionista3;
    double inversion1,inversion2,inversion3,totalInversion1,totalInversion2,
    totalInversion3,suma; 
    
        System.out.println("ingrese el nombredel inversionista 1 ");
        inversionista1=teclado.next();
        System.out.println("ingrese el valor de su inversion ");
        inversion1=teclado.nextDouble();
        System.out.println("ingrese el nombredel inversionista 2 ");
        inversionista2=teclado.next();
        System.out.println("ingrese el valor de su inversion ");
        inversion2=teclado.nextDouble();
        System.out.println("ingrese el nombre del inversionista 3 ");
        inversionista3=teclado.next();
        System.out.println("ingrese el valor de su inversion ");
        inversion3=teclado.nextDouble();
        
        suma=inversion1+inversion2+inversion3;
       
   
        totalInversion1=(suma/inversion1)*100;
        totalInversion2=(suma/inversion2)*100;
        totalInversion3=(suma/inversion3)*100;
       
        
        System.out.println("el porcentaje del inversionista1 es: " +totalInversion1);
        System.out.println("el porcentaje del inversionista2 es: " +totalInversion2);
        System.out.println("el porcentaje del inversionista3 es: " +totalInversion3);
        
        
        
              
    
    }
    
    
    
}
