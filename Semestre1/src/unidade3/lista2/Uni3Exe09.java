package unidade3.lista2;

import java.util.Scanner;

public class Uni3Exe09 {

    private float raio,altura; 

    

    public Uni3Exe09(float raio, float altura) {
        this.raio = raio;
        this.altura = altura;
    }

    public float calculaVolume(){
        return (3.141592653589793f*(raio*raio))*altura;
    }


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        float raio,altura,volume;

        System.out.println("raio do cilindro:");
        raio = sc.nextFloat();
        System.out.println("Altura do cilindro:");
        altura = sc.nextFloat();

        Uni3Exe09 exercicio9 = new Uni3Exe09(raio, altura);
        volume = exercicio9.calculaVolume();

        System.out.println("volume: "+volume);

        sc.close();

    }

}
