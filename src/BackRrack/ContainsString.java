package BackRrack;

public class ContainsString {
    public boolean hasPath(char[] matrix,int row,int col,char[] str){
        int[] flag=new int[matrix.length];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(helper(matrix,row,col,i,j,str,0,flag)){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean helper(char[] matrix,int row,int col,int i,int j,char[] str,int k,int[] flag){
        int index=i*col+j;
        if(i<0 || i>=row || j<0 || j>=col || matrix[index]!=str[k]|| flag[index]==1){
            return false;
        }
        if(k==str.length-1){
            return true;
        }
        //标志已经走过
        flag[index]=1;
        if(helper(matrix,row,col,i-1,j,str,k+1,flag) || helper(matrix,row,col,i+1,j,str,k+1,flag) ||
                helper(matrix,row,col,i,j+1,str,k+1,flag)|| helper(matrix,row,col,i,j-1,str,k+1,flag)){
            return true;
        }
        flag[index]=0;
        return false;
    }
}
