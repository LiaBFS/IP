package unidade4.lista3;

import java.util.Scanner;

public class Uni4Exe08 {
    public static void main(String[] args) {

        System.out.println("Letra:");
        Scanner sc = new Scanner(System.in);
        char letra = sc.next().charAt(0);

        if(Character.toString(letra).equalsIgnoreCase("a") || Character.toString(letra).equalsIgnoreCase("e") || 
        Character.toString(letra).equalsIgnoreCase("i") || Character.toString(letra).equalsIgnoreCase("o") ||
        Character.toString(letra).equalsIgnoreCase("u")){

            System.out.println("Vogal");

        } else {
            System.out.println("Consoante");
        }
        sc.close();
    }
    
}
