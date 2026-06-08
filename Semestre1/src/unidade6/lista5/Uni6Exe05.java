package unidade6.lista5;

import java.util.Scanner;

public class Uni6Exe05 {
    /**
    resuminho sobre regras atributo x construtor:
    Coloque no construtor: Atributos que definem a identidade ou o estado inicial obrigatório 
    do objeto (ex: nome, cpf, preco).
    Não coloque no construtor: Atributos que têm valores iniciais fixos padrão 
    (ex: lista_de_itens = [], status = "ativo", data_criacao = hoje) ou dados que serão calculados depois.
    **/

    private Scanner sc = new Scanner(System.in);
    private String[] pessoa1 = new String[5];
    private String[] pessoa2 = new String[5];
    private int afinidade;

    public Uni6Exe05() {
    }

    public void lerRespostas(){
        System.out.println("- Pessoa 1: -");
        
        System.out.println("1. Gosta de música sertaneja? (SIM/NAO/IND)");
        pessoa1[0] = sc.nextLine();
        System.out.println("2. Gosta de futebol? (SIM/NAO/IND)");
        pessoa1[1] = sc.nextLine();
        System.out.println("3. Gosta de seriados? (SIM/NAO/IND)");
        pessoa1[2] = sc.nextLine();
        System.out.println("4. Gosta de redes sociais? (SIM/NAO/IND)");
        pessoa1[3] = sc.nextLine();
        System.out.println("5. Gosta da Oktoberfest? (SIM/NAO/IND)");
        pessoa1[4] = sc.nextLine();
        System.out.println("\n");

        System.out.println("- Pessoa 2: -");
        
        System.out.println("1. Gosta de música sertaneja? (SIM/NAO/IND)");
        pessoa2[0] = sc.nextLine();
        System.out.println("2. Gosta de futebol? (SIM/NAO/IND)");
        pessoa2[1] = sc.nextLine();
        System.out.println("3. Gosta de seriados? (SIM/NAO/IND)");
        pessoa2[2] = sc.nextLine();
        System.out.println("4. Gosta de redes sociais? (SIM/NAO/IND)");
        pessoa2[3] = sc.nextLine();
        System.out.println("5. Gosta da Oktoberfest? (SIM/NAO/IND)");
        pessoa2[4] = sc.nextLine();

    }

    public String calculaAfinidade(){
        for(int i=0;i<5;i++){

            if(pessoa1[i].equalsIgnoreCase(pessoa2[i])){
                afinidade += 3;
            } 
            else if(pessoa1[i].equalsIgnoreCase("IND") || pessoa2[i].equalsIgnoreCase("IND")){
                afinidade += 1;
            }
            else if((pessoa1[i].equalsIgnoreCase("SIM") && pessoa2[i].equalsIgnoreCase("NÃO")) || (pessoa2[i].equalsIgnoreCase("SIM") && pessoa1[i].equalsIgnoreCase("NÃO"))){
                afinidade -= 2;
            }

        }

        switch (afinidade) {
            case 15: 
                return "Casem!";
            case 14: case 13: case 12: case 11: case 10: 
                return "Vocês têm muita coisa em comum!";
            case 9: case 8: case 7: case 6: case 5: 
                return "Talvez não dê certo :(";
            case 4: case 3: case 2: case 1: case 0: 
                return "Vale um encontro.";
            case -1: case -2: case -3: case -4: case -5: case -6: case -7: case -8: case -9: 
                return "Melhor não perder tempo";
            case -10: 
                return "Vocês se odeiam!";
            default: 
               
        }
        return "";
    }

    public static void main(String[] args) {
        Uni6Exe05 classe = new Uni6Exe05();
        classe.lerRespostas();
        
        System.out.println("\n");
        System.out.println(classe.calculaAfinidade());
    }

}
