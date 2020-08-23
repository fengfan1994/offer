package AimToOffer.chapter04;

public class PrintMatrix {
    public void printMatrixInCircle(int[][] target){
        int rows=target[0].length;
        int columns=target.length;
        if(target==null || rows==0 || columns==0){
            return;
        }
        int start=0;
        while(rows>start*2 && columns>start*2){
            printMatrixCircle(target,start,rows,columns);
            start++;
        }
    }
    public void printMatrixCircle(int[][] target,int start,int rows,int columns){
        int endX=columns-1-start;
        int endY=rows-1-start;
        for(int i=start;i<=endX;i++){
            System.out.print(target[start][i]+" ");
        }
        if(start<endY){
            for(int i=start+1;i<=endY;i++){
                System.out.print(target[i][endY]+" ");
            }
        }
        if(endX>start){
            for(int i=endY-1;i>=start;i--){
                System.out.print(target[endX][i]+" ");
            }
        }
        if(endY-1>start && endX>start){
            for(int i=endY-1;i>start;i--){
                System.out.print(target[i][start]+" ");
            }
        }
    }
    public static void main(String[] args){
        int[][] a={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        new PrintMatrix().printMatrixInCircle(a);
    }
}
