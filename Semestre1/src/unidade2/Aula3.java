package unidade2;

import java.text.DecimalFormat;

public class Aula3 {

    //Funções matemáticas

    /**public static void main(String[] args) {
        
        double numero1 = 2, numero2 = 3;

        double potencia = Math.pow(numero1, numero2);
        double arredondado = Math.round(potencia);
        double maximo = Math.max(numero1, numero2);
        double minimo = Math.min(numero1, numero2);
        double aleatorio = Math.random();
        double pi = Math.PI;



    }**/

    
    //ARREDONDAMENTO

    public static void main(String[] args) {
        
        float n = 7.878698f;
        System.out.println("Nota: "+n);

        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Nota: "+ df.format(n));


        System.out.printf("Nota: %.2f%n", n);
    }


}
