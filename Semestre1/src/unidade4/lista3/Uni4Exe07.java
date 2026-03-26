package unidade4.lista3;

import java.util.Scanner;

public class Uni4Exe07 {

    public static void main(String[] args) {
        
        System.out.println("Peso da carta:");
        Scanner sc = new Scanner(System.in);
        float peso = sc.nextFloat();

        float valor=0, pesoExcedido=0, qtAdicional;

        if(peso <= 50){
            valor = 0.45f;
        } else{
            pesoExcedido = peso-50;
            qtAdicional = (pesoExcedido/20)+1;
            valor = 0.45f + 0.45f *qtAdicional;

        }

        System.out.println("Custo do celo: "+valor);
        sc.close();
    }
    
}
