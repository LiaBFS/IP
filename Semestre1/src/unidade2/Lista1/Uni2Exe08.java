package unidade2.Lista1;

import java.util.Scanner;

public class Uni2Exe08 {

    public static void main(String[] args) {
        
        int id1;
        int id2;
        int n1;
        int n2;
        float valor1;
        float valor2;

        float valorT=0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Código do item 1:");
        id1 = sc.nextInt();
        System.out.println("Quantidade: ");
        n1 = sc.nextInt();
        System.out.println("Valor:");
        valor1 = sc.nextFloat();

        System.out.println("Código do item 2:");
        id2 = sc.nextInt();
        System.out.println("Quantidade: ");
        n2 = sc.nextInt();
        System.out.println("Valor:");
        valor2 = sc.nextFloat();

        valorT = ((valor1*n1)+(valor2*n2));
        System.out.println("Total = "+valorT);


    }

}
