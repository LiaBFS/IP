package unidade4.lista3;

import java.util.Scanner;

public class Uni4Exe11 {

    public static void main(String[] args) {

        int i1,i2,i3;

        Scanner sc = new Scanner(System.in);
        System.out.println("Escreva a idade dos 3 filhos:");
        i1 = sc.nextInt();
        i2 = sc.nextInt();
        i3 = sc.nextInt();
        
        if (i1 == i2 && i1 == i3) {
            System.out.println("TRIGÊMEOS");
        } else if (i1 == i2 || i1 == i3 || i2 == i3) {
            System.out.println("GÊMEOS");
        } else {
            System.out.println("APENAS IRMÃOS");
        }

        sc.close();
        
    }
    
}
