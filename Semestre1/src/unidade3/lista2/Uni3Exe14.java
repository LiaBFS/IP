package unidade3.lista2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Exe14 {

    private float distancia, tempo;

    public Uni3Exe14(float distancia, float tempo) {
        this.distancia = distancia;
        this.tempo = tempo;
    }

    public float calculaVelocidadeM(){

        return distancia/tempo;
        
    }

    public float calculaCombustivel(){
        return distancia/12;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float distancia, tempo;

        System.out.println("Distancia percorrida:");
        distancia = sc.nextFloat();
        System.out.println("Tempo:");
        tempo = sc.nextFloat();

        Uni3Exe14 exercicio14 = new Uni3Exe14(distancia, tempo);
        float velocidade = exercicio14.calculaVelocidadeM();
        float gasolina = exercicio14.calculaCombustivel();

        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("A velocidade média foi de "+df.format(velocidade)+
        " km/h e a quantidade de combustível usado foi "+df.format(gasolina)+" litros");

        sc.close();
    }

}
