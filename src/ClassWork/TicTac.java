package ClassWork;

public class TicTac {
    public static void main(String[] args) {
        String[][] tic = new String[3][3];
        tic[0][0] = "X";
        tic[0][1] = "O";
        tic[0][2] = "X";
        tic[1][0] = "X";
        tic[1][1] = "X";
        tic[1][2] = "X";
        tic[2][0] = "O";
        tic[2][1] = "X";
        tic[2][2] = "0";
        System.out.printf("%s  %s  %s%n",tic[0][0],tic[0][1],tic[0][2]);
        System.out.printf("%s  %s  %s%n",tic[1][0],tic[1][1],tic[1][2]);
        System.out.printf("%s  %s  %s%n",tic[2][0],tic[2][1],tic[2][2]);

        System.out.println();

        for(int i = 0; i<=2; i++){
            for(int j = 0; j<=2; j++){
                System.out.print(tic[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
