package Leetcode;

public class StringToNum {

    public int atoi(String str) {
        if(str.isEmpty()){
            return 0;
        }
        char[] ch=str.toCharArray();
        int j=0;
        while(j<str.length() && ch[j]==' '){
            j++;
        }
        if(j==ch.length ||(ch[j]!='+' && ch[j]!='-' && ch[j]>'9' && ch[j]<'0')){
            return 0;
        }
        boolean isPos=ch[j]=='+';
        boolean isNeg=ch[j]=='-';

        int ans=0,preAns=ans;

        for(int i=(isPos || isNeg ?j+1 :j);i<ch.length && ch[i]>='0'&& ch[i]<='9';i++){
            ans=ans*10+(ch[i]-'0');
            if(ans/10!=preAns){
                return isNeg?Integer.MIN_VALUE:Integer.MIN_VALUE;
            }
            preAns=ans;
        }

        return isNeg ? -ans:ans;
    }
    public static void main(String[] args) {
        System.out.println(new StringToNum().atoi("  -+12 "));
        String s="123";
    }
}
