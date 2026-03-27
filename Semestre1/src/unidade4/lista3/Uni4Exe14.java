package unidade4.lista3;

import java.util.Scanner;

public class Uni4Exe14 {

    public static void main(String[] args) {
        
        System.out.println("digite o dia:");
        Scanner sc = new Scanner(System.in);
        int dia = sc.nextInt();
        System.out.println("digite o mes:");
        int mes = sc.nextInt();
        System.out.println("digite o ano:");
        int ano = sc.nextInt();

        if(dia>0 && dia<32 && mes> 0 && mes<13 && ano>0){

            if(mes==1 || mes ==3 || mes==5 || mes==7 || mes ==8 || mes==10 || mes==12){

                System.out.println("Valida");

            } else if(mes != 2 && dia<31){

                System.out.println("Valida");

            } else if(mes==2 && dia<29){

                System.out.println("Valida");

            } else{
                System.out.println("Nao valida");
            }

        } else{
            System.out.println("Nao valida");
        }
        sc.close();
    }
    
}
