package unidade2.Lista1;

import java.util.Scanner;

public class Uni2Exe18 {

    public static void main(String[] args) {
        
        float c, a;

        Scanner sc = new Scanner(System.in);
        System.out.println("altura:");
        a = sc.nextFloat();
        System.out.println("comprimento:");
        c = sc.nextFloat();

        float azulejos = (a*c)*9;

        float valor = azulejos*12.50f;
        System.out.println("valor:"+valor);

    }

}
