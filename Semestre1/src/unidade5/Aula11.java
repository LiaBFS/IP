package unidade5;

import java.util.Scanner;

public class Aula11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n=0;
        System.out.println("Digite um numero:");

        try{
            n = sc.nextInt();
        } catch (Exception ex){
            System.out.println("Numero invalido");
            ex.getMessage();
        }
    }

}
