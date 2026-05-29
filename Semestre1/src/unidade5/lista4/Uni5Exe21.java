package unidade5.lista4;

public class Uni5Exe21 {
    public static void main(String[] args) {

        float aChico = 1.50f;
        float aZe = 1.10f;
        int anos = 0;

        while (aChico >= aZe) {
            aChico += 0.02f;
            aZe += 0.03f;
            anos++;
        }

        System.out.println("Anos: " + anos);
    }
}
