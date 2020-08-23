package AimToOffer.chapter02;

public class repeatedNumber1 {
    public int getRepeatedNumber(int[] a){
        for(int i=0;i<a.length;i++){
            if(a[i]<0 || a[i]>a.length){
                return -1;
            }
        }
        int start=1;
        int end=a.length;
        while(end>=start){
            int middle=(end-start)>>1+start;
            int count= repeatedNumber1.countRange(a,start,middle);
            if(end==start){
                if(count>1){
                    return start;
                }else{
                    break;
                }
            }
            if(count>(middle-start+1)){
                end=middle;
            }else {
                start=middle+1;
            }
        }
        return -1;

    }

    public static int countRange(int[] a,int start,int end){
        int count=0;
        for(int i=0;i<a.length;i++){
            if(a[i]>=start && a[i]<=end){
                ++count;
            }
        }
        return count;
    }
}
