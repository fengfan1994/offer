package Leetcode;



public class SurroundedRegion {
    public static void main(String[] args) {
        char[][] ch={{'O','O','O'},{'O','O','O'},{'O','O','O'}};
        new SurroundedRegion().solve(ch);
    }

    public int row=0;
    public int col=0;

    public void solve(char[][] board) {
        if(board==null || board.length<3 || board[0].length<3){
            return ;
        }
        int row=board.length;
        int col=board[0].length;

        for(int i=0;i<row;i++){
            dfs(board,i,0);
            dfs(board,i,col-1);
        }
        for(int i=0;i<col;i++){
            dfs(board,0,i);
            dfs(board,row-1,i);
        }

        for(int i=0;i<row;i++) {
            for (int j = 0; j < col; j++) {
                if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                }
                if (board[i][j] == '*') {
                    board[i][j] = 'O';
                }

            }
        }
    }

    public  void dfs(char[][] m,int i,int j){
        if(i<0 || i>=row || j<0 || j>=col || m[i][j]!='O'){
            return ;
        }
        m[i][j]='*';
        System.out.print(m[i][j]+"  ");
        dfs(m,i+1,j);
        dfs(m,i-1,j);
        dfs(m,i,j+1);
        dfs(m,i,j-1);
    }
}
