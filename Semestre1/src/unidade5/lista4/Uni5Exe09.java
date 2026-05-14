package unidade5.lista4;

import java.util.Scanner;

public class Uni5Exe09 {

    public static void main(String[] args) {
        
        int n, idade=0, mais20=0;
        String nome="", nomes="";

        System.out.println("Quantidade de alunos:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i=1; i<=n;i++){
            
            System.out.println("Nome:");
            nome = sc.next();
            System.out.println("Idade:");
            idade = sc.nextInt();

            if(idade==18){

                nomes = nomes + " e " + nome;

            } else if(idade>20){

                mais20++;

            }

        }

        System.out.println("ALunos com 18 anos: "+nomes);
        System.out.println("Alunos acima de 20: "+mais20);

        sc.close();
    }

}
