package unidade6.lista5;

import java.util.Scanner;

public class Uni6Exe08 {

    private Scanner sc = new Scanner(System.in);
    private int tamanho;
    private double[] vetor;

    private void lerTamanho() {
        do {
            System.out.println("Digite o valor: ");
            tamanho = sc.nextInt();
        } while (tamanho <= 0 || tamanho > 20);

        vetor = new double[tamanho];
    }

    private void lerVetor() {
        System.out.println("Informe os valores do vetor:");

        for (int i = 0; i < tamanho; i++) {
            System.out.print("Posicao " + i + ": ");
            vetor[i] = sc.nextDouble();
        }
    }

    private int contarFrequencia(double valor) {
        int frequencia = 0;

        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] == valor) {
                frequencia++;
            }
        }

        return frequencia;
    }

    private boolean foiMostrado(int x) {
        for (int i = 0; i < x; i++) {
            if (vetor[i] == vetor[x]) {
                return true;
            }
        }

        return false;
    }

    private void mostrarTabela() {
        System.out.println();
        System.out.println("VALOR | FREQUENCIA");

        for (int i = 0; i < tamanho; i++) {

            if (!foiMostrado(i)) {
                int frequencia = contarFrequencia(vetor[i]);

                System.out.println(vetor[i]+" | "+frequencia);
            }
        }
    }

    public static void main(String[] args) {
        Uni6Exe08 classe = new Uni6Exe08();
        classe.lerTamanho();
        classe.lerVetor();
        classe.mostrarTabela();
    }


}
