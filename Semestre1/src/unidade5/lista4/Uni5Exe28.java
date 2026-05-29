package unidade5.lista4;

import java.util.Scanner;

public class Uni5Exe28 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char continuar='s';
        int voto;
        int total=0;
        int[] totais = new int[4];

        while(String.valueOf(continuar).equalsIgnoreCase("S")){

            System.out.println("Em quem deseja votar? \n1- Nenhum de Nós\n" + //
                                "2-CPM22\n" + //
                                "3-Skank\n" + //
                                "4-Jota Quest");
            
            voto = sc.nextInt();
            total++;

            switch (voto) {
                case 1:
                    totais[0]++;
                    break;
                case 2:
                    totais[1]++;
                    break;
                case 3:
                    totais[2]++;
                    break;
                case 4:
                    totais[3]++;
                    break;
            
                default:
                    System.out.println("Código inválido");
                    break;
            }

            System.out.println("Mais um voto?(s/n)");
            continuar = sc.next().charAt(0);
        }


        System.out.println("Nenhum de Nós - "+totais[0]+" votos / "+((totais[0]*100)/total)+"%");
        System.out.println("CPM22 - "+totais[1]+" votos / "+((totais[1]*100)/total)+"%");
        System.out.println("Skank - "+totais[2]+" votos / "+((totais[2]*100)/total)+"%");
        System.out.println("Jota Quest - "+totais[3]+" votos / "+((totais[3]*100)/total)+"%");

        int pontoMaior=Integer.MIN_VALUE;
        int codMaior=0;
        for(int i=0; i<4;i++){
            if(totais[i]>pontoMaior){
                pontoMaior = totais[i];
                codMaior = i+1;
            }
        }
        switch (codMaior) {
                case 1:
                    System.out.println("Ganhador: Nenhum de Nós");
                    break;
                case 2:
                    System.out.println("Ganhador: CPM22");
                    break;
                case 3:
                    System.out.println("Ganhador: Skank");
                    break;
                case 4:
                    System.out.println("Ganhador: Jota Quest");
                    break;
            
                default:
                    break;
        }
        sc.close();
    }

}
