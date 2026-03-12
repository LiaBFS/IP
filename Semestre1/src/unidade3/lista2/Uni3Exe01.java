package unidade3.lista2;

import java.util.Scanner;

public class Uni3Exe01 {


    private int largura, comprimento;

    public Uni3Exe01(int largura, int comprimento){
        this.largura = largura;
        this.comprimento = comprimento;

    }

    public int calculaArea(){
        return this.largura*this.comprimento;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int largura, comprimento;

        System.out.println("Largura: ");
        largura = sc.nextInt();
        System.out.println("Comprimento:");
        comprimento = sc.nextInt();

        Uni3Exe01 exercicio1 = new Uni3Exe01(largura, comprimento);
        int area = exercicio1.calculaArea();
        System.out.println("Area: "+area);

        sc.close();
    }

}
