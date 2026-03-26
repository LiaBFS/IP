package unidade4.lista3;

import java.util.Scanner;

public class Uni4Exe01 {

    public static void main(String[] args) {
        
        float horaMes, valorPago, salarioTotal, salarioExtra;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite as horas trabalhadas por mês e o valor ganho por hora:");
        horaMes = sc.nextFloat();
        valorPago = sc.nextFloat();

        salarioTotal = horaMes*valorPago;

        if(horaMes>160){
            salarioExtra = (horaMes-160)*(valorPago/2);
            salarioTotal = salarioTotal+salarioExtra;
        } 

        System.out.println("Salario:"+salarioTotal);
        sc.close();
    }

}
