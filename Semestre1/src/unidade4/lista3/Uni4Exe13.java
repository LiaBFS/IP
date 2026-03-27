package unidade4.lista3;

import java.util.Scanner;

public class Uni4Exe13 {
    public static void main(String[] args) {

        //prof vou fazer com for e vetor pq é mt chato com if

        int[] cartas = new int[3];
        
        System.out.println("Informe 3 cartas:");
        Scanner sc = new Scanner(System.in);
        cartas[0] = sc.nextInt();
        cartas[1] = sc.nextInt();
        cartas[2] = sc.nextInt();
        
        int qtCartasBoas = 0;

        for(int i=0; i<3; i++){

            if(cartas[i] == 1 || cartas[i] == 2 || cartas[i] == 3){
                qtCartasBoas++;
            } 
        }

        if(qtCartasBoas == 1){
            System.out.println("truco");
        } else if(qtCartasBoas == 2){
            System.out.println("seis");
        } else if(qtCartasBoas == 3){
            System.out.println("nove");
        }
        sc.close();
    }
    
}
