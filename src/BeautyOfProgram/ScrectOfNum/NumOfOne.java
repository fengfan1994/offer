package BeautyOfProgram.ScrectOfNum;

public class NumOfOne {
    //基于除法
    public static int numOfOne(int k){
        int count=0;
        while(k>0){
            if(k%2==1){
                count++;
            }
            k=k/2;
        }
        return count;
    }

    //基于位运算
    public static int numofone(int k){
        int count=0;
        while (k>0){
            ++count;
            k=k&(k-1);
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(numOfOne(7));
    }
}
