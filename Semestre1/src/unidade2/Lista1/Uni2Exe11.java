package unidade2.lista1;

import java.util.Scanner;

public class Uni2Exe11 {

    public static void main(String[] args) {
        
        double A, B, C;

        System.out.println("Digite 3 valores:");
        Scanner sc = new Scanner(System.in);
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        double triangulo = (A*C)/2;
        double circulo = Math.PI*(Math.pow(C, 2));
        double trapezio = ((A+B)*C)/2;
        double quadrado = B*B;
        double retangulo = A*B;

        System.out.println("área do triângulo retângulo que tem A por base e C por altura: " +triangulo);
        System.out.println(" área do círculo de raio C: "+circulo);
        System.out.println("área do trapézio que tem A e B por bases e C por altura: "+trapezio);
        System.out.println("área do quadrado que tem lado B: "+quadrado);
        System.out.println("área do retângulo que tem lados A e B: "+retangulo);

    }

}
