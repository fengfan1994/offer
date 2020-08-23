package xiaozhao2018;
import java.util.*;
public class Dictionary {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            int m=sc.nextInt();
            long k=sc.nextLong();
            long count=0;
            ArrayList<String> list=new ArrayList<>();
            while(m>0 && n>0){
                count=getCount(n-1,m,k);
                if(count>=k){
                    list.add("a");
                    n--;
                }else {
                    list.add("z");
                    m--;
                    k=k-count;
                }
            }
            if(k!=1){
                System.out.println(-1);
                return;
            }else {
                while(n>0){
                    list.add("a");
                    n--;
                }
                while(m>0){
                    list.add("z");
                    m--;
                }
            }
            for (int i=0;i<list.size();i++){
                System.out.print(list.get(i));
            }
        }

    }



    public static long getCount(int n,int m,long k){
        if(n==0 || m==0){
            return 1;
        }
        long count=1;
        int sum=m+n;
        n=Math.min(m,n);
        for(int i=0;i<n;i++){
            count=count*(sum-i);
            count/=(i+1);
            if(count>k) break;
        }
        return count;
    }

}
