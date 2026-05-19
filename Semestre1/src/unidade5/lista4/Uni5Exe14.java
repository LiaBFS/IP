package unidade5.lista4;

import java.util.Scanner;

public class Uni5Exe14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //String nome;
        double PC=0, PV=0, totalC=0, totalV=0, lucroT=0, lucro;
        int menos10=0, entre1020=0, mais20=0;

        for(int i=1; i<=20; i++){

            //System.out.println("Nome do produto:");
            //nome =sc.next();
            System.out.println("Preço de compra:");
            PC = sc.nextDouble();
            System.out.println("Preço de venda:");
            PV =sc.nextDouble();

            totalC += PC;
            totalV += PV;

            lucro = (PV-PC)/PC*100;
            lucroT+= lucro;

            if(lucro< (PC*0.10)){
                menos10++;
            }else if(lucro >= (PC*0.10) && lucro <= (PC*0.20)){
                entre1020++;
            }else{
                mais20++;
            }

        }
        System.out.println("Mercadorias lucro <10%: "+menos10);
        System.out.println("Mercadorias lucro >=10% e <=20%: "+entre1020);
        System.out.println("Mercadorias lucro >20%: "+mais20);
        System.out.println("Valor total compra: "+totalC);
        System.out.println("Valor total venda: "+totalV);
        System.out.println("Lucro: "+lucroT);

        sc.close();
    }

}
