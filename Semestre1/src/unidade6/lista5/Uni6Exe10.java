package unidade6.lista5;

import java.util.Scanner;

public class Uni6Exe10 {

    private Scanner sc = new Scanner(System.in);
    private int[] valores = new int[50];
    private int posicaoFinal=0;

    public Uni6Exe10(){
        int opcao;
        do{
            System.out.println("Menu:");
            System.out.println("1 - Incluir valor;\n" + //
                                "2 - Pesquisar valor;\n" + //
                                "3 - Alterar valor;\n" + //
                                "4 - Excluir valor;\n" + //
                                "5 - Mostrar valores;\n" + //
                                "6 - Ordenar valores;\n" + //
                                "7 - Inverter valores;\n" + //
                                "8 - Sair do sistema");
            System.out.print("Opção: ");
            opcao = sc.nextInt();
            System.out.println("");

            switch (opcao) {
                case 1:
                    incluirValor();
                    break;

                case 2:
                    pesquisarValor();
                    break;
                
                case 3:
                    alterarValor();
                    break;
                
                case 4:
                    excluirValor();
                    break;
                
                case 5:
                    mostrarValores();
                    break;

                case 6:
                    ordenarValores();
                    break;

                case 7: 
                    inverterValores();
                    break;

                case 8:
                    System.out.println("-Fim-");
            
                default:
                    System.out.println("-Inválido- \nTente novamente:\n");
                    break;
            }
            
        } while(opcao!=8);
    }

    public void incluirValor(){
        if(posicaoFinal<valores.length){
            System.out.print("Digite o valor: ");
            valores[posicaoFinal] = sc.nextInt();
            System.out.println("Número "+valores[posicaoFinal]+" inserido na posição "+posicaoFinal+"\n");
            posicaoFinal++;
            
        } else{
            System.out.println("-Vetor cheio-\n");
        }

    }


    public int pesquisarValor(){
        System.out.print("Informe o valor: ");
        int n = sc.nextInt();

        boolean encontrado = false;
        for(int i=0;i<posicaoFinal;i++){
            if(valores[i] ==n){
                System.out.println("Número "+n+" encontrado na posição "+i+"\n");
                encontrado = true;
                return i;
            }
        }
        if(!encontrado){
            System.out.println("-Valor inexistente-\n");
        }
        return -1;

    }

    public void alterarValor(){
        int posicao = pesquisarValor();

        if(posicao!=-1){
            System.out.print("Informe o novo valor: ");
            valores[posicao]=sc.nextInt();
            System.out.println("Número da posição "+posicao+" substituído por "+valores[posicao]+"\n");
        }

    }

    public void excluirValor(){
        int posicao = pesquisarValor();

        if(posicao!=-1){
            System.out.println("Limpando a posição "+posicao+"...");
            for(int i=posicao;i<posicaoFinal-1;i++){
                valores[i] = valores[i+1];
            }
            posicaoFinal--;
            System.out.println("Valor excluído\n");
        }
    }


    public void mostrarValores(){
        System.out.println("Exibindo valores:");
        for(int i=0;i<posicaoFinal;i++){
            System.out.print("| "+valores[i]+" |");
        }
        System.out.println("\n");
    }

    public void ordenarValores(){
        //váriavel temporária do bubblemethod, serve para guardar o valor e conseguir inverter as casas do vetor
        int x;

        for(int i=0;i<posicaoFinal-1;i++){

            if(valores[i]>valores[i+1]){
                x = valores[i];
                valores[i] = valores[i+1];
                valores[i+1] = x;
                i=-1;
            }
        }
        System.out.println("Valores ordenados de forma crescente");
        mostrarValores();
    }


    public void inverterValores(){
        int x=0;
        for(int i=0;i<posicaoFinal;i++){
            for(int j=0;j<i;j++){
                x = valores[i];
                valores[i] = valores[j];
                valores[j] = x;
            }
        }
        System.out.println("Posições dos valores invertidas");
        mostrarValores();

    }

    public static void main(String[] args) {
        new Uni6Exe10();

    }

}
