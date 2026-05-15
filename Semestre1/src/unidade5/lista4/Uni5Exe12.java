package unidade5.lista4;

import java.util.Scanner;

public class Uni5Exe12 {
    public static void main(String[] args) {
        
        int n=0,numero=1;
        
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for(int i=1; i<=n;i++){
            for(int j=1; j<=i; j++){
             
                System.out.print(numero+" ");
                numero++;
            }
            System.out.println();
        }
        sc.close();
    }

}
