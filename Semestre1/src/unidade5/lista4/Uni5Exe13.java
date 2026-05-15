package unidade5.lista4;

import java.util.Scanner;

public class Uni5Exe13 {

    public static void main(String[] args) {
        
        int n =0;
        float media=0, soma=0;
        Scanner sc = new Scanner(System.in);
        n =sc.nextInt();

        for(int i=1; i<=n;i++){

            System.out.println("Parada "+i);
            System.out.println("Quilometragem:");
            float km = sc.nextFloat();
            System.out.println("Combustivel:");
            float gas = sc.nextFloat();

            float kmL = km/gas;
            System.out.println("Parada "+i+": "+kmL+" km por L");
            soma += kmL;
        }

        media = soma/n;
        System.out.println("Km media por litro: "+media);

        sc.close();
    }

}
