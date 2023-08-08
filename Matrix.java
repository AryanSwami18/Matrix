class Matrix{
    public static int determinant(int[][] mat, int r, int c) {
    int d = 0;
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
        int[][] newMat = new int [r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                newMat[j][i] = mat[i][j];
            }
        }
       
        return newMat;
    }
}