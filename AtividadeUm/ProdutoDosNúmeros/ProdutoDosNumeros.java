package ProdutoDosNúmeros;

import java.util.Scanner;

public class ProdutoDosNumeros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Vamos Calcular o Produto?");

        System.out.println("Me Informe o Valor de A");
        float a = entrada.nextFloat();

        System.out.println("Me Informe o Valor de B");
        float b = entrada.nextFloat();

        System.out.println("Me Informe o Valor de C");
        float c = entrada.nextFloat();

        double resultado = c / a;

        System.out.println("O produto é: " + resultado);
    }
}
