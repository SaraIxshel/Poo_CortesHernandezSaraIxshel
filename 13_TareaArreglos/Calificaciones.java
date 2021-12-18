
import java.util.Scanner;

/*
 Realice un programa que permita leer 10 calificaciones de 
 una asigantura y los guarde en un array para que muestre:

 Imprimir todas las calificaciones.

 Promedip de las calificaciones.

 La calificacion mas alta y la mas baja.

 El numero de calificaciones superiores al promedio.

 La cantidad de alumnos aprobados y reprobados.
*/

public class Calificaciones{
    public static void main(String[] args){

       
        Scanner entrada = new Scanner(System.in);
        int i;
        int calificaciones[] = new int[10];
        double promedio = 0, total = 0;

        System.out.println("Calificaciones");
        for (i = 1; i < 10; i++){
            System.out.println("calificaciones" + i + "=");
            calificaciones[i] = entrada.nextInt();
            total = total + calificaciones [i];
            promedio = total/10;

        }


        System.out.println("Total:" + total);
        System.out.println("promedio:" + promedio);

    }
}