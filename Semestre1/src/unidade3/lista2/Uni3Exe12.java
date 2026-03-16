package unidade3.lista2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Exe12 {

   
    private float horas;
    private int dependentes;
    private float sTrabalho;

    public Uni3Exe12(float horas, int dependentes) {
     
        this.horas = horas;
        this.dependentes = dependentes;
        
    }

    public float calculaSBruto(){

        sTrabalho = (horas*10);
        return sTrabalho+((float) dependentes*60);

    }

    public float calculaSLiquido() {
    
        float descontos = sTrabalho * 0.135f;
        return (sTrabalho - descontos) + (dependentes * 60);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String nome;
        float horas;
        int dependentes;

        System.out.println("nome do funcionário: ");
        nome = sc.nextLine();
        System.out.println("horas trabalhadas: ");
        horas = sc.nextFloat();
        System.out.println("n° de dependentes: ");
        dependentes = sc.nextInt();

        Uni3Exe12 exercicio12 = new Uni3Exe12(horas, dependentes);
        float sBruto = exercicio12.calculaSBruto();
        float sLiquido = exercicio12.calculaSLiquido();

        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("O funcionário "+nome+" possui um salário bruto de R$"+
        df.format(sBruto)+" e um salário líquido de R$"+df.format(sLiquido));

        sc.close();
    }


}
