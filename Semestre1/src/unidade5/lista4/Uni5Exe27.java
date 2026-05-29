package unidade5.lista4;

import java.util.Scanner;

public class Uni5Exe27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia;
        int diaMaior = 0;
        int totalPManha, totalPTarde, maiorP = Integer.MIN_VALUE;
        double salario;
        int continuar = 1;

        int totalManha = 0, totalTarde = 0;

        while (continuar == 1) {
            dia = 0;

            while (dia < 1 || dia > 30) {
                System.out.println("Dia de cálculo:");
                dia = sc.nextInt();
                if (dia < 1 || dia > 30) {
                    System.out.println("Dia inválido");
                }
            }

            System.out.println("- turno da manhã -");
            System.out.println("Total de peças:");
            totalPManha = sc.nextInt();
            System.out.println("- turno da tarde -");
            System.out.println("Total de peças:");
            totalPTarde = sc.nextInt();

            if (dia >= 1 && dia <= 15) {
                if (totalPManha + totalPTarde > 100 && totalPManha >= 30 && totalPTarde >= 30) {
                    salario = (totalPManha + totalPTarde) * 0.8;
                } else {
                    salario = (totalPManha + totalPTarde) * 0.5;
                }
            } else {
                salario = (totalPManha * 0.4) + (totalPTarde * 0.3);
            }

            
            System.out.println("Valor recebido: "+ salario);

            
            totalManha += totalPManha;
            totalTarde += totalPTarde;

            if (totalPManha + totalPTarde > maiorP) {
                maiorP = totalPManha + totalPTarde;
                diaMaior = dia;
            }

            System.out.println("Novo funcionário: (1.sim 2.não)?");
            continuar = sc.nextInt();
        }

        System.out.println("\nMaior produção foi dia: " + diaMaior);

        if (totalManha > totalTarde) {
            System.out.println("Período de maior produção: manhã");
            System.out.println("Quantidade total: " + totalManha);
        } else {
            System.out.println("Período de maior produção: tarde");
            System.out.println("Quantidade total: " + totalTarde);
        }

        sc.close();
    }
}