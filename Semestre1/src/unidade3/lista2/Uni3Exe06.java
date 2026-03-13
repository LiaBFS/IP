package unidade3.lista2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Exe06 {

    float pesoPratoC;

    public Uni3Exe06(float pesoPratoC) {
        this.pesoPratoC = pesoPratoC;
    }

    public float calculaValor(){
        return (pesoPratoC-0.75f)*25;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float pesoPratoC, valor;

        System.out.println("peso do prato montado:");
        pesoPratoC = sc.nextFloat();

        Uni3Exe06 exercicio6 = new Uni3Exe06(pesoPratoC);
        valor = exercicio6.calculaValor();

        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Valor a pagar: "+df.format(valor)+"R$");

        sc.close();
    }

}
