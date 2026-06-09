package prova2;

import java.util.Scanner;

public class Questao1 {

    private Scanner sc = new Scanner(System.in);
    private int tamanho, capacidade;
    private int[] peso;
    private String[] valor; 
    private int posicaoFinal=0;
    private int pesoAtual=0;


    public Questao1(int tamanho, int capacidade) {
        this.tamanho = tamanho;
        this.capacidade = capacidade;
        this.peso = new int[tamanho];
        this.valor = new String[tamanho];

        int opcao;

        do{
            System.out.println("Menu:\n1 - Inserir; \n2 - Imprimir; \n3 - Valor do item mais pesado; \n4 - Ordenar; \n5 - Excluir item; \n6 - Sair");
            System.out.print("Opção: ");
            opcao = sc.nextInt();
            System.out.println("");

            switch (opcao) {
                case 1:
                    inserir();
                    break;
                case 2:
                    imprimirMochila();
                    break;
                case 3:
                    valorItemMaisPesado();
                    break;
                case 4:
                    ordenarMochila();
                    break;
                case 5:
                    excluirItemMochila();
                    break;
                case 6:
                    System.out.println("- Saindo -");
                    break;
            
                default:
                    System.out.println("- Opção inválida -");
                    break;
            }


        }while(opcao!=6);

    }


    private void inserir() {
        if(posicaoFinal<valor.length || pesoAtual<capacidade){

            int x;
            String y;

            System.out.print("Digite o nome do item: ");
            y = sc.next();
            sc.nextLine();
            
            System.out.print("Digite o peso do item: ");
            x = sc.nextInt();
            if(x>capacidade){
                System.out.println("- Peso excedido -");
            }else{
                valor[posicaoFinal] = y;
                peso[posicaoFinal] = x;
                pesoAtual += peso[posicaoFinal];
                posicaoFinal++;
            }
            
            System.out.println("\n");
            

        } else if(posicaoFinal>=valor.length){
            System.out.println("- Mochila cheia -");
        } else if(pesoAtual>=capacidade){
            System.out.println("- Peso excedido -");
        }
        
    }

    private void imprimirMochila(){

        for(int i=posicaoFinal-1;i>=0;i--){
            System.out.println("Item "+i+": "+valor[i]+" (Peso: "+peso[i]+")");
        }
        System.out.println("\n");
    }

    private void valorItemMaisPesado(){
        int pesado = Integer.MIN_VALUE;
        String nome="";
        for(int i=0; i<posicaoFinal;i++){ 
            if(peso[i]>pesado){
                pesado=peso[i];
                nome = valor[i];
            }
        }
        System.out.println("Item mais pesado: "+nome+"\n");
    }

    private void ordenarMochila(){

        int x;
        String y;

        for(int i=0;i<posicaoFinal-1;i++){

            if(peso[i]>peso[i+1]){
                x = peso[i];
                peso[i] = peso[i+1];
                peso[i+1] = x;

                y = valor[i];
                valor[i] = valor[i+1];
                valor[i+1] = y;
                i=-1;
            }
        }
        System.out.println("- Mochila ordenada- ");

    }

    private int pesquisar(){
        System.out.print("Informe o nome do item: ");
        String n = sc.next();
        sc.nextLine();

        boolean encontrado = false;
        for(int i=0;i<posicaoFinal;i++){
            if(valor[i].equals(n)){
                
                encontrado = true;
                return i;
            }
        }
        if(!encontrado){
            System.out.println("-Item inexistente-\n");
        }
        return -1;
    }

    private void excluirItemMochila(){
        int posicao = pesquisar();

        if(posicao!=-1){
            
            for(int i=posicao;i<posicaoFinal-1;i++){
                valor[i] = valor[i+1];
                peso[i] = peso[i+1];
            }
            posicaoFinal--;
            System.out.println("- Valor excluído -\n");
        }
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tamanho da mochila: ");
        int tamanho = sc.nextInt();
        System.out.print("Capacidade máxima: ");
        int capacidade = sc.nextInt();

        Questao1 classe = new Questao1(tamanho, capacidade);
        
    }
    


}
