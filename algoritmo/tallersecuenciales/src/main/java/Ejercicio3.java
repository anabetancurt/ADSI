
import java.util.Scanner;


 
public class Ejercicio3 {
public static void main(String[] args) {
Scanner teclado=new Scanner(System.in);

String nombre;
double nota1,nota2,nota3,promedio;

System.out.println("ingrese el nombre");
nombre=teclado.next();
System.out.println("ingrese la nota1");
nota1=teclado.nextDouble();
System.out.println("ingrese la nota2");
nota2=teclado.nextDouble();
System.out.println("ingrse la nota3");
nota3=teclado.nextDouble();

promedio= (nota1+nota2+nota3)/3;

System.out.println("el estudiante:" +nombre);
System.out.println("su promedio es:" +promedio);



        
    }
  
}
