package unidade4.lista3;

import java.util.Scanner;

public class Uni4Exe27 {
    public static void main(String[] args) {
        
        int hrC, minC, hrS, minS;
        float valor;

        System.out.println("Hora chegada: ");
        Scanner sc = new Scanner(System.in);
        hrC = sc.nextInt();
        System.out.println("Minuto chegada: ");
        minC = sc.nextInt();
        System.out.println("Hora saida:");
        hrS = sc.nextInt();
        System.out.println("Minuto saida: ");
        minS = sc.nextInt();

        if(hrC >= 0 && hrC < 24 && minC >= 0 && minC <= 59 && hrS >= 0 && hrS < 24 && minS >= 0 && minS <= 59){

            int minCTotal = (hrC * 60)+minC;
            int minSTotal = (hrS * 60)+minS;
            int minTotal = minSTotal - minCTotal;
            int qntHoras = minTotal / 60;
            int qntMin = (minTotal % 60);

            if(qntMin >= 30){
                qntHoras += 1;

            }

            switch (qntHoras) {
                case 0:
                case 1:
                    valor = 5;
                    break;
                case 2:
                    valor = 10;
                    break;
                case 3:
                    valor = 17.5f;
                    break;
                case 4:
                    valor = 25;
                    break;
                    
                default:
                    valor = 25 + (10* (qntHoras - 4));
                    break;
            }

            System.out.println("Preço: "+valor);

        } else {
            System.out.println("invalido");
        }
        sc.close();


    }

}
