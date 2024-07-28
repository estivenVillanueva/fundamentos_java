public  class Solve {
    public static void main(String[] args){
        // ejercicios con casteo 

        /* ejercicio1

        int x = (double) 5.89 + (double) 3.45;
        System.out.println(x);

        */

        /* ejercicio2

        char c = 'A';
        int asciiValue = c;

        System.out.println("El valor ASCII de '" + c + "' es: " + asciiValue);
        */

        /*ejercicio3 el valor que imprimira

        double d = 100.04;
        long l = (long)d;
        int i = (int)l;
        System.out.println(i);

        */

        /*ejercicio4

        String numeroString = "123";
        int numeroInt = Integer.parseInt(numeroString);
        
        System.out.println("El número convertido es: " + numeroInt);

        */ 

        /*ejercicio5

        int resultado = (int) (char) (byte) -1;
        System.out.println("El resultado es: " + resultado);

        */

        /*ejercicio6

        int numero =65;
        char caracter =(char) numero;
        System.out.println("el numero 65 convertido a char es:"+ caracter);

        */

        /*ejercicio7

        //long numeroLargo = 1234567890L;
        //int numeroEntero = numeroLargo;  Esto causará un error de compilación

        long numeroLargo = 1234567890L;
        int numeroEntero = (int) numeroLargo; // Esto compila

        System.out.println("el numero es:"+numeroEntero);
        */

        /*ejercicio8

        float numeroFloat=3.14f;
        String numString = String.valueOf(numeroFloat);
        
        System.out.println("el float como string es:"+numString);

        */

        /*ejercicio9

        int resultado = (int) Math.round(3.7);
        System.out.println("El resultado es: " + resultado);

        */
    
        /*ejercicio10
        byte b= 50;
        short s=b;
        System.out.println("el valor de s (short)es:" +s);
        */

        //Operadores de Asignación

        /*ejercicio11
        int x = 10;
        x += 5;
        System.out.println("El valor de x es: " + x);
        */

        /*ejercicio12
        int x = 3;
        int y = 2;

        // Expresión original
        // y = y * (x + 5);

        // Expresión simplificada
        y *= (x + 5);

        System.out.println("El valor de y es: " + y);
        */

        /* ejercicio13

        int a = 15;
        a %= 4;
        System.out.println("El valor de a es: " + a);

        */

        /*ejercicio14 
        int x = 5;
        int y = 3;
        // Expresión original
        // x = x + y;
        // Expresión equivalente 
        x += y;

        System.out.println("El valor de x es: " + x);

        */

        /* ejercicio15
        int x = 5;
        System.out.println("x antes de la operación: " + x);
        
        x ^= 2;
        System.out.println("x después de la operación: " + x);
        */

        //Operadores de Incremento y Decremento


        /* ejercicio16
        int x = 5;
        int y = ++x; 

        System.out.println("x: " + x); 
        System.out.println("y: " + y);

        */

        /*ejercicio17 
        int a = 5;
        System.out.println(a++);
        System.out.println(a); 
        */

        /*ejercicio18
        int count = 10;
        System.out.println("Valor inicial de count: " + count);

        count--;
        System.out.println("Valor de count después del decremento: " + count);

        int otroCount = 10;
        System.out.println("Valor inicial de otroCount: " + otroCount);

        System.out.println("Valor de otroCount después del decremento: " + --otroCount);
        */

        /*ejercicio19
        int i = 5;
        System.out.println(i++); 
        System.out.println(i); 

        System.out.println(++i); 
        System.out.println(i); 
        */

        /*ejercicio20
        int x = 3;
        x = x++;
        System.out.println(x);
        */
    }

}