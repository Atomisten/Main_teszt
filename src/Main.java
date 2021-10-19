import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args){

        int[][] tryItOut = new int[5][6];
        int ertek = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                    ertek = ertek +1;
                    tryItOut[i][j] = ertek;
                System.out.print(tryItOut[i][j] + " ");
            }
            System.out.println();


        }
    }

}


