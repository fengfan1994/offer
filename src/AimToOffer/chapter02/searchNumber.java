package AimToOffer.chapter02;

public class searchNumber {
    public boolean existNumber(int a[][],int k){
        int rows=a.length;
        int columns=a[0].length;
        int row=0;
        int column=columns-1;
        while(row<rows && column>0){
            if(a[row][column]==k){
                return true;
            }else if(a[row][column]>k){
                --column;
            }else{
                ++row;
            }
        }
        return false;

    }

    public static void main(String[] args){
        int a[][]={{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
       System.out.println(new searchNumber().existNumber(a,7));
    }
}
