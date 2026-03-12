package unidade2.lista1;

import java.util.Scanner;

public class Uni2Exe04 {

    public static void main(String[] args) {
        
        float n1,n2;

        Scanner sc = new Scanner(System.in);
        n1=sc.nextFloat();
        n2=sc.nextFloat();

        float media = ((n1*3.5f)+(n2*7.5f))/11;

        System.out.println(media);
        
        sc.close();
    }

}
