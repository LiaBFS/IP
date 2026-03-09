package unidade2.Lista1;

import java.util.Scanner;

public class Uni2Exe16 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int lata350 =0;
        int garrafa600 =0;
        int garrafa2 =0;

        System.out.println("informe a quantidade de latas 350ml: ");
        lata350 = sc.nextInt();

        System.out.println("informe a quantidade de garrafas 600ml: ");
        garrafa600 = sc.nextInt();

        System.out.println("informe a quantidade de garrafas 2L: ");
        garrafa2 = sc.nextInt();


        float totalLata = (float) lata350 * 0.35f;
        float totalG600 = (float) garrafa600 * 0.60f;

        float totalL = totalLata + totalG600 + ((float) garrafa2*2);
        System.out.println("Total: "+totalL+"L");

    }

}
