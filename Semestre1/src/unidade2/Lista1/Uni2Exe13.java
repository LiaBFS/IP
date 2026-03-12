package unidade2.lista1;

import java.util.Scanner;

public class Uni2Exe13 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("informe a distancia: ");
        int distancia = sc.nextInt();
        
        int tempo = distancia * 2;
        
        System.out.println(tempo + " minutos");
        
        sc.close();
    }
}

