
import java.util.Scanner;


public class Ejercicio_14 {
    public static void main(String[] args) {
    Scanner teclado=new Scanner(System.in);
    
    double valor1,valor2,valor3,total1,total2,total3,totalFactura;
    String articulo1,articulo2,articulo3;
    double cantidad1,cantidad2,cantidad3;
    
    System.out.println("ingrese el nombre del articulo 1");
    articulo1=teclado.next();
    System.out.println("ingrese la cantidad del articulo 1");
    cantidad1=teclado.nextDouble();
    System.out.println("ingrese el valor del articulo");
    valor1=teclado.nextDouble();
    System.out.println("ingrese el nombre del articulo 2");
    articulo2=teclado.next();
    System.out.println("ingrese la cantidad del articulo 2");
    cantidad2=teclado.nextDouble();
    System.out.println("ingrese el valor del articulo");
    valor2=teclado.nextDouble();
    System.out.println("ingrese el nombre del articulo 3");
    articulo3=teclado.next();
    System.out.println("ingrese la cantidad del ariculo 2");
    cantidad3=teclado.nextDouble();
    System.out.println("ingrese el valor del articulo");
    valor3=teclado.nextDouble();
    
    total1=cantidad1*valor1;
    total2=cantidad2*valor2;
    total3=cantidad3*valor3;
    totalFactura=total1+total2+total3;
    
    System.out.println("el total de la factura es: " +totalFactura);
        
    
    
    
    
    
    
    
    }
   
}
