package MultiplosDoNumero;

import java.util.Scanner;

public class MultiplosDoNumero {
    public static void main (String[] args) 
    {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Vamos Calular Os M�ltiplos?");

        System.out.println("Me Informe o N�mero");
        float numero = entrada.nextFloat();

        float x2 = numero * 2;
        float x3 = numero * 3;

        System.out.println("Os M�ltiplos s�o: " + numero + ", " + x2 + ", " + x3);
    }
}
