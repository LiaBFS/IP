package unidade4.lista3;

import java.util.Scanner;

public class Uni4Exe03 {

    public static void main(String[] args) {
        int n1, n2;

        Scanner sc = new Scanner(System.in);
        System.out.println("digite 2 inteiros:");
        n1 = sc.nextInt();
        n2 = sc.nextInt();

        if (n1>n2){
            System.out.println("N1 é maior");

        } else if(n2>n1){
            System.out.println("N2 é maior");
        } else{
            System.out.println("iguais");
        }

        sc.close();
    }

}
