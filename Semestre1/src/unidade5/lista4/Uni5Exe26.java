package unidade5.lista4;

import java.util.Scanner;

public class Uni5Exe26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double maximo, pedagio;
        int distancia, acima=0, total=0, trechos150=0;

        System.out.println("Maximo:");
        maximo = sc.nextDouble();

        while(true){
            System.out.println("Pedágio:");
            pedagio = sc.nextDouble();

            if(pedagio<0){
                break;
            }

            System.out.println("distancia:");
            distancia = sc.nextInt();

            total++;
            if(pedagio>maximo){
                acima++;
            }
            if(distancia>150 && pedagio<=maximo){
                trechos150++;
            }
        }
        System.out.println(acima+ " trechos acima do valor");
        System.out.println(total+ " trechos informados");
        System.out.println(trechos150 +" trechos acima de 150km c valor aceito");
        sc.close();
    }

}
