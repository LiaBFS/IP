package unidade5.lista4;

public class Uni5Exe04 {

    public static void main(String[] args) {
        
        int denominador=2, numerador=3, soma=0;

        for (int i=1; i<=20; i++){
            soma = numerador/denominador;
            numerador+=2;
            denominador+= numerador-1;
        }
        System.out.println(soma);

    }

}
