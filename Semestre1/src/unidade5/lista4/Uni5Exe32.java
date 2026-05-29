package unidade5.lista4;

import java.util.Scanner;

public class Uni5Exe32 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p,n;


        System.out.println("Primeiro dia da semana: ");
        p = sc.nextInt();
        System.out.println("Número de dias do mês: ");
        n = sc.nextInt();
        System.out.println(" D   S   T   Q   Q   S   S");

        int col = 1;
        while (col < p) {
            System.out.print("    ");
            col++;
        }

        int dia = 1;
        while (dia <= n) {
            System.out.printf("%2d  ", dia);
            if (col == 7) {
                System.out.println();
                col = 1;
            } else {
                col++;
            }
            dia++;
        }

        System.out.println();
        sc.close();
    }

}
