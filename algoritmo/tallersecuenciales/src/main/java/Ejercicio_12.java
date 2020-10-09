
import java.util.Scanner;


public class Ejercicio_12 {
    public static void main(String[] args) {
    Scanner teclado=new Scanner(System.in);
    
    double PRECIOVARILLA=2,gananciasEsperadas,cantidad,utilidad;
    
    System.out.println(" la cantidad esperada");
    gananciasEsperadas=teclado.nextDouble();
  
    
    cantidad=gananciasEsperadas/PRECIOVARILLA;
    utilidad=PRECIOVARILLA*0.15;
    
    System.out.println("las ganancias espeeradas es: " +cantidad);
    System.out.println("la utilidad de cada varilla es: " +utilidad);
    }
    
}
