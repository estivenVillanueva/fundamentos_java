import java.util.Scanner;

public class Solve {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("Seleccione el número del ejercicio que desea ejecutar (1-30) o 0 para salir:");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    ejercicio1();
                    break;
                case 2:
                    ejercicio2();
                    break;
                case 3:
                    ejercicio3();
                    break;
                case 4:
                    ejercicio4();
                    break;
                case 5:
                    ejercicio5();
                    break;
                case 6:
                    ejercicio6();
                    break;
                case 7:
                    ejercicio7();
                    break;
                case 8:
                    ejercicio8();
                    break;
                case 9:
                    ejercicio9();
                    break;
                case 10:
                    ejercicio10();
                    break;
                case 11:
                    ejercicio11();
                    break;
                case 12:
                    ejercicio12();
                    break;
                case 13:
                    ejercicio13();
                    break;
                case 14:
                    ejercicio14();
                    break;
                case 15:
                    ejercicio15();
                    break;
                case 16:
                    ejercicio16();
                    break;
                case 17:
                    ejercicio17();
                    break;
                case 18:
                    ejercicio18();
                    break;
                case 19:
                    ejercicio19();
                    break;
                case 20:
                    ejercicio20();
                    break;
                case 21:
                    ejercicio21();
                    break;
                case 22:
                    ejercicio22();
                    break;
                case 23:
                    ejercicio23();
                    break;
                case 24:
                    ejercicio24();
                    break;
                case 25:
                    ejercicio25();
                    break;
                case 26:
                    ejercicio26();
                    break;
                case 27:
                    ejercicio27();
                    break;
                case 28:
                    ejercicio28();
                    break;
                case 29:
                    ejercicio29();
                    break;
                case 30:
                    ejercicio30();
                    break;
                case 0:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elija un número entre 1 y 30, o 0 para salir.");
            }
        }
        
        scanner.close();
    }

    public  static void ejercicio1() {
        int x1 = (int) ((double) 5.89 + (double) 3.45);
        System.out.println(x1);
    }

    public  static void ejercicio2() {
        char c2 = 'A';
        int asciiValue = c2;
        System.out.println("El valor ASCII de '" + c2 + "' es: " + asciiValue);
    }

    public  static void ejercicio3() {
        double d3 = 100.04;
        long l3 = (long) d3;
        int i3 = (int) l3;
        System.out.println(i3);
    }

    public  static void ejercicio4() {
        String numeroString = "123";
        int numeroInt = Integer.parseInt(numeroString);
        System.out.println("El número convertido es: " + numeroInt);
    }

    public  static void ejercicio5() {
        int resultado5 = (int) (char) (byte) -1;
        System.out.println("El resultado es: " + resultado5);
    }

    public  static void ejercicio6() {
        int numero6 = 65;
        char caracter = (char) numero6;
        System.out.println("El número 65 convertido a char es: " + caracter);
    }

    public  static void ejercicio7() {
        long numeroLargo = 1234567890L;
        int numeroEntero = (int) numeroLargo;
        System.out.println("El número es: " + numeroEntero);
    }

    public  static void ejercicio8() {
        float numeroFloat = 3.14f;
        String numString = String.valueOf(numeroFloat);
        System.out.println("El float como string es: " + numString);
    }

    public  static void ejercicio9() {
        int resultado9 = (int) Math.round(3.7);
        System.out.println("El resultado es: " + resultado9);
    }

    public  static void ejercicio10() {
        byte b10 = 50;
        short s10 = b10;
        System.out.println("El valor de s (short) es: " + s10);
    }

    public  static void ejercicio11() {
        int x11 = 10;
        x11 += 5;
        System.out.println("El valor de x es: " + x11);
    }

    public  static void ejercicio12() {
        int x12 = 3;
        int y12 = 2;
        y12 *= (x12 + 5);
        System.out.println("El valor de y es: " + y12);
    }

    public static void ejercicio13() {
        int a13 = 15;
        a13 %= 4;
        System.out.println("El valor de a es: " + a13);
    }

    public static void ejercicio14() {
        int x14 = 5;
        int y14 = 3;
        x14 += y14;
        System.out.println("El valor de x es: " + x14);
    }

    public  static void ejercicio15() {
        int x15 = 5;
        System.out.println("x antes de la operación: " + x15);
        x15 ^= 2;
        System.out.println("x después de la operación: " + x15);
    }

    public  static void ejercicio16() {
        int x16 = 5;
        int y16 = ++x16;
        System.out.println("x: " + x16);
        System.out.println("y: " + y16);
    }

    public  static void ejercicio17() {
        int a17 = 5;
        System.out.println(a17++);
        System.out.println(a17);
    }

    public  static void ejercicio18() {
        int count = 10;
        System.out.println("Valor inicial de count: " + count);
        count--;
        System.out.println("Valor de count después del decremento: " + count);
        int otroCount = 10;
        System.out.println("Valor inicial de otroCount: " + otroCount);
        System.out.println("Valor de otroCount después del decremento: " + --otroCount);
    }

    public  static void ejercicio19() {
        int i19 = 5;
        System.out.println(i19++);
        System.out.println(i19);
        System.out.println(++i19);
        System.out.println(i19);
    }

    public  static void ejercicio20() {
        int x20 = 3;
        x20 = x20++;
        System.out.println(x20);
    }

    public  static void ejercicio21() {
        int i21 = 5;
        i21 += ++i21 + i21++ + ++i21;
        System.out.println(i21);
    }

    public  static void ejercicio22() {
        double numeroDouble = 5.5;
        int numeroInt22 = (int) numeroDouble;
        System.out.println("Número entero: " + numeroInt22);
        numeroInt22++;
        System.out.println("Número entero incrementado: " + numeroInt22);
    }

    public  static void ejercicio23() {
        double d23 = 5.7;
        int i23 = (int) d23;
        i23 *= 2;
        System.out.println(i23--);
    }

    public  static void ejercicio24() {
        int num24 = 10;
        double result24 = num24;
        result24 /= 2.0;
        System.out.println("El resultado es: " + result24);
    }

    public static void ejercicio25() {
        char c25 = 'X';
        c25 += 32;
        System.out.println(c25);
    }

    public static void ejercicio26() {
        long numeroLong26 = 1000;
        short numeroShort26 = (short) numeroLong26;
        System.out.println("Número short: " + numeroShort26);
        numeroShort26 *= 3;
        System.out.println("Número short multiplicado: " + numeroShort26);
    }

    public static void ejercicio27() {
        int X27 = 10;
        X27 += (X27++) + (++X27);
        System.out.println("x = " + X27);
    }

    public static void ejercicio28() {
        float numeroFloat28 = 10.5f;
        byte numeroByte28 = (byte) numeroFloat28;
        System.out.println("Número byte: " + numeroByte28);
        --numeroByte28;
        System.out.println("Número byte después del predecremento: " + numeroByte28);
    }

    public static void ejercicio29() {
        int I29 = 257;
        byte b29 = (byte) I29;
        System.out.println(b29);
    }

    public static void ejercicio30() {
        double NumeroDouble30 = 10.5;
        int NumeroInt30 = (int) NumeroDouble30;
        NumeroInt30 += 5;
        NumeroInt30++;
        System.out.println("Número int final: " + NumeroInt30);
    }
} 