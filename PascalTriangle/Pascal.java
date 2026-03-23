import java.util.*;
public class Pascal{
    private int n;
    int[][] res;
    public Pascal(int n){
        this.n = n;
        res = new int[n][n];
    }

    public void generateTriangle(){
        
        for(int i=0;i<n;i++){
            res[i][0] =1;
            for(int j=1;j<=i;j++){
                res[i][j]= res[i-1][j-1] + res[i-1][j];
            }
        }
    }

    public void printTriangle(){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print(res[i][j]+ " ");
            }
            System.out.println();
    }
}
}