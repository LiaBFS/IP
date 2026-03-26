package unidade4.lista3;

import java.util.Scanner;

public class Uni4Exe02 {

    public static void main(String[] args) {
        int valor;

        Scanner sc = new Scanner(System.in);
        System.out.println("Escreva um inteiro acima de 0:");
        valor = sc.nextInt();

        if (valor%2==0){
            System.out.println("Par");
        } else{
            System.out.println("Impar");
        }

        sc.close();
    }

}
