package unidade4.lista3;

import java.util.Scanner;

public class Uni4Exe25 {

    public static void main(String[] args) {
        
        int n1,n2, opcao;

        System.out.println("Valor 1:");
        Scanner sc = new Scanner(System.in);
        n1 = sc.nextInt();
        System.out.println("Valor 2:");
        n2 = sc.nextInt();

        System.out.println("Escolha uma opção:\r\n" + //
                        "1 - Soma de dois números.\r\n" + //
                        "2 - Diferença entre dois números.\r\n" + //
                        "3 - Produto entre dois números.\r\n" + //
                        "4 - Divisão entre dois números (o denominador não pode ser zero).");
        opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                System.out.println(n1+n2);
                break;
            
            case 2:
                System.out.println(n1-n2);
                break;

            case 3:
                System.out.println(n1*n2);
                break;

            case 4:
                if(n2 == 0){
                    System.out.println("Denominador 0, erro.");
                    break;
                } else {
                    System.out.println(n1/n2);
                    break;
                }
        
            default:
                break;
        }
        sc.close();

    }

}
