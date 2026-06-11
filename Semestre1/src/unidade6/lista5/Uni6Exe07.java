package unidade6.lista5;

import java.util.Scanner;

public class Uni6Exe07 {
    private Scanner sc = new Scanner(System.in);
    private int tamanho;
    private int[] vetor;

    private void lerTamanho() {
        do {
            System.out.println("Digite um valor: ");
            tamanho = sc.nextInt();
        } while (tamanho <= 0 || tamanho > 20);

        vetor = new int[tamanho];
    }

    private boolean valorExiste(int valor, int posicaoAtual) {
        for (int i = 0; i < posicaoAtual; i++) {
            if (vetor[i] == valor) {
                return true;
            }
        }
        return false;
    }

    private void inserirValores() {
        int posicao = 0;

        while (posicao < tamanho) {
            System.out.println("Digite o valor " + posicao + ": ");
            int valor = sc.nextInt();

            if (valorExiste(valor, posicao)) {
                System.out.println("Valor ja existe no vetor. Digite outro valor.");
            } else {
                vetor[posicao] = valor;
                posicao++;
            }
        }
    }

    private void ordenarVetor() {
        for (int i = 0; i < tamanho - 1; i++) {
            for (int j = 0; j < tamanho - 1 - i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                }
            }
        }
    }

    private void informarVetor() {
        System.out.println("Vetor ordenado:");

        for (int i = 0; i < tamanho; i++) {
            System.out.print("[" + vetor[i] + "]");
        }
    }

    public static void main(String[] args) {
        Uni6Exe07 exe07 = new Uni6Exe07();
        exe07.lerTamanho();
        exe07.inserirValores();
        exe07.ordenarVetor();
        exe07.informarVetor();
    }

    // Como funciona o Método Bolha (Bubble Sort)?
    //
    // Ideia: comparar pares de elementos vizinhos e trocar
    // aqueles que estão fora de ordem. Após cada "passagem",
    // o maior elemento "borbulha" para o final — como uma
    // bolha subindo à superfície da água.

    //EXEMPLO: 
    /**
    public static void ordenar(int[] vetor) {
        int n = vetor.length;
        int temp;
 
        // Laço externo: controla o número de passagens.
        // Cada passagem garante que o maior elemento restante
        // vai para a posição correta no final.
        // Precisamos de (n-1) passagens no máximo.
        for (int passagem = 0; passagem < n - 1; passagem++) {
 
            // Laço interno: percorre os pares ainda não ordenados.
            // A cada passagem, o último elemento já está no lugar,
            // então reduzimos o limite com (n - 1 - passagem).
            for (int j = 0; j < n - 1 - passagem; j++) {
 
                // Compara o elemento atual com o próximo
                if (vetor[j] > vetor[j + 1]) {
 
                    // Troca os dois elementos usando variável auxiliar
                    temp        = vetor[j];
                    vetor[j]    = vetor[j + 1];
                    vetor[j + 1] = temp;
                //}
            //}
        //}
    **/

}
