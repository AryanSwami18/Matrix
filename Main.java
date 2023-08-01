import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Rows");
        int rows = s.nextInt();
        System.out.println("Enter cols");
        int cols = s.nextInt();
        int[][] matrix = new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrix[i][j] = s.nextInt();
            }
        } 
        int determinat = Matrix.determinant(matrix, rows, cols);
        System.out.println("Determinant:"+determinat);
        s.close();
    }
}