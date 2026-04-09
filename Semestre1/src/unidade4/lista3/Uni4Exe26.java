package unidade4.lista3;

import java.util.Scanner;

public class Uni4Exe26 {

    public static void main(String[] args) {
        
        System.out.println("Escolha uma opcao:");
        System.out.println("T: calcular a área de um triângulo de base b e altura h\nQ: calcular a área de um quadrado de lado l\nR: calcular a área de um retângulo de base b e altura h\nC: calcular a área de um círculo de raio r");
        Scanner sc = new Scanner(System.in);
        char opcao = sc.next().toUpperCase().charAt(0);

        switch (opcao) {
            case 'T':
                System.out.println("digite a base e altura do triangulo:");
                float base = sc.nextFloat();
                float altura = sc.nextFloat();
                System.out.println("area: "+ base*altura/2);
                break;

            case 'Q':
                System.out.println("digite o lado do quadrado:");
                float lado = sc.nextFloat();
                System.out.println("area: "+lado*lado);
                break;

            case 'R':
                System.out.println("digite a base e a altura do retangulo:");
                float b = sc.nextFloat();
                float h = sc.nextFloat();
                System.out.println("area: "+ b*h);
                break;

            case 'C':
                System.out.println("digite o raio do circulo: ");
                float r = sc.nextFloat();
                System.out.println("area: "+ Math.PI*Math.pow(r, 2));
                break;
        
            default:
                System.out.println("invalido");
                break;
        }
        sc.close();
    }

}
