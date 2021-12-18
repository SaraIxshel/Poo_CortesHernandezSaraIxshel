/*
Vamos a crear un programa que se encargue de realizar las siguientes operaciones

1.- Bono o descuento por edad
2.- Convertir numeros decimales a binarios
3.- Convertir temperaturas celcius, kelvine y rankine
4.- Numero de positivos y negativos segun una lista de numeros
5.- Tiendita peke
6.- Area y Perimetro de figuras geometricas
7.- Tabla
8.- Factorial
9.- Dibujitos de codigo
10.- Figuras huecas de codigo
11.- Patrones de codigos
12.- Diamante de codigo
13.- Calculadora
14.- Salir


*/ 

import java.util.Scanner;

class Operaciones{

    //Programa 1
    /*
    EL PROGRAMA DEBE SOLICITAR LA EDAD DEL USUARIO. SI ÉSTA ES MAYOR DE 65, 
    AL PRECIO DEL ABONO SE LE APLICA UN DESCUENTO DEL 40%. 
    SI LA EDAD ES MENOR QUE 21, SE PREGUNTA AL USUARIO SI SUS PADRES SON 
    SOCIOS. SI LA RESPUESTA ES AFIRMATIVA, SE LES APLICA UN DESCUENTO DEL 
    45%; EN CASO CONTRARIO, SE LES APLICA UN 25%. 

    variable edad
    condiciones
    */ 

    public static void main(String[] args){

        //objetos
        Scanner entrada = new Scanner(System.in);
        //Scanner letras = new Scanner(System.in);


        //variables
        int edad, opcion, socio, numbinario, total, numerototal, n, a, b, Num, n, grados2, operacion, fig, calculo;
        int cantidad = 0;
        int suma = 0;
        int positivos = 0;
        int negativos = 0;
        int i = 0;
        int j = 0;
        int asteriscosMaximos = 0;
        int numEspacios;
        double precio, bono, celsius, kelvine, rankine, resul, a1, c, d, e;
        char letras, operacion;
        float precios = 0;
        float resultado = 0;
        float a, b;
        int cantidad = 0; 
        String binario = "";


        //cuerpo del programa

        //menu de las opciones de arriba

        do{

        System.out.println("Bienvenido a tu primer programa de estructuras.");
        System.out.println("Por favor elija la opcion deseada:");
        System.out.println("1.- Descuento por edad");
        System.out.println("2.- Convertir numero decimal a binario");
        System.out.println("3.- Conversiones de temperatura");
        System.out.println("4.- Numeros positivos y negativos");
        System.out.println("5.- Tienda");
        System.out.println("6.- Area y Perimetros");
        System.out.println("7.- Tabla");
        System.out.println("8.- Factorial");
        System.out.println("9.- Dibujos de codigo");
        System.out.println("10.- Figura Hueca");
        System.out.println("11.- Patrones de codigo");
        System.out.println("12.- Diamente");
        System.out.println("13.- Calculadora");
        System.out.println("14.- Salir");

        //condicion switch para el menu

        opcion = entrada.nextInt();


        switch(opcion){

            case 1: //problema 1
                System.out.println("Ingresa el Bono A cobrar");
                bono = entrada.nextDouble();
                System.out.println("Ingresa la edad");
                edad = entrada.nextInt();
                //la estructura de condiciones
                // SI ÉSTA ES MAYOR DE 65, AL PRECIO DEL ABONO SE LE APLICA UN DESCUENTO DEL 40%.
                if(edad >= 65){
                    //proceso
                    bono = bono*.6;
                    System.out.println("Su descuento es de 40%");
                    System.out.println("El total a pagar es de: " + bono);
                }
                /*
                SI LA EDAD ES MENOR QUE 21, SE PREGUNTA AL USUARIO SI SUS PADRES SON 
                 SOCIOS. SI LA RESPUESTA ES AFIRMATIVA, SE LES APLICA UN DESCUENTO DEL 
                45%; EN CASO CONTRARIO, SE LES APLICA UN 25%. 
                */ 
                if(edad <= 21){
                    System.out.println("Si tus padres son socios ingresa 1, sino lo son ingresa 2");
                    socio = entrada.nextInt();

                    switch(socio){
                        case 1: 
                            bono = bono*.55;
                            System.out.println("Su descuento fue del 45%");
                            System.out.println("El total a pagar es de: " +bono);
                            break;
                        case 2: 
                            bono = bono*.75;
                            System.out.println("Su descuento fue del 25%");
                            System.out.println("El total a pagar es de: " +bono);
                            break;
                        default:
                        //es el caso por defecto osea los demas casos
                            System.out.println("Opcion no valida");

                    }
                }
                System.out.println("Tu edad es de: " + edad);
                System.out.println("El total a pagar es: " + bono);
                break;

                case 2:

                    System.out.println("Ingrese un numero positivo entero que desee convertir a binario");
                    numbinario = entrada.nextInt();
                    /*
                    Tengo que comprobar que sea positivo?
                    condicion donde numbinario > 0
                    entonces aplico el algoritmo de convertir a binario
                    sino no se puede convertir
                    */ 

                    if(numbinario > 0){
                        /*
                        Como el algoritmo para convertir un numero decimal en binario
                        aplicar al numbinario mod 2
                        */
                        while(numbinario > 0){
                            if(numbinario % 2 == 0){
                                binario = "0" + binario;
                            }else{
                                binario = "1" + binario;
                            }
                            numbinario = (int)numbinario / 2;
                        }
                    }else if (numbinario == 0){
                        binario = "0";
                    }else{
                        binario = "No se pudo convertir el numero, ingrese solo positivos.";
                    }
                    System.out.println("El numero convertirdo a binario es: " + binario);
                    break;

                case 3:
<<<<<<< HEAD
=======
                    //tarea
>>>>>>> 6641c3bad1acce1636a5e2758ed365a43b567c5e
                    System.out.println("Inserte 1 si los grados son celsius, 2 si es kelvine o 3 si son rankine");
                    grados = entrada.nextInt();
                    if(grados ==1){
                        System.out.println("Inserte los grados celsius");
                        celsius = entrada.nextDouble();
                        System.out.println("Inserte 1 si quiere convertir a kelvine o 2 si quiere convertir a rankine");
                        grados2 = entrada.nextInt();
                        if(grados2 == 1){
                            kelvine = celsius + 273.15;
                            System.out.println("Los grados celcius convertidos son: " + kelvine);
                        }else{
                            if(grados2 ==2){
                                rankine = (celsius * 1.8) + 491.67;
                                System.out.println("Los grados celsius convertidos son: " + rankine);
                            }else{
                                System.out.println("Su respuesta no es valida");
                            }
                        }
                    }else{
                        if(grados == 2){
                            System.out.println("Inserte los grados kelvine");
                            kelvine = entrada.nextDouble();
                            System.out.println("Inserte 1 si quiere convertir a celcius o 2 si quiere convertir a rankine");
                            grados2 = entrada.nextInt();
                            if(grados2 ==1){
                                celcius = kelvine - 273.15;
                                System.out.println("Los grados kelvine convertidos son: " + celcius);
                                }else{
                                    rankine = kelvine * 1.8;
                                    System.out.println("Los grados kelvine convertidos son: " + rankine);
                                }
                            }else{
                                if (grados == 3){
                                    System.out.println("Inserte los grados rankine");
                                    rankine = entrada.nextDouble();
                                    System.out.println("Inserte 1 si quiere convertir a celsius o 2 si quiere convertir a kelvine");
                                    grados2 = entrada.nextInt();
                                    if(grados2 ==1){
                                        celcius = (rankine - 491.67) * 1.8;
                                        System.out.println("Los grados rankine convertidos son: " + celsius);
                                    }else{
                                        System.out.println("Su respuesta no fue comprendida, intente de nuevo");
                                    }
                                }   break;
                            }    

                        }
                    }

                case 4:

                    /*
                    Un numero positivo y un num negativo
                    entonces para poder identificar si un numero positivo o negativo
                    debo de poder diferenciar si es 
                    num > 0
                    */ 

                    System.out.println("Inserte ¿cuantos numeros va a ingresar?");
                    total = entrada.nextInt();

                    do{
                        System.out.println("Inserte el numero");
                        numerototal = entrada.nextInt();

                        //condicion
                        if(numerototal == 0){
                            //contar cuantos positivos hubo
                            //vamos a ir acumulando el numero de positivos
                            positivos = positivos + 0;

                        }else{
                            if(numerototal > 0){
                                positivos = positivos +1;
                            }else{
                                negativos = negativos +1;
                            }
                        }

                        //saber el total
                        total = total-1;



                    }while(total != 0);

                    System.out.println("El total de positivos es: "+ positivos);
                    System.out.println("El total de negativos es: "+ negativos);

                    break;

                case 5:
                    System.out.println("¿Cuantos elementos vas a ingresar?");
                    total = entrada.nextInt();

                    for(int i = 1; i <= total; i++){
                        System.out.println("Ingresa el Precio producto");
                        precios = entrada.nextFloat();
                        System.out.println("Ingresa el Cantidad del Producto");
                        cantidad = entrada.nextInt();

                        resultado = precios * cantidad;
                    }

                    System.out.println("El resultado es: " + resultado);

                case 6:
<<<<<<< HEAD
                    System.out.println("Ingrese 1 si tiene un cuadrado, 2 si tiene un triangulo, 3 si tiene un rectangulo, 4 si tiene un circulo: ");
=======
                    //tarea
                     System.out.println("Ingrese 1 si tiene un cuadrado, 2 si tiene un triangulo, 3 si tiene un rectangulo, 4 si tiene un circulo: ");
>>>>>>> 6641c3bad1acce1636a5e2758ed365a43b567c5e
                    fig = entrada.nextInt();
                    switch(fig){
                        case 1:
                        System.out.println("Inserte cuanto mide un lado del cuadrado");
                        c = entrada.nextFloat();
                        System.out.println("Inserte 1 para calcular perimetro 2 para calcular area");
                        calculo = entrada.nextInt();
                        switch(calculo){
                            case 1:
                            resulo = c * 4;
                            System.out.println("El perimetro del cuadrado es: " + resul);
                        }   break;
    
                       case 2:
                        resul = c * c;
                        System.out.println("El area del cuadrado es: " + resul);
                        break;

                        default:
                        System.out.println("La respuesta no es correcta intente de nuevo");
                   
                       break;

                        case 2:
                        System.out.println("Inserte 1 para calcular perimetro 2 para calcular area");
                        calculo = entrada.nextInt();
                        switch(calculo){
                            case 1:
                            System.out.println("Inserte 1 cuanto mide el lado A del triangulo");
                            c = entrada.nextFloat();
                            System.out.println("Inserte cuanto mide el lado B del triangulo");
                            d = entrada.nextFloat();
                            System.out.println("Inserte cuanto mide el lado C del triangulo");
                            e = entrada.nextFloat();
                            resul = c + d + d;
                            System.out.println("El perimetro del triangulo es de: " + resul);
                            
                        }   
                            break;

                        case 2:
                        System.out.println("Inserte cuanto mide la base del triangulo");
                        c = entrada.nextFloat();
                        System.out.println("Inserte cuanto mide la altura del triangulo");
                        d = entrada.nextFloat();
                        resul = (c*d)/2;
                        System.out.println("El area del triangulo es: " + resul);
                        break;

                        default:
                        System.out.println("La respuesta no es correcta intente de nuevo");
                    }  
                        break;
                        case 3:
                        System.out.println("Inserte cuanto mide el lado A del rectangulo");
                        c = entrada.nextFloat();
                        System.out.println("Inserte cuanto mide el lado B del rectangulo");
                        d = entrada.nextFloat();
                        System.out.println("Inserte 1 para calcular perimetro 2 para calcular area");
                        calculo = entrada.nextInt();
                        switch(calculo){
                            case 1:
                            resul = (2*c + 2*d);
                            System.out.println("El perimetro del rectangulo es de: " + resul);
                            break;
                            case 2:
                            resul = c * d;
                            System.out.println("El area del rectangulo es de: " + resul);
                            break;
                            default:
                            System.out.println("La respuesta no es correcta, intente de nuevo");
                        } 
                            break;
                        case 4:
                        System.out.println("Inserte cuanto mide el radio del circulo");
                        c = entrada.nextFloat();
                        System.out.println("Inserte 1 para calcular perimetro 2 para calcular area");
                        calculo = entrada.nextInt();
                        switch(calculo){
                            case 1:
                            resul = 2* *pi;
                            System.out.println("El perimetro de el circulo es de: " + reul);
                            break;
                            case 2: 
                            a1 = Math.pow(c, 2);
                            resul = pi*a1;
                            System.out.println("El area del circulo es de: " + resul);
                            break;  
                            default:
                            System.out.println("La respuesta no es correcta intente de nuevo");
<<<<<<< HEAD

                        }
                            break;
=======
>>>>>>> 6641c3bad1acce1636a5e2758ed365a43b567c5e

                        }
                            break;
                case 7: 
                    for(n = 1; n<= 10; n++){
                        System.out.println(n + " " + (n*10)+ " " + (n*100) + " " + (n*1000));
                    }
                    break;

                case 8:
                    int Num , suma = 0 ;

                    System.out.println("Introduce el digito de sumatoria que no sea menor a 0 " ); 
                    Num = entrada.nextInt();

                    if(Num > 0);
                    {
                        for(int 1 = 1 ; 1 <= Num ; 1 ++){
                            suma = suma + 1;
                        }
                    System.out.println("El resultado de la sumatoria es: " + suma);
                    }
                    else
                    {
                        System.out.println("El valor es menor a 0 " );
                    }
                case 9:
                    /*
                    ESCRIBA UN PROGRAMA QUE LEA EL LADO DE UN CUADRADO Y A CONTINUACIÓN LO IMPRIMA 
                    EN FORMA DE ASTERISCOS SU PROGRAMA DEBERa PODER FUNCIONAR PARA CUADRADOS 
                    DE TODOS TAMAÑOS ENTRE 1 Y 20. 
                    */

                    System.out.println("Cuadrado Magico");
                    System.out.println("Inserta el num de lados: ");
                    n = entrada.nextInt();

                    if( n>= 1 && n <=20){
                        //se puede imprimir
                        //aqui tengo las filas
                        for(int i = 1; i<=n; i++){
                            //columnas
                            for(int j = 1; j<=n; j++){
                                System.out.print("* ");

                            }
                        System.out.println(" ");


                            
                        }
                    }else{
                        System.out.println("Error, el rango debe de ser entre 1 y 20, intente de nuevo");
                    }

                    break;



                case 10:

                    System.out.println("Cuadrado Magico Hueco (Como tu ex asi dejo tu kokoro wiiii)");
                    System.out.println("Inserta el num de lados: ");
                    n = entrada.nextInt();

                    if( n>= 1 && n <=20){
                        //se puede imprimir

                        //imprima la linea superior
                        for(int i = 0; i < n; i++){
                            System.out.print(" * ");
                        }
                        System.out.println();

                        //lo de enmedio solo quiero las esquinas
                        //cuadrado interno
                        //aqui tengo las filas
                        for(int i = 0; i < n-2; i++){
                            System.out.print(" * ");
                            //columnas
                            for(int j = 0; j < n-2; j++){
                                System.out.print("  ");

                            }
                        System.out.println("   * ");

                            
                        }

                        //imprimir la linea inferior
                        for(int i = 0; i < n; i++){
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }else{
                        System.out.println("Error, el rango debe de ser entre 1 y 20, intente de nuevo");
                    }

                    break;

                case 11:
                    

                case 12:
<<<<<<< HEAD
                
{
    int i =  0 ;
    int j =  0 ;
    int asteriscosMaximos =  0 ;
    int numEspacios;
    // pedimos los asteriscos en la línea central del rombo
    printf ( " \ n \ t \ t Dibujaremos un diamante formado por asteriscos. \ n \ n "
           " \ n Introduce un n% cmero mayor que 3 para ver bien el diamante. \ n " , 163 );
    printf ( " Cuantos asteriscos quieres que tenga el punto central de diamante: " );

    scanf ( " % d " , & asteriscosMaximos);
    numEspacios = asteriscosMaximos /  2 ;

    if (asteriscosMaximos >  3  &&  ! (asteriscosMaximos % 2 == 0 )) {
        para (i = 1 ; i <= asteriscosMaximos; i ++ ) {
            para (j = 0 ; j < numEspacios; j ++ ) {
                printf ( "  " );
            }
            para (j = 0 ; j < (asteriscosMaximos - (numEspacios * 2 )); j ++ ) {
                printf ( " * " );
            }
            para (j = 0 ; j < numEspacios; j ++ ) {
                printf ( "  " );
            }
            printf ( " \ n " );
            si (i < ((asteriscosMaximos / 2 ) + 1 )) {
               numEspacios - ;
            } más {
                numEspacios ++ ;
        }
    }
    } else  if (asteriscosMaximos >  3 ) {
        asteriscosMaximos = asteriscosMaximos + (asteriscosMaximos);
       numEspacios = asteriscosMaximos / 2 ;
        para (i = 1 ; i <= asteriscosMaximos; i ++ ) {
            para (j = 0 ; j < numEspacios; j ++ ) {
                printf ( "  " );
            }
            for (j = 0 ; j < (asteriscosMaximos - (numEspacios * 2 )); j ++ ) {
                si (i % 2 == 0 ) {
                   if (((j + numEspacios) % 2 ) ! = 0 ) {
                        printf ( " * " );
                    } más {
                        printf ( "  " );
                    }
                } más {
                    if (((j + numEspacios) % 2 ) == 0 ) {
                    printf ( " * " );
                    } más {
                        printf ( "  " );
                    }
                }
            }
            para (j = 0 ; j < numEspacios; j ++ ) {
                printf ( "  " );
            }
             printf ( " \ n " );
            si (i < ((asteriscosMaximos / 2 ) + 1 )) {
                numEspacios - ;
            } más {
                numEspacios ++ ;
            }
        }
    } más {
        put ( " \ n \ n \ t \ t El n \ x A3mero introducido no es mayor que 3. " );
    }
    return  0 ;
=======
                    //tarea
                    int main()
{
    int i = 0;
    int j = 0;
    int asteriscosMaximos = 0;
    int numEspacios;
    // pedimos los asteriscos en la línea central del rombo
    printf("\n\t\tDibujaremos un diamante formado por asteriscos.\n\n"
           "\n Introduce un n%cmero mayor que 3 para ver bien el diamante.\n", 163);
    printf (" Cuantos asteriscos quieres que tenga el punto central de diamante: ");

    scanf("%d", &asteriscosMaximos);
    numEspacios = asteriscosMaximos / 2;

    if (asteriscosMaximos > 3 && !(asteriscosMaximos%2==0)) {
        for (i=1; i<=asteriscosMaximos; i++) {
            for (j=0; j<numEspacios; j++) {
                printf(" ");
            }
            for (j=0; j<(asteriscosMaximos-(numEspacios*2)); j++) {
                printf("*");
            }
            for (j=0; j<numEspacios; j++) {
                printf(" ");
            }
            printf("\n");
            if (i < ((asteriscosMaximos/2)+1)){
               numEspacios--;
            } else {
                numEspacios++;
        }
    }
    } else if(asteriscosMaximos > 3) {
        asteriscosMaximos = asteriscosMaximos+(asteriscosMaximos);
       numEspacios = asteriscosMaximos/2;
        for (i=1; i<=asteriscosMaximos; i++){
            for (j=0; j<numEspacios; j++) {
                printf(" ");
            }
            for (j=0; j<(asteriscosMaximos-(numEspacios*2)); j++) {
                if(i%2==0){
                   if(((j+numEspacios)%2)!=0){
                        printf("*");
                    } else {
                        printf(" ");
                    }
                }else {
                    if(((j+numEspacios)%2)==0){
                    printf("*");
                    } else {
                        printf(" ");
                    }
                }
            }
            for (j=0; j<numEspacios; j++) {
                printf(" ");
            }
             printf("\n");
            if (i < ((asteriscosMaximos/2)+1)){
                numEspacios--;
            } else {
                numEspacios++;
            }
        }
    } else {
        puts("\n\n\t\tEl n\xA3mero introducido no es mayor que 3.");
    }
    return 0;

}

>>>>>>> 6641c3bad1acce1636a5e2758ed365a43b567c5e

}
                 
                case 13:

                    System.out.println("Calculadora maizsoro");
                    System.out.println("Ingresar un número");
                    a = entrada.nextInt();
                    System.out.println("Ingresa un segundo número");
                    b = entrada.nextInt();
                    System.out.println("Ingresa el tipo de operacion que deseas realizar : (+ , -, *, /)");
                    operacion = entrada.next().charAt(0);

                    /*
                    switch 
                        case +
                        case -
                        case *
                        case /
                    */ 

                    switch(operacion){
                        case '+' :
                            resultado = a+b;
                            System.out.println("La suma es de: " + resultado);
                            break;
                        case '-' :
                            resultado = a-b;
                            System.out.println("La resta es de: " + resultado);
                            break;
                        case '*' :
                            resultado = a*b;
                            System.out.println("La multiplicación es de: " + resultado);
                            break;
                        case '/' :
                            if(b != 0){
                                resultado = a/b;
                                System.out.println("La división es de: " + resultado);
                               
                            }else{
                                System.out.println("No es posible dividir entre 0");
                            }
                            break;
                        default :
                            System.out.println("Operación no valida");

                    }

                default:
                    System.out.println("Gracias por ver este hermoso programa :3");



        }
    
        System.out.println("¿Deseas repetir el programa? Si lo desea escriba s");
        /*
            para recibir la respuesta debo de obtener un caracter s
            para cuando se reciben char se utiliza ''
            para cuando se reciben String se utiliza ""
        */ 
    
        letras = entrada.next().charAt(0);
    
        //si el usuario ingresa si  solo detecto la s  es la posicion del caracter que queremos lee
    
    
    
    
    }while(letras == 's');
    //aqui se cierra el do

   

    }

}
