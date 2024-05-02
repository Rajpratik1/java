import java.util.Scanner;

public class inputPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();
        int c[][] = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                c[i][j] = sc.nextInt();
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
        int d[][] = new int[column][row];
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                d[column][row] = c[i][j];
                System.out.print(d[column][row] + " ");
            }
            System.out.println();
        }
    }
}
