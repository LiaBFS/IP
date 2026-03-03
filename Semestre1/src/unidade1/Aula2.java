package unidade1;

import java.util.ArrayList;
import java.util.Scanner;

public class Aula2 {

    //ÁREA

    /**public static void main(String[] args) {
        
        float frente;
        float lateral;

        Scanner sc = new Scanner(System.in);
        frente = sc.nextFloat();
        lateral = sc.nextFloat();


        float area = frente * lateral;

        System.out.println("Área = "+area);

        sc.close();

    }**/


        //MÉDIA PONDERADA - corrigir

    public static void main(String[] args) {
        
        float n1;
        float n2;
        float pf;
        float nEx[] = new float[6];
        float somaE=0;
        float mediaE;  
        float media;

        System.out.println("nota 1:");
        Scanner sc = new Scanner(System.in);
        n1 = sc.nextFloat();

        System.out.println("nota 2:");
        n2 = sc.nextFloat();

        System.out.println("nota projeto final:");
        pf = sc.nextFloat();

        
        for(int i=0; i<nEx.length; i++){
            System.out.println("nota do  exercicio "+ (i+1)+":");
            nEx[i] = sc.nextFloat();
            somaE = somaE + nEx[i];
        }

        mediaE = somaE/6;
        
        media = ((n1*0.2f)+(n2*0.3f)+(pf*0.3f)+(mediaE*0.2f));

        System.out.println("Média: "+media);



    }

}
