package MultiplosDoNumero;

import java.util.Scanner;

public class MultiplosDoNumero {
    public static void main (String[] args) 
    {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Vamos Calular Os Múltiplos?");

        System.out.println("Me Informe o Número");
        float numero = entrada.nextFloat();

        float x2 = numero * 2;
        float x3 = numero * 3;

        System.out.println("Os Múltiplos são: " + numero + ", " + x2 + ", " + x3);
    }
}
