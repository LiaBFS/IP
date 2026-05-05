package unidade5.lista4;

import java.util.Scanner;

public class Uni5Exe08 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("termos:");
        int t = sc.nextInt();

        double media=0;
        int tPositivos=0;
        int menor = 0;

        for(int i=1;i<=t;i++){
            System.out.println("Digite o numero "+i);
            int n = sc.nextInt();

            if(n<0){
                if (n<menor){
                    menor = n;
                }
            } else{
                media = media+n;
                tPositivos++;
            }
        }
        System.out.println("menor n negativo: "+menor);
        System.out.println("media: "+media/tPositivos);
        sc.close();
    }

}
