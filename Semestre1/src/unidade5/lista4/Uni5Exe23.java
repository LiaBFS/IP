package unidade5.lista4;

import java.util.Scanner;

public class Uni5Exe23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        double totalVendas=0, precoU, salario;
        int n, qntVendida;
        char continuar='s';

        while (String.valueOf(continuar).equalsIgnoreCase("S")) {

            System.out.println("nome do vendedor:");
            nome = sc.nextLine();
            System.out.println("quantidade de produtos vendidos:");
            n = sc.nextInt();
            
            for(int i=1; i<=n;i++){
                System.out.println("Produto "+i);
                System.out.println("preço unitário:");
                precoU = sc.nextDouble();
                System.out.println("quantidade vendida");
                qntVendida = sc.nextInt();

                totalVendas += precoU*qntVendida;

            }
            salario = totalVendas*0.30;
            System.out.println("Nome: "+nome);
            System.out.println("Total de vendas: "+totalVendas);
            System.out.println("Salário: "+salario);

            sc.nextLine();

            System.out.println("\nDeseja continuar? (s/n)");
            continuar = sc.nextLine().charAt(0);

        }

        sc.close();

    }

}
