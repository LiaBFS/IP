package unidade2.Lista1;

import java.util.Scanner;

public class Uni2Exe15 {

    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor total: ");
        double valor = sc.nextDouble();

        System.out.println("NOTAS:");
        System.out.println((int)valor/100+ " notas de 100");
        valor = valor % 100;
        System.out.println((int)valor/50+ " notas de 50");
        valor = valor % 50;
        System.out.println((int)valor/20+ " notas de 20");
        valor = valor % 20;
        System.out.println((int)valor/10+ " notas de 10");
        valor = valor % 10;
        System.out.println((int)valor/5+ " notas de 5");
        valor = valor % 5;
        System.out.println((int)valor/2+ " notas de 2");
        valor = valor % 2;
        System.out.println((int)valor/1+ " moedas de 1");
        valor = valor % 1;
        

        valor = valor *100.0;
        valor = Math.round(valor);

        System.out.println("MOEDAS:");
        System.out.println((int)valor/50+ " moedas de 50");
        valor = valor % 50;
        System.out.println((int)valor/25+ " moedas de 25");
        valor = valor % 25;
        System.out.println((int)valor/10+ " moedas de 10");
        valor = valor % 10;
        System.out.println((int)valor/5+ " moedas de 5");
        valor = valor % 5;
        
        



    }
    
}
