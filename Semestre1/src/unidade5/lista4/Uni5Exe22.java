package unidade5.lista4;

public class Uni5Exe22 {
    public static void main(String[] args) {

        double salarioAtual, porcentagem=0.015;
        int ano=1997;

        salarioAtual = 2000+(2000*0.015);

        while(ano<=2026){
            porcentagem *= 2;
            salarioAtual += (salarioAtual*porcentagem);
            ano++;
        }
        System.out.println("salario atual: "+salarioAtual);

    }

}
