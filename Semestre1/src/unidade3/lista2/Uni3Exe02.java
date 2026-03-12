package unidade3.lista2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Exe02 {

    private float valorDoSapato, percentualDesconto;

    public Uni3Exe02(float valorDoSapato, float percentualDesconto) {
        this.valorDoSapato = valorDoSapato;
        this.percentualDesconto = percentualDesconto;
    }

    public float totalDesconto(){

        return this.valorDoSapato*(this.percentualDesconto/100);
    }

    public float valorAPagar(){
        return this.valorDoSapato - this.totalDesconto();
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        float valorDoSapato, percentualDesconto;

        System.out.println("Valor do calçado:");
        valorDoSapato = sc.nextFloat();
        percentualDesconto = 12.0f;

        Uni3Exe02 exercicio2 = new Uni3Exe02(valorDoSapato, percentualDesconto);

        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Total a pagar: "+df.format(exercicio2.valorAPagar())+ "R$"+"\nValor do desconto: "+df.format(exercicio2.totalDesconto())+"R$");

        sc.close();
    }

}
