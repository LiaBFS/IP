package unidade2.Lista1;

import java.util.Scanner;

public class Uni2Exe17 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String nome;
        int dependentes;
        float horas;

        System.out.println("Nome:");
        nome = sc.nextLine();

        System.out.println("Hrs trabalhadas:");
        horas = sc.nextInt();
        System.out.println("N de dependentes:");
        dependentes = sc.nextInt();

        float salarioT = horas * 10;
        float salarioF = (float) dependentes * 60;
        float salarioB = salarioT + salarioF;

        float inss = salarioT * 0.085f;
        float impostoRenda = salarioT * 0.05f;

        float salarioL = salarioB - (inss+impostoRenda);

        System.out.println("Nome: "+nome+"\nSalario bruto: "+salarioB+"\nSalario líquido: "+salarioL);



    }

}
