package unidade5.lista4;

import java.util.Scanner;

public class Uni5Exe34 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcao, contasEncerradas = 0, nDiarias;
        String nome;
        boolean sair = false;

        do {

            System.out.println("\nOpção:");
            System.out.println("(1) Encerrar a conta de um hóspede");
            System.out.println("(2) Verificar número de contas encerradas");
            System.out.println("(3) Sair");

            opcao = sc.nextInt();
            sc.nextLine(); // limpa o ENTER

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    nome = sc.nextLine();

                    System.out.print("Número de diárias: ");
                    nDiarias = sc.nextInt();

                    double total;

                    if (nDiarias < 15) {
                        total = (50 * nDiarias) + (7.5 * nDiarias);

                    } else if (nDiarias == 15) {
                        total = (50 * nDiarias) + (6.5 * nDiarias);

                    } else {
                        total = (50 * nDiarias) + (5 * nDiarias);
                    }
                    System.out.println(nome + " precisa pagar R$ " + total);
                    contasEncerradas++;
                    break;
                case 2:
                    System.out.println("Contas encerradas: " + contasEncerradas);
                    break;
                case 3:
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida");
            }

        } while (!sair);

        sc.close();
    }
}