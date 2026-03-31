package unidade4.lista3;

import java.util.Scanner;

public class Uni4Exe20 {
    public static void main(String[] args) {

        float n1,n2,n3,exe;

        Scanner sc = new Scanner(System.in);
        System.out.println("nota 1:");
        n1 = sc.nextFloat();
        System.out.println("nota 2:");
        n2 = sc.nextFloat();
        System.out.println("nota 3:");
        n3 = sc.nextFloat();
        System.out.println("media exercicios:");
        exe = sc.nextFloat();

        float media = (n1+(n2*2)+(n3*3)+exe)/7;

        if (media >= 9.0f){
            System.out.println("A média de aproveitamento foi: "+media+". Conceito: A. Aprovado");
        } else if (media >=7.5f && media<9.0f){
            System.out.println("A média de aproveitamento foi: "+media+". Conceito: B. Aprovado");
        } else if (media >=6.0f && media<7.5f){
            System.out.println("A média de aproveitamento foi: "+media+". Conceito: C. Aprovado");
        } else if (media >=4.0f && media<6.0f){
            System.out.println("A média de aproveitamento foi: "+media+". Conceito: D. Reprovado");
        } else{
            System.out.println("A média de aproveitamento foi: "+media+". Conceito: E. Reprovado");
        }
        sc.close();
        
    }    
}
