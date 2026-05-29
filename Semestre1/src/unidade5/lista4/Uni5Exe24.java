package unidade5.lista4;

import java.util.Scanner;

public class Uni5Exe24 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float limiteD, peso, pesoT = 0;
        char continuar = 's';

        System.out.println("Limite diário (kg):");
        limiteD = sc.nextFloat();

        while (String.valueOf(continuar).equalsIgnoreCase("s")) {

            System.out.println("Peso do peixe (g):");
            peso = sc.nextFloat();

            pesoT += peso / 1000;

            System.out.println("Peso total no momento: " + pesoT + " kg");

            if (pesoT > limiteD) {
                System.out.println("Limite excedido.");
                break;
            }

            System.out.println("\nDeseja continuar? (s/n)");
            continuar = sc.next().charAt(0);
        }

        System.out.println("Peso total: " + pesoT + " kg");

        sc.close();
    }
}