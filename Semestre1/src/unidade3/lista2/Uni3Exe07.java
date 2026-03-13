package unidade3.lista2;

import java.util.Scanner;

public class Uni3Exe07 {

    /**public static void main(String[] args) {
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

        sc.close();
    }**/

    private int lata350,garrafa600,garrafa2;

    public Uni3Exe07(int lata350, int garrafa600, int garrafa2) {
        this.lata350 = lata350;
        this.garrafa600 = garrafa600;
        this.garrafa2 = garrafa2;
    }

    public float calculaTotalLitros(){
        return ((float) lata350 *0.35f) + ((float) garrafa600 *0.60f) + ((float) garrafa2*2);

    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int lata350,garrafa2,garrafa600;

        System.out.println("quantidade de latas 350ml: ");
        lata350 = sc.nextInt();
        System.out.println("quantidade de garrafas 600ml: ");
        garrafa600 = sc.nextInt();
        System.out.println("quantidade de garrafas 2L: ");
        garrafa2 = sc.nextInt();

        Uni3Exe07 exercicio7 = new Uni3Exe07(lata350, garrafa600, garrafa2);
        float total = exercicio7.calculaTotalLitros();

        System.out.println("total litros: "+total+"L");
    }


}
