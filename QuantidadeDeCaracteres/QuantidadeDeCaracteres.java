package QuantidadeDeCaracteres;

import java.util.Scanner;

public class QuantidadeDeCaracteres {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Me infomre seu nome que vou lhe informar a quantidade de caracteres");
        String nome = scanner.next();

        int length = nome.length();

        System.out.println("Seu nome tem: " + length + " letras");
    }
}
