import java.util.*;
class Code {
    public static void main(String[] args){
        System.out.println(getRow(3));
    }
    public static List<Integer> getRow(int n) {
        int[][] mat = new int[n+1][n+1];
        for(int i=0; i<=n; i++){
            for(int j=0; j<=i; j++){
                if(j==0 || j==i){
                    mat[i][j] = 1;
                }
                else{
                    mat[i][j] = mat[i-1][j-1] + mat[i-1][j];
                }
            }
        }
        List<Integer> temp = new ArrayList<>();
        for(int col=0; col<mat[0].length; col++){
            temp.add(mat[n][col]);
        }
        return temp;
    }
}