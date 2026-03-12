package unidade2.lista1;

import java.util.Scanner;

public class Uni2Exe06 {

    public static void main(String[] args) {
        
        int id;
        double horas;
        double dinheiro;

        System.out.println("Informe o id, horas trabalhadas e valor por hora");
        Scanner sc = new Scanner(System.in);
        id = sc.nextInt();
        horas = sc.nextDouble();
        dinheiro =sc.nextDouble();

        double salario = horas * dinheiro;

        System.out.println(id);
        System.out.printf("%.2f%n", salario);

        sc.close();

    }

}
