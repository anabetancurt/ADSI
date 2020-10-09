
import java.util.Scanner;


public class Ejercicio_20 {
    public static void main(String[] args) {
     Scanner teclado=new Scanner(System.in);
     
     int horas,minutos,segundos,horasTotales,segundosTotales,
        minutosTotales,st2,st3;
     
        System.out.println("ingrese la cantidad de horas");
        horas=teclado.nextInt();
        System.out.println("ingresela cantidad de minutos");
        minutos=teclado.nextInt();
        System.out.println("ingrese la cantidad de segundos");
        segundos=teclado.nextInt();
        
        segundosTotales=(horas+3600)+(minutos*60+segundos);
        horasTotales=segundosTotales/3600;
        st2=segundosTotales-(horas*3600);
        minutosTotales=st2/60;
        st3=st2-1*60;  
        
        System.out.println("el numero de horas es: "+ horasTotales);
        System.out.println("el nuemro de minutos es:" +minutos);
    }
   
}
