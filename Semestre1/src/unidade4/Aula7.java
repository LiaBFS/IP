package unidade4;

import java.util.Scanner;

public class Aula7 {

    public static void main(String[] args) {
        int iM, iZ, iL;
        

        Scanner sc = new Scanner(System.in);

        System.out.println("Idade Marquinhos:");
        iM = sc.nextInt();

        System.out.println("Idade Zezinho:");
        iZ = sc.nextInt();

        System.out.println("Idade Luluzinha:");
        iL = sc.nextInt();

        if (iM<iL && iM<iZ){
            System.out.println("Marquinhos");

        } else if (iL<iM && iL<iZ){
            System.out.println("Luluzinha");
        } else if (iZ<iM && iZ<iL){
            System.out.println("Zezinho");
        }

    }

}
