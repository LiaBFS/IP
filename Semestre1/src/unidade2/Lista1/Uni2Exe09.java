package unidade2.Lista1;

import java.util.Scanner;

public class Uni2Exe09 {

    public static void main(String[] args) {
        
        double vD;
        double vR;

        System.out.println("Valor em dólar:");
        Scanner sc = new Scanner(System.in);
        vD = sc.nextDouble();

        vR = vD*5.26;
        System.out.println("Valor em Real = "+ vR);

    }

}
