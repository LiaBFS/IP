package unidade5;

import java.util.Scanner;

public class Aula10 {

    /**public static void main(String[] args) {
        
        int linha = 0;
        do{
            System.out.println("Linha "+linha);
            linha++;
        } while(linha<=100);
    }**/

    //EXEMPLO MENU

    private static float n1=0;
    private static float n2=0;
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int opcao = 0;

        do{
            System.out.println("Menu");
            System.out.println("1- Somar \n2- Subtrair \n3- Dividir \n4- Multiplicar \n0- Sair");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    valores(sc);
                    somar(n1, n2);
                    break;

                case 2:
                    subtrair(n1, n2);
                    break;

                case 3:
                    dividir(n1, n2);
                    break;

                case 4:
                    multiplicar(n1, n2);
                    break;
            
                default:
                    break;
            }


        } while(opcao!=0);
        sc.close();
    }

    private static void valores(Scanner sc){
        
        System.out.println("Digite o n1:");
        n1 = sc.nextFloat();
        System.out.println("Digite o n2:");
        n2 = sc.nextFloat();
    }

    private static void multiplicar(float n1, float n2) {
        
        System.out.println("resultado multiplicação: "+(n1*n2));
    }

    private static void dividir(float n1, float n2) {
        
        System.out.println("resultado divisão: "+(n1/n2));
    }

    private static void subtrair(float n1, float n2) {
        
        System.out.println("resultado subtração: "+(n1-n2));
    }

    private static void somar(float n1, float n2) {
        
        System.out.println("resultado soma: "+(n1+n2));
    }

}
