package unidade3.lista2;

import java.util.Scanner;

public class Uni3Exe16 {

    int vDado, vCompra;

    public Uni3Exe16(int vDado, int vCompra) {
        this.vDado = vDado;
        this.vCompra = vCompra;
        
    }

    public int troco(){
        return this.vDado - this.vCompra;
    }

    public int notasCem(){
        return troco() /100;
    }

    public int notasDez(){
        return (troco()%100)/10;
    }

    public int notasUm(){   
        return troco()%10;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int vDado, vCompra;

        System.out.println("valor da compra:");
        vCompra = sc.nextInt();
        System.out.println("valor pago:");
        vDado = sc.nextInt();

        Uni3Exe16 exercicio16 = new Uni3Exe16(vDado, vCompra);

        int troco = exercicio16.notasCem() + exercicio16.notasDez() + exercicio16.notasUm();
       
        
        System.out.println("O número mínimo de notas de troco é: "+ troco);
        System.out.println("Quantidade de notas de 100 necessárias é: "+exercicio16.notasCem());
        System.out.println("Quantidade de notas de 10 necessárias é: "+exercicio16.notasDez());
        System.out.println("Quantidade de notas de 1 necessárias é: "+exercicio16.notasUm());

        sc.close();

    }

}
