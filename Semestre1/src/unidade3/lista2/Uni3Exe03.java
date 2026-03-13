package unidade3.lista2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Exe03 {

    private float precoGasolina, pagamento;

    public Uni3Exe03(float precoGasolina, float pagamento) {
        this.precoGasolina = precoGasolina;
        this.pagamento = pagamento;
    }

    public float calculaLitros(){
         
        return pagamento/precoGasolina;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        float precoGasolina, pagamento;

        System.out.println("preço da gasolina:");
        precoGasolina = sc.nextFloat();
        System.out.println("quantidade de dinheiro pago:");
        pagamento = sc.nextFloat();

        Uni3Exe03 exercicio3 = new Uni3Exe03(precoGasolina, pagamento);
        float litros =exercicio3.calculaLitros();

        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("litros de gasolina: "+df.format(litros));

        sc.close();

    }

}
