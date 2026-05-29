package unidade5.lista4;

import java.util.Scanner;

public class Uni5Exe20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double massaInicial=0, massaFinal, massaAtual, tempo=0;

        System.out.println("Massa Inicial:");
        massaInicial = sc.nextDouble();
        massaAtual = massaInicial;

        while((massaAtual) > 0.0005){
            massaAtual = massaAtual/2;
            tempo+=50;
        }
        massaFinal = massaAtual;
        System.out.println("Massa Inicial: "+massaInicial);
        System.out.println("Massa Final: "+massaFinal);
        System.out.println("Tempo: "+tempo+" segundos");

        sc.close();
    }

}
