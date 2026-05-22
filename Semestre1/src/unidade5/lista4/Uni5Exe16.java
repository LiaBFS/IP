package unidade5.lista4;

import java.util.Scanner;

public class Uni5Exe16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float altura = 0, mediaF = 0, media = 0, somaF = 0, soma = 0, denominadorF = 0, denominador = 0;
        char genero;

        do {
            System.out.println("Altura:");
            altura = sc.nextFloat();

            if (altura == 0) {
                break;
            }
            
            System.out.println("Genero:");
            
            genero = sc.next().toUpperCase().charAt(0);
            
            
            if (genero == 'F') {
                soma += altura;
                somaF += altura;
                denominador++;
                denominadorF++;
            } else {
                soma += altura;
                denominador++;
            }

        } while (true);


        mediaF = somaF / denominadorF;
        media = soma / denominador;
        
        System.out.println("Media feminina = " + mediaF);
        System.out.println("Media geral = " + media);
        sc.close();
    }
}