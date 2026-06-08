package unidade6.lista5;

import java.util.Scanner;

public class Uni6Exe07 {

    private Scanner sc = new Scanner(System.in);
    private int valor;
    private int[] vetorOrigem;
    private int[] vetorResultante;

    

    public Uni6Exe07(int valor) {
        this.valor = valor;

        this.vetorOrigem = new int[valor];
    }

    public void inserirValores(){
        int n;
        for(int i=0;i<valor;i++){
            do{
                System.out.print("Preencha a posição "+i+ " do vetor: ");
                n =sc.nextInt();
                if(n!=vetorOrigem[i]){
                    
                }

            } while (true);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Digite o tamanho do vetor (1 a 20): ");
            n = sc.nextInt();
            if (n < 1 || n > 20) {
                System.out.println("- Valor inválido -");
            }
        } while (n < 1 || n > 20);

        Uni6Exe07 classe = new Uni6Exe07(n);
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
