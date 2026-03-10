package unidade2.lista1;

import java.util.Scanner;

public class Uni2Exe12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        double x1 =0, y1 =0, x2 =0, y2 =0;

        System.out.println("informe o X do primeiro ponto: ");
        x1 = sc.nextDouble();
        System.out.println("informe o Y do primeiro ponto: ");
        y1 = sc.nextDouble();

        System.out.println("informe o X do segundo ponto: ");
        x2 = sc.nextDouble();
        System.out.println("informe o Y do segundo ponto: ");
        y2 = sc.nextDouble();

        double subtracaoX = (x2-x1);
        double subtracaoY = (y2-y1);
        double dentroRaiz = (Math.pow(subtracaoX, 2)) + (Math.pow(subtracaoY, 2));
        double distancia = Math.sqrt(dentroRaiz);

        System.out.printf("Distancia: %.4f%n", distancia);

    }

}
