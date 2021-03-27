package Tabuada;

import java.util.Scanner;

public class Tabuada {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Vamos Calular Os Múltiplos?");

        System.out.println("Me Informe o Número");
        float numero = entrada.nextFloat();

        float x2 = numero * 2;
        float x3 = numero * 3;
        float x4 = numero * 4;
        float x5 = numero * 5;
        float x6 = numero * 6;
        float x7 = numero * 7;
        float x8 = numero * 8;
        float x9 = numero * 9;
        float x10 = numero * 10;

        System.out.println("1 * " + numero + " = " + numero);
        System.out.println("2 * " + numero + " = " + x2);
        System.out.println("3 * " + numero + " = " + x3);
        System.out.println("4 * " + numero + " = " + x4);
        System.out.println("5 * " + numero + " = " + x5);
        System.out.println("6 * " + numero + " = " + x6);
        System.out.println("7 * " + numero + " = " + x7);
        System.out.println("8 * " + numero + " = " + x8);
        System.out.println("9 * " + numero + " = " + x9);
        System.out.println("10 * " + numero + " = " + x10);
    }
}
