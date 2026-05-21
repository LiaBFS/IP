package unidade6.lista5;

import java.util.Scanner;

public class Uni6Exe02 {

    private Scanner sc = new Scanner(System.in);
    private double[] valores = new double[12];
    private double media=0;

    public Uni6Exe02(){

    }

    public void lerValores(){
        for(int i=1; i<=12; i++){
            System.out.println("Digite um numero:");
            valores[i] = sc.nextDouble();
        }
    }

    public void calculaMedia(){
        double soma=0;
        for(int i=1; i<=12; i++){
            soma += valores[i];
        }
        media = soma/12;
    }

    public void listaValsMaior(){
        for(int i=1;i<=12;i++){
            if(valores[i]>media){
                System.out.println("Valor "+valores[i]+" maior que a média "+media);
            }
        }
    }

    public static void main(String[] args) {
        Uni6Exe02 classe = new Uni6Exe02();
        classe.lerValores();
        classe.calculaMedia();
        classe.listaValsMaior();

    }

}
