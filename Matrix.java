class Matrix{
    public static double determinant(int[][] mat, int r, int c) {
    double d = 0;
    if (r == 1 && c == 1) {
        d = mat[0][0];
    } else if (r == 2 && c == 2) {
        d = (mat[0][0] * mat[1][1]) - (mat[1][0] * mat[0][1]);
    } else {
        int sign = 1;
        for (int skipcol = 0; skipcol < r; skipcol++) {
            int[][] newMatrix = new int[r - 1][c - 1];
            for (int row = 1; row < r; row++) {
                int matcol = 0;
                for (int col = 0; col < c; col++) {
                    if (col != skipcol) {
                        newMatrix[row - 1][matcol++] = mat[row][col];
                    }
                }
            }
            d += sign * mat[0][skipcol] * determinant(newMatrix, r - 1, c - 1);
            sign = -sign;
        }
    }
    return d;
}

   
    public static int[][] transpose(int mat[][] ,int r,int c){
        int[][] newMat = new int [c][r];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                newMat[j][i] = mat[i][j];
            }
        }
       
        return newMat;
    }


    public static double[] cramersRule(int mat[][], int equation[]) {
        double values[] = new double[mat.length];
        double d = determinant(mat, mat.length, mat[0].length);

        if (d != 0) {
            for (int chgCol = 0; chgCol < mat.length; chgCol++) {
                int[][] temp = new int[mat.length][mat[0].length];

                for (int rows = 0; rows < mat.length; rows++) {
                    for (int cols = 0; cols < mat.length; cols++) {
                        if (cols == chgCol) {
                            temp[rows][cols] = equation[rows];
                        } else {
                            temp[rows][cols] = mat[rows][cols];
                        }
                    }
                }
                // printt(temp);
                values[chgCol] = determinant(temp, temp.length, temp[0].length) / d;
            }
        }
        return values;
    }

}