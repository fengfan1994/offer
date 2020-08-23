package AimToOffer.chapter06;

public class PrintProbability {
    int g_maxValue=6;
    public void printProbability(int number){
        if(number<1){
            return;
        }
        int maxSum=g_maxValue*number;
        int[] pProbability=new int[maxSum-number+1];
        for(int i=number;i<=maxSum;i++){
            pProbability[i-number]=0;
        }
        Probability(number,pProbability);
        double total=Math.pow(g_maxValue,number);
        for(int i=number;i<=maxSum;i++){
            double ratio=pProbability[i-number]/total;
            System.out.println(i+":"+ratio);
        }

    }

    public void Probability(int number,int[] pProbability){
        for(int i=1;i<=g_maxValue;i++){
            Probability(number,number,i,pProbability);
        }
    }

    public void Probability(int original,int current,int sum,int[] pProbability){
        if(current==1){
            pProbability[sum-original]++;
        }else {
            for(int i=1;i<=g_maxValue;i++){
                Probability(original,current-1,i+sum,pProbability);
            }
        }
    }

    public static void main(String[] args){
        new PrintProbability().printProbability(4);
    }

}
