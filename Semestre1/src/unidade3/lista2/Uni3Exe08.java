package unidade3.lista2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Exe08 {

    private float qtDolar, cotacao;

    public Uni3Exe08(float qtDolar, float cotacao) {
        this.qtDolar = qtDolar;
        this.cotacao = cotacao;
    }

    public float transformaReal(){
        return qtDolar *cotacao;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        float qtDolar,cotacao,qtReal;

        System.out.println("quantidade de dólares:");
        qtDolar = sc.nextFloat();
        System.out.println("cotação:");
        cotacao = sc.nextFloat();

        Uni3Exe08 exercicio8 = new Uni3Exe08(qtDolar, cotacao);
        qtReal = exercicio8.transformaReal();


        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("quantidade em real: "+df.format(qtReal));

        sc.close();
    }

}
