package unidade5.lista4;

import java.util.Scanner;

public class Uni5Exe17 {

    public static void main(String[] args) {
        
        int nInsc =-1;
        double altura =0;
        double alturaAlto=Double.MIN_VALUE;
        double alturaBaixo=Double.MAX_VALUE;
        int nAlto=0;
        int nBaixo=0;
        double aTotal=0;
        int iTotal=0;
        Scanner sc = new Scanner(System.in);


        while(nInsc!=0){
            System.out.println("Numero da inscrição:");
            nInsc = sc.nextInt();
            if(nInsc==0){
                break;
            }
            System.out.println("Altura:");
            altura = sc.nextDouble();


            if(altura>alturaAlto){
                alturaAlto = altura;
                nAlto = nInsc;
            } 
            if(altura<alturaBaixo){
                alturaBaixo = altura;
                nBaixo = nInsc;
            }

            aTotal += altura;
            iTotal++;
        }

        System.out.println("Altura mais baixo: "+alturaBaixo +" / N de inscrição: "+nBaixo);
        System.out.println("Altura mais alto: "+alturaAlto +" / N de inscrição: "+nAlto);
        System.out.println("Media alturas: "+aTotal/iTotal);
        sc.close();

    }

}
