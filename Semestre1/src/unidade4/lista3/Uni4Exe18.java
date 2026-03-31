package unidade4.lista3;

import java.util.Scanner;

public class Uni4Exe18 {
    public static void main(String[] args) {
        
        int diaP=0,diaV=0;

        Scanner sc = new Scanner(System.in);
        System.out.println("dia do pagamento:");
        diaP = sc.nextInt();
        System.out.println("dia do vencimento:");
        diaV = sc.nextInt();

        float total, valor=0;

        System.out.println("valor:");
        valor = sc.nextFloat();

        if(diaP <= diaV){
            total = valor - (valor*0.10f);
            System.out.println("O pagamento está em dia. O valor da prestação = R$"+total);
        } else if(diaP>diaV && diaP<diaV+5) {
            total = valor;
            System.out.println("O pagamento está em dia. O valor da prestação = R$"+total);
        } else{
            total = valor + (valor*0.02f);
            System.out.println("O pagamento está atrasado. Multa de 2% por dia de atraso. Valor da prestação = R$"+total);
        }

        sc.close();

    }

}
