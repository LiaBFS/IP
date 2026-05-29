package unidade6.lista5;

import java.util.Scanner;

public class Uni6Exe01 {

    Scanner sc = new Scanner(System.in);
    private int tamanho=10;
    private int[] num = new int[tamanho];

    public Uni6Exe01() {
        
    }

    public void Ler(){
        for(int i=0; i<tamanho;i++){
            num[i] = sc.nextInt();
        }
    }

    public void Escrever(){
        for(int i=tamanho-1; i>=0; i--){
            System.out.println(num[i]);
        }

    }

    public static void main(String[] args) {
        Uni6Exe01 classe = new Uni6Exe01();
        classe.Ler();
        classe.Escrever();


    }


}
