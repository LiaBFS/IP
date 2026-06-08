package unidade6.lista5;

import java.util.Scanner;

public class Uni6Exe04 {

    private Scanner sc = new Scanner(System.in);
    private int[] vetor1 = new int[10];
    private int[] vetor2 = new int[10];
    private int[] somas = new int[10];

    public Uni6Exe04() {
    }

    public void lerValores(){
        System.out.println("Valores vetor 1:");
        for(int i=1;i<=10;i++){
            System.out.print("Numero "+i+": ");
            vetor1[i-1] = sc.nextInt();
        }
        System.out.println("\nValores vetor 2:");
        for(int i=1;i<=10;i++){
            System.out.print("Numero "+i+": ");
            vetor2[i-1] = sc.nextInt();
        }
    }

    public void somar(){
        for(int i=0;i<10;i++){
            somas[i] = vetor1[i]+vetor2[i];
            
        }
    }

    public void escreverValores(){
        for(int i=0;i<10;i++){
            System.out.println("Resultado "+(i+1)+": "+vetor1[i]+" (vetor1) + "+vetor2[i]+" (vetor2) = "+somas[i]+" (vetor3)");
        }
    }

    public static void main(String[] args) {
        Uni6Exe04 classe = new Uni6Exe04();
        classe.lerValores();
        classe.somar();
        classe.escreverValores();
    }

}
