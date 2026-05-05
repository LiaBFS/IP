package unidade5.lista4;

import java.util.Scanner;

public class Uni5Exe07 {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.println("termos:");
        int t = sc.nextInt();

        double menor=Double.MAX_VALUE,maior=Double.MIN_NORMAL;

        for (int i=1;i<=t;i++){
            System.out.println("Digite o numero "+i);
            double n = sc.nextDouble();

            if(n<menor){
                menor = n;
            } else if(n>maior){
                maior = n;
            }
        }
        System.out.println("maior: "+maior);
        System.out.println("menor: "+menor);
        sc.close();
    }
}
