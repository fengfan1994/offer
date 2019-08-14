package xiaozhao2018;
import java.util.*;
public class Sleep {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        int[] t = new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            t[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++)
            if(t[i]==1)sum+=a[i];
        int temp=0;
        for(int i=0;i<k;i++){
            if(t[i]==0)temp+=a[i];
        }
        int max=temp;
        for(int i=k;i<n;i++){
            if(t[i]==0)temp+=a[i];
            if(t[i-k]==0)temp-=a[i-k];
            if(temp>max)max=temp;
        }
        System.out.println(max+sum);
        }
    }



