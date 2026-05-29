package unidade5.lista4;

import java.util.Scanner;

public class Uni5Exe31 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;
        int divisor = 2;

        System.out.println("Digite um número: ");
        numero = sc.nextInt();

        System.out.println("Número | Decomposição");

        while (numero > 1) {
            while (numero % divisor != 0) {
                divisor++;
            }
            System.out.println(numero + " | " + divisor);
            numero = numero / divisor;
        }

        System.out.println("1");
        
        sc.close();
    }

}
