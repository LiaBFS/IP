package unidade3.lista2;

import java.util.Scanner;

public class Uni3Exe11 {

    private float tC;

    public Uni3Exe11(float tC) {
        this.tC = tC;
    }

    public float calculaF(){
        return (this.tC * 9/5)+32;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float tC, tF;

        System.out.println("Temperatura em °C:");
        tC = sc.nextFloat();

        Uni3Exe11 exercicio11 = new Uni3Exe11(tC);
        tF = exercicio11.calculaF();

        System.out.println("Temperatura em °F: "+tF);
        sc.close();

    }

}
