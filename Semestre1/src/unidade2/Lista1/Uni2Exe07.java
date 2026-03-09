package unidade2.Lista1;

import java.util.Scanner;

public class Uni2Exe07 {

    public static void main(String[] args) {
        
        String nomeVendedor;
        double salario;
        double totalVendas;

        Scanner sc = new Scanner(System.in);
        System.out.println("Qual seu nome?");
        nomeVendedor = sc.nextLine();
        System.out.println("Digite seu salário fixo:");
        salario = sc.nextDouble();
        System.out.println("Total (R$) em vendas:");
        totalVendas = sc.nextDouble();

        double salarioFinal = salario +(totalVendas*0.15);

        System.out.printf("Salário final = %.2f%n", salarioFinal);


        

    }

}
