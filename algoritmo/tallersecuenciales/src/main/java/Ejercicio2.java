
import java.util.Scanner;



public class Ejercicio2 {
public static void main(String[] args) {
Scanner teclado=new Scanner(System.in);

double numero,resultado;

System.out.println("ingrese el numero el cual desea imprimir la raiz cuadrada");
numero=teclado.nextDouble();

resultado=Math.sqrt(numero);

    System.out.println("la raiz cuadrada de su numero es: " +resultado);
    }
}
