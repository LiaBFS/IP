package unidade3.lista2;

import java.util.Scanner;

public class Uni3Exe04 {

    private float n1,n2,n3;

    public Uni3Exe04(float n1, float n2, float n3) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    public float calculaMedia(){
        return ((n1*5)+(n2*3)+(n3*2))/10;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        float n1,n2,n3;

        System.out.println("Nota 1:");
        n1 = sc.nextFloat();
        System.out.println("Nota 2:");
        n2 = sc.nextFloat();
        System.out.println("Nota 3:");
        n3 = sc.nextFloat();

        Uni3Exe04 exercicio4 = new Uni3Exe04(n1, n2, n3);
        float media = exercicio4.calculaMedia();

        System.out.println("Média ponderada: "+media);

        sc.close();
    }

}
