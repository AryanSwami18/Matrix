class Matrix{
    public static int determinant(int[][] mat,int r,int c){
        int d = 0;
        if(r == 1 && c == 1){
            d = mat[0][0];
        }
        else if(r == 2 && c ==2){
            d = (mat[0][0]*mat[1][1]) - (mat[1][0]*mat[0][1]);
        }
        else{
            for(int skipcol = 0;skipcol<r;skipcol++){
                int[][] newMatrix = new int[r-1][c-1];
                for(int row = 0;row<r-1;row++){
                    int matcol = 0;
                    for(int col = 0;col<c-1;col++){
                        if(col != skipcol ){
                            newMatrix[row][matcol++] = mat[row+1][col];
                        }
                    }
                    d +=  mat[0][skipcol]*determinant(newMatrix, row, matcol);
                }
            }

        }
    return d;
    }
}