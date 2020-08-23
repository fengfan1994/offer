package AimToOffer.chapter05;

public class UglyNumber {
    //设想要完备，避免出现无法处理的情况
    public int getUglyNumber(int k){
        int [] array =new int[k];
        int num3=0;
        int num5=0;
        int num7=0;
        array[0]=3;
        array[1]=5;
        array[2]=7;
        for(int i=3;i<k;i++){
            array[i]=Math.min(Math.min(array[num3]*3,array[num5]*5),array[num7]*7);
            if(array[i]==array[num3]*3) num3++;
            if(array[i]==array[num5]*5) num5++;
            if(array[i]==array[num7]*7) num7++;
        }
        return array[k-1];}
}
