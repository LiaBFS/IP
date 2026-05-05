package unidade5.lista4;

import java.util.Scanner;

public class Uni5Exe06 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double somaAltura=0;
        for(int i=1; i<=20;i++){
            System.out.println("digite a altura da pessoa "+i);
            somaAltura = sc.nextDouble();
        }
        somaAltura = somaAltura/2;
        System.out.println("média: "+somaAltura);
        sc.close();

    }

}
