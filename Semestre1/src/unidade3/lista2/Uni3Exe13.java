package unidade3.lista2;

import java.text.DecimalFormat;
import java.util.Scanner;

    public class Uni3Exe13 {

        /**public static void main(String[] args) {
        
            float c, a;

            Scanner sc = new Scanner(System.in);
            System.out.println("altura:");
            a = sc.nextFloat();
            System.out.println("comprimento:");
            c = sc.nextFloat();

            float azulejos = (a*c)*9;

            float valor = azulejos*12.50f;
            System.out.println("valor:"+valor);

            sc.close();

        }**/

        private float comp, alt, azulejos;

        public Uni3Exe13(float comp, float alt) {
            this.comp = comp;
            this.alt = alt;
        }

        public float calculaAzulejos(){

            azulejos = (alt*comp)*9;
            return azulejos;
        }

        public float calculaPreco(){

            return azulejos*12.50f;
        }

        public static void main(String[] args) {
            
            Scanner sc = new Scanner(System.in);
            float comp, alt;

            System.out.println("Altura da parede:");
            alt = sc.nextFloat();
            System.out.println("Comprimento da parede:");
            comp = sc.nextFloat();

            Uni3Exe13 exercicio13 = new Uni3Exe13(comp, alt);
            exercicio13.calculaAzulejos();
            float valor = exercicio13.calculaPreco();

            DecimalFormat df = new DecimalFormat("0.00");
            System.out.println("Valor: "+df.format(valor));

            sc.close();
        }

}
