package unidade4.lista3;

import java.util.Scanner;

public class Uni4Exe04 {

    public static void main(String[] args) {
        float valor;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor:");
        valor = sc.nextFloat();

        if (valor % 1 != 0) {
            System.out.println("foram utilizadas casas decimais");
        } else {
            System.out.println("não tem casas decimais");
        }

        sc.close();
    }

}
