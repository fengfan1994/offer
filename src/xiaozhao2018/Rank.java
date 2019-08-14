package xiaozhao2018;

public class Rank {
    public static int getRes(double n){
        double res1=Math.sqrt((8*n+1));
        return (int)Math.ceil(res1/2);
    }
}
