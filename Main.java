import java.util.Scanner;
class Main {

    public static void printt(double[] t){
        System.out.println("vlaue are:");
        for(int i=0;i<t.length;i++){
                System.out.println(t[i]);
        } 
    }
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
        double determinat = Matrix.determinant(matrix, rows, cols);
        System.out.println("Determinant:"+determinat);
        int equation[] = new int[matrix.length];
        System.out.println("Enter "+matrix.length+" Coeff:");
        for(int i=0;i<matrix.length;i++){
            equation[i] = s.nextInt();
        }

        double values[] = Matrix.cramersRule(matrix, equation);

        printt(values);
        s.close();
    }
}