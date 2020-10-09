
import java.util.Scanner;


public class Ejercicio6 {
    public static void main(String[] args) {
    Scanner teclado=new Scanner(System.in);
    
    String empleado1,empleado2,empleado3;
    double sueldo1,sueldo2,sueldo3,aumento1,aumento2,aumento3,total1,total2,total3;
    double PORC1=0.10,PORC2=0.12,PORC3=0.15; 
       
    System.out.println(" ingrese el nombre del empleado1");
    empleado1=teclado.next();
    System.out.println("ingrese el sueldo del empleado1");
    sueldo1=teclado.nextDouble();
    System.out.println("ingrese el nombre del empleado2");
    empleado2=teclado.next();
    System.out.println("ingrese el sueldo del empleado2"); 
    sueldo2=teclado.nextDouble();
    System.out.println("ingrese el nombre del empelado3");
    empleado3=teclado.next();
    System.out.println("ingrese sueldo de empleado3");
    sueldo3=teclado.nextDouble();
    
    aumento1=sueldo1*PORC1;
    aumento2=sueldo2*PORC2;
    aumento3=sueldo3*PORC3;
    
    total1=sueldo1+aumento1;
    total2=sueldo2+aumento2;
    total3=sueldo3+aumento3;
    
    System.out.println("el empleado: " +empleado1 + " su sueldo es: " +total1);
    System.out.println("el empleado: " +empleado2 + " su sueldo es: " +total2);
    System.out.println("el empleado: " +empleado3 + " su sueldo es: " +total3);
    
        
    
    
    
   
    
    
 
    
    
        
    
    
    
    
    
            
    }
  
}
