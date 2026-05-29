package unidade5.lista4;

import java.util.Scanner;

public class Uni5Exe29 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valor;

        System.out.println("Digite o valor: ");
        valor = sc.nextInt();

        int ced20 = 0,ced10 = 0,ced5 = 0, ced2 = 0,ced1 = 0;

        while (valor >= 20) {
            valor = valor - 20;
            ced20++;
        }

        while (valor >= 10) {
            valor = valor - 10;
            ced10++;
        }

        while (valor >= 5) {
            valor = valor - 5;
            ced5++;
        }


        while (valor >= 2) {
            valor = valor - 2;
            ced2++;
        }

  
        while (valor >= 1) {
            valor = valor - 1;
            ced1++;
        }

        System.out.println("Quantidade de cédulas:");
        System.out.println("20 = " + ced20);
        System.out.println("10 = " + ced10);
        System.out.println("5 = " + ced5);
        System.out.println("2 = " + ced2);
        System.out.println("1 = " + ced1);

        sc.close();
    }
}
