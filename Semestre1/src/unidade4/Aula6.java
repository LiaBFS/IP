package unidade4;

import java.util.Scanner;

public class Aula6 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua idade:");
        int idade = sc.nextInt();

        if (idade<18 || idade >=65){
            System.out.println("Ganha meia entrada");
        } else{
            System.out.println("Não ganha meia entrada");
        }

    }

}
