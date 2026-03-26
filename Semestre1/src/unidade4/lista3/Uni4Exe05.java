package unidade4.lista3;

import java.util.Scanner;

public class Uni4Exe05 {

    public static void main(String[] args) {
        System.out.println("a cor é azul?");
        Scanner sc = new Scanner(System.in);
        String resposta = sc.nextLine();

        if(resposta.equalsIgnoreCase("sim")){
            System.out.println("sim");
        } else {
            System.out.println("não");
        }

        sc.close();
    }

}
