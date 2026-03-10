package unidade3;

import java.util.Scanner;

public class Aula4 {

        //CALCULADORA
  
        /**int n1, n2, resultado;

        public Aula4() {
            n1 = 5;
            n2 = 7;
            resultado = somar();
            System.out.println(resultado);

           resultado = somar2numeros(7, 3);
           System.out.println(resultado);

           somaValores();
           System.out.println(resultado);
        }

        public int somar(){
            return  n1+n2;
        }

        public int somar2numeros(int num1, int num2){
           return num1+num2;
        }

        public void somaValores(){
            resultado = n1+n2;
        }

        public static void main(String[] args) {
            new Aula4();

        }**/


        //CALCULADORA melhorada

        /**private double num1, num2;

        public Aula4(double num1, double num2) {
            this.num1 = num1;
            this.num2 = num2;

        }

        public double somar(){
            return num1+num2;
        }
        public double dividir(){
            return num2/num1;
        }

        public static void main(String[] args) {
            
            Scanner sc = new Scanner(System.in);

            System.out.println("Digite o primeiro número");
            double n1 = sc.nextDouble();
            System.out.println("Digite o segundo número");
            double n2 = sc.nextDouble();

            Aula4 calc = new Aula4(n1, n2);
            double resultado = calc.somar();
            System.out.println("Reusltado soma: "+resultado);
            resultado =calc.dividir();
            System.err.println("Resultado divisão: "+resultado);



        }**/


        //OPERADORES 

        public static void main(String[] args) {
            
            int num1 = 0;
            for (int i=0; i<3; i++){
                num1++;
            }

            num1--;

            System.out.println(num1);

            int num2 = 4;

            num1 += num2; //variavel 1 recebe a soma dela mesma com a variavel 2 (num1 = num1+num2;)
            num1 -= num2;
            num1 *= num2;
            num1 /= num2;
            num1 %= num2;

            //texto pra maiusculo
            String texto ="exemplo";
            texto = texto.toUpperCase();

            //minusculo
            texto = texto.toLowerCase();

            String t1="BANANA", t2="banana";
            boolean verdade = false;
            verdade = (t1.toLowerCase().equals(t2.toLowerCase()));
            System.out.println(verdade);
                

        }


}


