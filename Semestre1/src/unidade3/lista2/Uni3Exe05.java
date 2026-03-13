package unidade3.lista2;

import java.util.Scanner;

public class Uni3Exe05 {

    private int frangos;

    public Uni3Exe05(int frangos) {
        this.frangos = frangos;
    }

    public float calculaTotal(){
        float total = (float) frangos * 11.0f;
        return total;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int frangos;

        System.out.println("Quantidade de frangos:");
        frangos = sc.nextInt();

        Uni3Exe05 exercicio5 = new Uni3Exe05(frangos);
        float total = exercicio5.calculaTotal();

        System.out.println("O gasto total pra marcar "+frangos+" é R$"+total );

        sc.close();

    }

}
