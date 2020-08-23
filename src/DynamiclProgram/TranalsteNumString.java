package DynamiclProgram;
//将一个数字字符串翻译成对应的英文字母的方式
public class TranalsteNumString {
    public int getNums(String str){
        if(str==null || str.equals("")){
            return 0;
        }
        char[] chs=str.toCharArray();
        int[] count=new int[chs.length-1];
        count[chs.length-1]=chs[chs.length-1]=='0'?0:1;
        for(int i=chs.length-2;i>=0;i--){
            if(chs[i]=='0'){
                count[i]=count[i+1];
            }else{
                if((chs[i]-'0')*10+(chs[i+1]-'0')<27){
                    count[i]=count[i+1]+1;
                }
            }
        }
        return count[0];

    }
}
