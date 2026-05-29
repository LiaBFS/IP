package unidade5.lista4;

import java.util.Scanner;

public class Uni5Exe25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int D=0, E=0;
       char vez;
       System.out.println("Digite o primeiro jogador:");
       
       
       while(true){
            vez = sc.next().toUpperCase().charAt(0);

            if(vez =='D'){
                D++;

            } else if(vez =='E'){
                E++;
            } else{
                System.out.println("inválido");
                continue;
            }

            System.out.println("direita: "+D+ " / esquerda: "+E);

            if((D>= 21 || E>= 21) && Math.abs(D-E)>=2){
                break;
            }
       }

       if(D>E){
        System.out.println("direita venceu");
       } else{
        System.out.println("esquerda venceu");
       }
       sc.close();
    }

}
