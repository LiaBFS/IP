package unidade6.lista5;

import java.util.Scanner;

public class Uni6Exe03 {

    Scanner sc = new Scanner(System.in);
    double[] valores = new double[12];

    public Uni6Exe03() {
    }

    public void lerValores(){
        for(int i=0; i<12;i++){
            System.out.println("Digite um valor:");
            valores[i] = sc.nextDouble();
        }
    }

    public void ajustaValores(){
        for(int i=0;i<12;i++){
            if(i%2==0){
                valores[i] += valores[i]*0.05;
            } else {
                valores[i] += valores[i]*0.02;
            }
        }
    }

    public void escreverValores(){
        for(int i=0;i<12;i++){
            System.out.println("Valor "+i+": "+valores[i]);
        }
    }


    public static void main(String[] args) {
        Uni6Exe03 classe = new Uni6Exe03();
        classe.lerValores();
        classe.ajustaValores();
        classe.escreverValores();

    }

}
