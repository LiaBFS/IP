package unidade5.lista4;

import java.util.Scanner;

public class Uni5Exe15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome = "";
        float n1 = 0, n2 = 0;

        do {
            System.out.println("Nome:");
            nome = sc.nextLine();

            if (nome.equalsIgnoreCase("fim")) {
                break; 
            }

            System.out.println("Nota 1:");
            n1 = sc.nextFloat();
            System.out.println("Nota 2:");
            n2 = sc.nextFloat();
            sc.nextLine();

            float media = (n1 + n2) / 2;
            System.out.println("A média do " + nome + " é " + media);

        } while (true); 

        sc.close();
    }
}