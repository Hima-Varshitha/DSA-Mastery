import java.util.*;
class Solution {
    public static void main(String[] args){
        System.out.println(generate(5));
    }

    public static List<List<Integer>> generate(int n) {
        int[][] mat = new int[n][n];
        List<List<Integer>> triangle = new ArrayList<>();
        for(int i=0; i<n; i++){
            List<Integer> list = new ArrayList<>();
            for(int j=0; j<=i; j++){
                if(j==0 || j==i){
                    mat[i][j] = 1;
                    list.add(mat[i][j]);
                }
                else{
                    mat[i][j] = mat[i-1][j-1] + mat[i-1][j];
                    list.add(mat[i][j]);
                }
            }
            triangle.add(list);
        }
        return triangle;
    }
}