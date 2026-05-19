package unidade6;

import java.util.Scanner;

public class Aula12 {

    //vetores

    //String[] nome = new String[5]
    //int[] nome = new String[6]~
    //...

    //

    /**public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      int[] notas = new int[10];
      
      for(int i=1;i<=10;i++){
        notas[i] = sc.nextInt();
      }
        
    }**/


    //EXEMPLO NOME
    public static void main(String[] args) {
        int tamanho =10;
        String[] nome = new String[tamanho];
        double[] nota = new double[tamanho];
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<tamanho;i++){
            System.out.print("Nome "+i);
            nome[i] = sc.nextLine();
            if(i>0){
                sc.nextLine();
            }
            System.out.print("Nota: ");
            nota[i] = sc.nextDouble();
        }
        for(int i=1;i<=tamanho;i++){
            System.out.println(i+": "+nome[i]+" / Nota: "+nota[i]);

        }

        int posicaoMaior=0;
        double maiorNota = Double.MIN_VALUE;

        for(int i=1;i<=tamanho;i++){
            if(nota[i]>maiorNota){
                maiorNota = nota[i];
                posicaoMaior =i;
            }

        }
        
        System.out.println("Aluno c a maior nota: " +nome[posicaoMaior]);
        sc.close();
    }

}
