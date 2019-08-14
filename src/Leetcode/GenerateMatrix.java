package Leetcode;

public class GenerateMatrix {
    public int[][] generateMatrix(int n) {
        int[][] m=new int[n][n];
        int i=0,j=n-1;
        int count=0;
        while(i<=j){
            paint(m,i,j,count);
            i++;j--;
        }
        return m;
    }

    public void paint(int[][] m,int i,int j,int count){
        if(i==j){
            count++;
            m[i][j]=count;
            return;
        }
        int x=i,y=i;
        while(y!=j){
            count++;
            m[x][y]=count;
            y++;
        }
        while(x!=j){
            count++;
            m[x][y]=count;
            x++;
        }
        while(y!=i){
            count++;
            m[x][y]=count;
            y--;
        }
        while(x!=i){
            count++;
            m[x][y]=count;
            x--;
        }
    }

}
