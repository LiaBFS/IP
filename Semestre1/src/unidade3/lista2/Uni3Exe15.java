package unidade3.lista2;

import java.util.Scanner;

public class Uni3Exe15 {

    private int centenas, dezenas, unidades;


    public Uni3Exe15(int numero) {
        this.centenas = numero / 100;
        this.dezenas = (numero % 100) / 10;
        this.unidades = numero % 10;
    }

    
    public void ajeitaNumero() {
        System.out.printf("%d centena(s)  %d dezena(s) %d unidade(s)%n",centenas, dezenas, unidades);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um número (até 3 dígitos): ");
        int valor = sc.nextInt();

        
        Uni3Exe15 n = new Uni3Exe15(valor);
        
        
        n.ajeitaNumero();

        sc.close();
    }
}
