package unidade2.lista1;

import java.util.Scanner;

public class Uni2Exe03 {


    public static void main(String[] args) {
        
        //Não há informações o suficiente pq não especificou o raio e nem pediu pra ler

        //Fazendo com o scanner

        double raio;

        Scanner sc = new Scanner(System.in);
        raio = sc.nextDouble();

        double area = (Math.pow(raio,2)) *  Math.PI;

        System.out.println(area);

    }
}
