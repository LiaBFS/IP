package unidade2.lista1;

import java.util.Scanner;

public class Uni2Exe05 {

    public static void main(String[] args) {
        
        int a,b,c,d;

        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=sc.nextInt();

        int diferenca = (a*b)-(c*d);

        System.out.println(diferenca);
    }

}
