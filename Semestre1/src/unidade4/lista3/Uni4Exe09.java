package unidade4.lista3;

import java.util.Scanner;

public class Uni4Exe09 {

    public static void main(String[] args) {
        int n1,n2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Numeor 1:");
        n1 = sc.nextInt();

        System.out.println("Numero 2:");
        n2 = sc.nextInt();

        if (n1>n2){
            if(n1%n2 == 0){
                System.out.println("Multiplos");
            } else{
                System.out.println("Não multiplos");
            }
        } else{
            if(n2%n1 == 0){
                System.out.println("Multiplos");
            } else{
                System.out.println("Não multiplos");
            }
        }

        sc.close();
    }
    
}
