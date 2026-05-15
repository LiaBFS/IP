package unidade5.lista4;

public class Uni5Exe11 {
    
   public static void main(String[] args) {
    
        int qnt =1;
        int total=qnt;

        for (int h=2; h<=16; h++){

            if(h==2){
                qnt=3;
            }else{
                qnt *= 3;
            }

            total +=qnt;
        }
        System.out.println(total);
   }
}


