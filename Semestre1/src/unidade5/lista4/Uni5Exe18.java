package unidade5.lista4;

import java.util.Scanner;

public class Uni5Exe18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int canal, pessoas, totalAudiencia=0, t4=0,t5=0,t9=0,t12=0;

        do{
            System.out.println("Canal:");
            canal = sc.nextInt();

            if(canal==0){
                break;
            } else if(canal == 4 || canal == 5 || canal == 9 || canal == 12){


                System.out.println("Numero de pessoas assistindo:");
                pessoas = sc.nextInt();

                totalAudiencia += pessoas;
                switch (canal) {
                    case 4:
                        t4+=pessoas;
                        break;
                    case 5:
                        t5+=pessoas;
                        break;
                    case 9:
                        t9+=pessoas;
                        break;
                    case 12:
                        t12+=pessoas;
                        break;
                    
                    default:
                        break;
                }

            } else{
                System.out.println("canal inválido");
                break;
            }
        
        } while(true);
        try {
            System.out.println("Percentual de audiência do canal 4: "+ ((100*t4)/totalAudiencia)+"%");
            System.out.println("Percentual de audiência do canal 5: "+ ((100*t5)/totalAudiencia)+"%");
            System.out.println("Percentual de audiência do canal 9: "+ ((100*t9)/totalAudiencia)+"%");
            System.out.println("Percentual de audiência do canal 12: "+ ((100*t12)/totalAudiencia)+"%");
        } catch (Exception e) {
            System.out.println("sem audiência");
        }
        
        sc.close();

    }

}
