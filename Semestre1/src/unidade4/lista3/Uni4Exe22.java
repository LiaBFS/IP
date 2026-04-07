package unidade4.lista3;

import java.util.Scanner;

public class Uni4Exe22 {

    public static void main(String[] args) {
        char opcao =0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o cod curso:");
        opcao = sc.next().charAt(0);

        switch (Character.toString(opcao)) {
            case "1":
                System.out.println("Bacharel em Ciência da Computação");
                break;
            case "2":
                System.out.println("Licenciado em Computação");
                break;
            case "3":
                System.out.println("Bacharel em Sistemas de Informação");
                break;

            default:
                System.out.println("Cod invalido");
                break;
        }

        sc.close();

    }

}
