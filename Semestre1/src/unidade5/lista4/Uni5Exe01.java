package unidade5.lista4;

import java.util.Scanner;

public class Uni5Exe01 {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     

        for (int i=0; i<20; i++){
            System.out.println("Digite um inteiro:");
            i = sc.nextInt();
            if (i == 0){
                System.out.println("Zero");
            } else{
                if(i%2 == 0){
                    System.out.println("Par");
                } else {
                    System.out.println("ímpar");
                }   
            }

        }
        sc.close();


    }

}
