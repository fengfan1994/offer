package BeautyOfProgram.ScrectOfNum;
//计算一个N！后的数字末尾有多少个0
public class NumOfZero {
    //分解质因数，找出质因数中5的个数
    public static int numOfZero(int N){
        int count=0;
        for(int i=1;i<=N;i++){
            int j=i;
            if(j%5==0){
                ++count;
                j=j%5;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(numOfZero(5));
    }
}
