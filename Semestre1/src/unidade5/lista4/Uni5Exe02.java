package unidade5.lista4;

public class Uni5Exe02 {

    public static void main(String[] args) {

       
        int pares=0,impares=0;
        
        for(int i=0;i<=100;i++){
            if(i%2==0){
                pares +=i;
            } else{
                impares +=i;
            }

        }
        System.out.println("pares: "+pares +"\nimpares: "+impares);

    }

}
