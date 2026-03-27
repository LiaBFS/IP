package unidade4.lista3;

import java.util.Scanner;

public class Uni4Exe16 {
    public static void main(String[] args) {
        
        System.out.println("idade homes:");
        Scanner sc = new Scanner(System.in);
        int h1 = sc.nextInt();
        int h2 = sc.nextInt();

        System.out.println("idade mulheres:");
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();

        if(h1>h2 && m1>m2){
            System.out.println("Soma: "+(h1+m2)+" / Produto: "+(h2*m1));
        } else if (h1>h2 && m2>m1){
            System.err.println("Soma: "+(h1+m1)+" / Produto: "+(h2*m2));
        } else if (h2>h1 && m1>m2){
            System.out.println("Soma: "+(h2+m2)+" / Produto: "+(h1*m1));
        } else{
            System.out.println("Soma: "+(h2+m1)+" / Produto: "+(h1*m2));
        }
        sc.close();
    }
    
}
