package unidade4.lista3;

import java.util.Scanner;

public class Uni4Exe12 {

    public static void main(String[] args) {

        System.out.println("Lado 1:");
        Scanner sc = new Scanner(System.in);
        int lado1 = sc.nextInt();
        System.out.println("Lado 2:");
        int lado2 = sc.nextInt();
        System.out.println("Lado 3:");
        int lado3 = sc.nextInt();

        if(lado1<(lado2+lado3) && lado2<(lado1+lado3) && lado3<(lado1+lado2)){
            
            if(lado1 ==lado2 && lado1 == lado3){
                System.out.println("Equilatero");
            } else if (lado1 == lado2 || lado2 == lado3 || lado1 ==lado3){
                System.out.println("Isosceles");
            } else{
                System.out.println("Escaleno");
            }

        } else{
            System.out.println("Nao formam um triangulo");
        }

        sc.close();
        
    }

}
