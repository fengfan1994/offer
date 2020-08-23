package AimToOffer.chapter02;

public class maxProduct {
    public int maxProductAfterCut(int length){
        if(length<2){
            return 0;
        }
        if(length==2){
            return 1;
        }
        if(length==3){
            return 2;
        }
        int[] products=new int[length+1];
        products[0]=0;
        products[1]=0;
        products[2]=1;
        products[3]=2;

        int max=0;
        for(int i=4;i<length;i++){
            for(int j=1;j<=i/2;++j){
                int product=products[j]*products[i-j];
                if(max<product){
                    max=product;
                }
                products[i]=max;
            }
        }
        max=products[length];
        return max;
    }

    public static void main(String[] args){
        new maxProduct().maxProductAfterCut(20);
    }
}
