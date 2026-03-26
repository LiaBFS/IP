package unidade4.lista3;

import java.util.Scanner;

public class Uni4Exe06 {

    public static void main(String[] args) {
        
        char a;

        Scanner sc = new Scanner(System.in);
        System.out.println("Sexo:");
        a = sc.next().charAt(0);

        a = Character.toUpperCase(a);

        if(Character.toString(a).equals("M")){

            System.out.println("Masculino");

        } else if (Character.toString(a).equals("F")){

            System.out.println("Feminino");

        } else if (Character.toString(a).equals("I")){
            
            System.out.println("Não informado");

        } else{
            System.out.println("Entrada incorreta");
        }
        sc.close();
    }
    
}
