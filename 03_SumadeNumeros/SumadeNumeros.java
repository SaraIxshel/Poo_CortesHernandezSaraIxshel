/*

Para poder hacer le programa de la suma de dos numeros

debemos de entender el algoritmo de la suma

declarar vaariables

num1 num2 resultado

1.- solo unavez se sume?
2.- voy a quere que se sumen Los numeros y que se repita

*/

//es necesario ocupar Librerias dentro de java para algunos procesos
//vamos a ocupar la Libreria Scanner que nos sirve para obtener la entrada de datos

import java.util.Scanner;

class SumadeNumeros{

    //el identado del codigo
    //metodo principal
    public static void main(String[] args){

        //definir un objeto de la Libreria Scanner que nos sirva para obtener Los datos
        Scanner entrada = new Scanner(System.in);
        /*
        Para realizar una instancia del objeto se debe de colocar:

        Nombreclase nombreobjeto = new Nombredeclase();

        System.in Es una clase superior deonde nostoros podemos obtener los 
        datos que vienen por parte de la entrada estandar de la computadora
        (por parte de la consola)
        */

        //definicion de variables
        int num1, num2;
        int resultado;

        System.out.println("Introduce el primer numero a sumar: ");
        //asignar el primer numero a su variabale
        num1 = entrada.nextInt();
        System.out.println("Introduce el segundo numero a sumar: ");
        //asignar el segundo numero a su vaariable
        num2 =entrada.nextInt();

        resultado = num1 + num2;

        System.out.println("El resultado de la suma es: " + resultado);
        
    }
}