package BackRrack;

public class MovePath {
    public int movingCount(int threshold, int rows, int cols){
        int[][] flag=new int[rows][cols];
        return helper(threshold,rows,cols,0,0,flag);
    }

    public int helper(int threshold,int rows,int cols,int i,int j,int[][] flag){
        if(i<0 || i>=rows || j<0 || j>=cols || flag[i][j]==1){
            return 0;
        }
        if(sum(i,j)>threshold){
            return 0;
        }
        flag[i][j]=1;
        return helper(threshold,rows,cols,i+1,j,flag)+
                helper(threshold,rows,cols,i-1,j,flag)+
                helper(threshold,rows,cols,i,j+1,flag)+
                helper(threshold,rows,cols,i,j-1,flag)+1;
    }

    public int sum(int i,int j){
        int sum=0;
        while(i!=0){
            sum+=i%10;
            i=i/10;
        }
        while(j!=0){
            sum+=j%10;
            j=j/10;
        }
        return sum;
    }
}
