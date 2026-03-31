package unidade4.lista3;

import java.util.Scanner;

public class Uni4Exe19 {

    public static void main(String[] args) {
        System.out.println("X = ?");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("Y = ?");
        int y = sc.nextInt();

        if(x == 0 && y == 0){
            System.out.println("quadrante 0");
        } else if(x>0 && y>0){
            System.out.println("quadrante 1");
        } else if(x<0 && y<0){
            System.out.println("quadrante 2");
        } else if(x<0 && y>0){
            System.out.println("quadrante 3");
        } else {
            System.out.println("quadrante 4");
        }
        sc.close();
    }
    
}
