package unidade5.lista4;

import java.util.Scanner;

public class Uni5Exe33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] votos = new int[5];
        int nulos = 0, brancos = 0, total = 0;
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("Voto (1-4 candidato | 5 nulo | 6 branco | 0 sair): ");
            opcao = sc.nextInt();

            if (opcao == 0) {
                break;
            } else if (opcao >= 1 && opcao <= 4) {
                votos[opcao]++;
                total++;
            } else if (opcao == 5) {
                nulos++;
                total++;
            } else if (opcao == 6) {
                brancos++;
                total++;
            } else {
                System.out.println("Opção incorreta");
            }
        }

        int c = 1;
        while (c <= 4) {
            System.out.println("Candidato "+c+": "+votos[c]+" voto(s)");
            c++;
        }
        System.out.println("Votos nulos:  " + nulos);
        System.out.println("Votos brancos: " + brancos);

        if (total > 0) {
            double pctNulos   = (nulos   * 100.0) / total;
            double pctBrancos = (brancos * 100.0) / total;
            System.out.println("Percentual nulos:  "+ pctNulos+"%");
            System.out.println("Percentual brancos: "+ pctBrancos+"%");
        } else {
            System.out.println("sem votos");
        }

        sc.close();
    }
}
