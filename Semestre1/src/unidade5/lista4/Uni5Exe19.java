package unidade5.lista4;

import java.util.Scanner;

public class Uni5Exe19 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double valorB, valorL=0, total=0; 
        
        do{
            System.out.println("Valor da compra:");
            valorB = sc.nextDouble();
            if(valorB ==0){
                break;
            } else if(valorB>500){
                valorL = valorB-(valorB*0.20);
            } else if(valorB<=500){
                valorL = valorB-(valorB*0.15);
            }

            total+=valorL;

        } while(true);

        System.out.println("Valor total: "+total);
        sc.close();
    }

}
