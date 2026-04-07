package unidade4.lista3;

import java.util.Scanner;

public class Uni4Exe24 {

    public static void main(String[] args) {
        
        float[] valores = new float[3];

        Scanner sc = new Scanner(System.in);
        System.out.println("digite 3 valores:");
        valores[0] = sc.nextFloat();
        valores[1] = sc.nextFloat();
        valores[2] = sc.nextFloat();
        System.out.println("opcao:");
        int opcao = sc.nextInt();

        float valorMaior = 0;
        float valorMenor = 0;
        float valorMedio = 0;


        switch (opcao) {
            case 1:
                valorMaior = valores[0];
                valorMenor = valores[0];
                for(int i=0;i<3;i++){
                    
                    if(valorMaior < valores[i]){
                        valorMaior = valores[i];
                        
                    } else if(valorMenor > valores[i]){
                        valorMenor = valores[i];
                        
                    }
                }
                for(int i=0;i<3;i++){

                    if(valorMaior != valores[i] && valores[i] != valorMenor){
                        valorMedio = valores[i];
                    }
                }

                System.out.println("ordem crescente: "+ valorMenor+", "+ valorMedio +", "+ valorMaior);
                break;

            case 2:
                valorMaior = valores[0];
                valorMenor = valores[0];
                for(int i=0;i<3;i++){
                    
                    if(valorMaior < valores[i]){
                        valorMaior = valores[i];
                        
                    } else if(valorMenor > valores[i]){
                        valorMenor = valores[i];
                        
                    }
                }
                for(int i=0;i<3;i++){

                    if(valorMaior != valores[i] && valores[i] != valorMenor){
                        valorMedio = valores[i];
                    }
                }

                System.out.println("ordem decrescente: "+ valorMaior +", "+ valorMedio +", "+ valorMenor);
                break;

            case 3:
                valorMaior = valores[0];
                valorMenor = valores[0];
                for(int i=0;i<3;i++){
                    
                    if(valorMaior < valores[i]){
                        valorMaior = valores[i];
                        
                    } else if(valorMenor > valores[i]){
                        valorMenor = valores[i];
                        
                    }
                }
                for(int i=0;i<3;i++){

                    if(valorMaior != valores[i] && valores[i] != valorMenor){
                        valorMedio = valores[i];
                    }
                }

                System.out.println("maior no meio: "+ valorMedio +", "+ valorMaior +", "+ valorMenor);
                break;
        
            default:
                break;
        }

        sc.close();

    }

}
