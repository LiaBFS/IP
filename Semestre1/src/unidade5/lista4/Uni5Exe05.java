package unidade5.lista4;

import java.util.Scanner;

public class Uni5Exe05 {

    public static void main(String[] args) {
        
        int n=8, t;
        String sequencia="";
        Scanner sc = new Scanner(System.in);

        System.out.println("Termos:");
        t = sc.nextInt();

        t = t/2;

        for (int i=0; i<t; i++){
            sequencia += n +",";
            n = n+2;
            sequencia += n+",";
            n = (n-2)*2;
        }

        System.out.print(sequencia);
        sc.close();
    }
}
