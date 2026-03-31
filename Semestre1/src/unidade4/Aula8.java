package unidade4;

import java.util.Scanner;

public class Aula8 {

    //SWITCH

    /**public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("digite um numero de 0 a 10");
        int opcao = sc.nextInt();

        switch(opcao) {
            case 1: // da pra substituir "1" pelo teste
                
                System.out.println("numero 1");
                break;

            case 2:
                System.out.println("numero 2");
                break;

            default:
                System.out.println("erro");
        }

        sc.close();

    }**/

    //SWITCH CHAR

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char letra = sc.next().toUpperCase().charAt(0);

        switch (letra) {
            case 'A':
                System.out.println("opcao A");
                break;

            default:
                System.out.println("digite A");
                break;
        }
        sc.close();
    }
    
}
