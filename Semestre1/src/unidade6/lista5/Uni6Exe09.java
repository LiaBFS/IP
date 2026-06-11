package unidade6.lista5;

import java.util.Scanner;

public class Uni6Exe09 {

    private Scanner sc = new Scanner(System.in);
    private int tamanho = 30;
    private int[] idade = new int[tamanho];
    private int[] sexo = new int[tamanho];
    private int[] nota = new int[tamanho];
    

    public Uni6Exe09() {
    }

    public void lerDados() {
        for (int i = 0; i < tamanho; i++) {

            System.out.println("Cliente " + (i + 1));

            System.out.print("Sexo (1 - F / 2 - M): ");
            sexo[i] = sc.nextInt();

            System.out.print("Nota do cinema: ");
            nota[i] = sc.nextInt();

            System.out.print("Idade: ");
            idade[i] = sc.nextInt();
        }
    }

    public void resultados() {

        double somaCinema = 0;
        double somaHomens = 0;
        int qtdHomens = 0;

        int menorIdadeMulher = Integer.MAX_VALUE;
        int notaMulherMaisJovem = 0;

        for (int i = 0; i < tamanho; i++) {

            somaCinema += nota[i];

            if (sexo[i] == 2) {
                somaHomens += nota[i];
                qtdHomens++;
            }

            if (sexo[i] == 1 && idade[i] < menorIdadeMulher) {
                menorIdadeMulher = idade[i];
                notaMulherMaisJovem = nota[i];
            }
        }

        double mediaCinema = somaCinema / tamanho;
        double mediaHomens = somaHomens / qtdHomens;

        int mulheres50 = 0;

        for (int i = 0; i < tamanho; i++) {
            if (sexo[i] == 1 && idade[i] > 50 && nota[i] > mediaCinema) {
                mulheres50++;
            }
        }

        System.out.println("Nota media: " + mediaCinema);
        System.out.println("Nota media dos homens: " + mediaHomens);
        System.out.println("Nota da mulher mais jovem: " + notaMulherMaisJovem);
        System.out.println("Mulheres c mais de 50 anos que deram nota acima da média: " + mulheres50);
    }

    public static void main(String[] args) {
        Uni6Exe09 uni6 = new Uni6Exe09();
        uni6.lerDados();
        uni6.resultados();

    }
}


