package BackRrack;

public class BackTracking2 {
    public static void main(String[] args){
        String s="abc";
        pailie(s,"");
    }
    public static void pailie(String s, String temp){//参数设计地尽量地简洁
        if(s.length()==0){
            System.out.println(temp);
            return;
        }
        for(int i=0;i<s.length();i++){
            //substirng不包括结束索引
            //去掉string中的第i个字母
            String news=s.substring(0, i)+s.substring(i+1,s.length());//去掉String中的某个字母
            pailie(news, temp+s.charAt(i));
        }
    }
}

