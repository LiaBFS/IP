package unidade2.lista1;

import java.util.Scanner;

public class Uni2Exe20 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int dobras=0;
        int quadrados = 0;

        System.out.println("digite o numero de dobras:");
        dobras = sc.nextInt();

        if (dobras%2 ==0){

            quadrados = (int) Math.pow(2,dobras);
            System.out.println("Quadrados: "+quadrados);
        } else{
            System.out.println("n de dobras impar");
        }

        sc.close();

    }

}
