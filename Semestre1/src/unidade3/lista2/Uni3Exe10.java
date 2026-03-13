package unidade3.lista2;

import java.util.Scanner;

public class Uni3Exe10 {

    private double catO, catA;

    public Uni3Exe10(double catO, double catA) {
        this.catO = catO;
        this.catA = catA;
    }

    public double calculaHipotenusa(){
        return Math.sqrt(Math.pow(catO, 2)+(Math.pow(catA, 2)));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double catO, catA, hip;

        System.out.println("Cateto oposto:");
        catO = sc.nextDouble();
        System.out.println("Cateto adjacente:");
        catA = sc.nextDouble();

        Uni3Exe10 exercicio10 = new Uni3Exe10(catO, catA);
        hip = exercicio10.calculaHipotenusa();

        System.out.println("Hipotenusa: "+hip);
        sc.close();
    }

}
