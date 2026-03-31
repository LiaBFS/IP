package unidade4.lista3;

import java.util.Scanner;

public class Uni4Exe21 {

     public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Altura");
        float altura = sc.nextFloat();
        System.out.println("peso:");
        float peso = sc.nextFloat();

        float imc = (float )(peso/(Math.pow((double) altura, 2)));

        if(imc<18.5f){
            System.out.println("magreza");
        } else if(imc>=18.5f && imc<=24.9f){
            System.out.println("saudável");
        } else if(imc>=25.0f && imc<=29.9f){
            System.out.println("sobrepeso");
        } else if(imc>=30.0f && imc<=34.9f){
            System.out.println("obesidade 1");
        } else if(imc>=35.0f && imc<=39.9f){
            System.out.println("obesidade 2");
        } else if(imc>=40.0f){
            System.out.println("obesidade 3");
        }

        sc.close();
     }
    
}
