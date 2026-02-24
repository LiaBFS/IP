package unidade1;

import java.util.Scanner;

public class Aula1 {

    /**public static void main(String[] args) {
        
        System.out.println( "oi");

        System.out.println("Texto\ndividido");

        System.out.print("Texto ");
        System.out.println("sem ln");

    } **/

        // MEDIA

    public static void main(String[] args) {
        
        float n1;
        float n2;
        float n3;
        float dv;

        System.out.println("Digite 3 notas:");
        Scanner sc = new Scanner(System.in);
        n1 = sc.nextFloat();
        n2 = sc.nextFloat();
        n3 = sc.nextFloat();

        System.out.println("Escolha um divisor para média:");
        dv = sc.nextFloat();

        float media = (n1+n2+n3)/dv;

        System.out.println("Media = "+ media);

    }

}
