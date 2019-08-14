package AimToOffer.chapter02;

public class RotatedArray {
    public int minNumber(int[] a){
        int start=0;
        int end=a.length-1;
        int middle=0;
        while (a[start]>=a[end]){
            if((end-start)==1){
                middle=end;
                break;
            }
            middle=(start+end)/2;
            if(a[start]<=a[middle]){
                start=middle;
            }else if(a[middle]<=a[end]){
                end=middle;
            }
        }
        return a[middle];
    }

    public static void main(String[] args){
        int[] a={24,36,57,89,1,6,13,18,20,21};
        System.out.println(new RotatedArray().minNumber(a));
    }
}
