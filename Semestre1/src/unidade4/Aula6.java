package unidade4;


import java.util.Scanner;

public class Aula6 {

    /**public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua idade:");
        int idade = sc.nextInt();

        if (idade<18 || idade >=65){
            System.out.println("Ganha meia entrada");
        } else{
            System.out.println("Não ganha meia entrada");
        }

        sc.close();

    }**/

        /**public static void main(String[] args) {
             Scanner sc = new Scanner(System.in);

             System.out.println("Idade:");
             int idade = sc.nextInt();

             if(idade>18){
                System.out.println("Adulto");
             } else if(idade>6 && idade <=18){
                    System.out.println("Criança");
                } else{
                    System.out.println("Infanto");
                }
             }

        
        }**/

        //CALCULADORA

        float n1,n2;
        char operador;

        public Aula6(float n1, float n2, char operador) {
            this.n1 = n1;
            this.n2 = n2;
            this.operador = operador;
        }

        public float divide(){
            return n1/n2;
        }

        public float multiplica(){
            return n1*n2;
        }

        public float soma(){
            return n1+n2;
        }

        public float subtrai(){
            return n1-n2;
        }

        public float resto(){
            return n1%n2;
        }


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            float n1,n2, resultado=0;
            char operador;
            System.out.println("Número 1:");
            n1 = sc.nextFloat();

            System.out.println("Operação (/, +, -, *, %):");
            operador = sc.next().charAt(0);

            System.out.println("Número 2:");
            n2 = sc.nextFloat();

            Aula6 calculadora = new Aula6(n1, n2, operador);
            
            if(operador == '+'){
                resultado = calculadora.soma();
            } else if (operador == '-'){
                resultado = calculadora.subtrai();
            } else if (operador == '*') {
                resultado = calculadora.multiplica();
            } else if (operador == '/') {
                resultado = calculadora.divide();
            } else if(operador == '%'){
                resultado = calculadora.resto();
            } else{
                System.out.println("Digite um operador válido");
            }

            System.out.println("Resultado = "+resultado);

            sc.close();
        }

}
