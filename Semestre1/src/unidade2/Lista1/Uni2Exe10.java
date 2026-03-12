package unidade2.lista1;

import java.util.Scanner;

public class Uni2Exe10 {

    public static void main(String[] args) {
        
        int n;
        int h=0;
        int m=0;
        int s=0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a duração do evento (s):");
        n = sc.nextInt();

        for(int i=0; i<n; i++){

          
            if(n/3600 > 0){
                h = h+1;
                n = n-3600;
            }else{
                if(n/60 > 0){
                    m = m+1;
                    n = n-60;
                }else{
                        s = n;
                    }
                
                }
            }

            System.out.println(h+":"+m+":"+s);

            sc.close();
    }


}
