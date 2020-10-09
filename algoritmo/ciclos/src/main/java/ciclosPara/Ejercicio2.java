
package ciclosPara;

import java.util.Scanner;


public class Ejercicio2 {
    public static void main(String[] args) {
    Scanner teclado=new Scanner(System.in);
    int i,num,contador=0;
    double acumulador=0,promedio;
    
    for(i=1;i<=5;i++){
    System.out.println("ingrese el numero");   
    num=teclado.nextInt();
    acumulador=acumulador+num;
    if(num>500){
    contador=contador+1;
    
    }
    
    }
    promedio=acumulador/5;
    System.out.println("el promedio es:" +promedio);
    System.out.println("numeros mayores de 500 son:" +contador);
    }
    
}