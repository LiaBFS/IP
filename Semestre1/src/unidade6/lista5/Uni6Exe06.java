package unidade6.lista5;

import java.util.Scanner;

public class Uni6Exe06 {

    private Scanner sc = new Scanner(System.in);
    private int valor;

    //sem inicializar pq se não o valor = 0
    private double[] vetor; 

    public Uni6Exe06(int valor) {
        this.valor = valor;

        //inicializar aq pq dai já foi colocado o tamanho digitado
        this.vetor = new double[valor];
    }

    public void lerValores(){
        for(int i=0; i<valor;i++){
            System.out.print("Digite o valor "+(i+1)+": ");
            vetor[i] = sc.nextDouble();
        }
    }

    public boolean procuraValor(){
        System.out.println("\nQual valor deseja procurar?");
        double busca = sc.nextDouble();

        for(int i=0;i<valor;i++){
            if(busca == vetor[i]){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Diga o tamanho do vetor: ");
        int tamanho = sc.nextInt();

        Uni6Exe06 classe = new Uni6Exe06(tamanho);
        classe.lerValores();
        
        if(classe.procuraValor()){
            System.out.println("Valor está no vetor");
        } else{
            System.out.println("Valor inexistente");
        }
        sc.close();
    }

}
