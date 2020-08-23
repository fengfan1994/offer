package HUAWEI;

import java.util.*;

//输入n个字符串，将其字母顺序排序输出，输入的字符串可重复
public class OrderString {
        //按照指定规则对数组进行排序
        public static void main(String[] args)
        {
            Scanner sca = new Scanner(System.in);
            while (sca.hasNext())
            {
                String str = sca.nextLine();
                char [] cha = str.toCharArray();
                StringBuffer sb = new StringBuffer();

                for (int i = 0; i<26; i++)
                {
                    char c = (char)(i + 'A');
                    for (int j = 0; j<str.length(); j++)
                    {
                        if (cha[j] == c || cha[j] == (char)(c + 32))
                            sb.append(cha[j]);
                    }
                }
                //巧妙使用insert方法，底层是数组复制，会有较大消耗
                for (int k = 0; k<str.length(); k++)
                {
                    if (!(cha[k] >= 'A' && cha[k] <= 'Z' || cha[k] >= 'a' && cha[k] <= 'z'))
                        sb.insert(k, cha[k]);
                }
                System.out.println(sb.toString());
            }
        }


    //统计字符串中各字符、数字、空格的个数，同按照字符个数从大到小排序
    public void countChar(String target){
        char[] ch=target.toCharArray();
        Map<Character,Integer> map=new TreeMap<Character, Integer>();
        for(char c:ch){
            if(c==' '||(c>='0'&&c<='9')||(c>='a'&&c<='z')||(c>='A'&&c<='Z')){
                if(map.containsKey(c)){
                    map.put(c,map.get(c)+1);
                }else {
                    map.put(c,1);
                }
            }
        }
        //按照value进行排序
        List<Map.Entry<Character, Integer>> list = new ArrayList<Map.Entry<Character, Integer>>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                if(o1.getValue()==o2.getValue()){
                    return o1.getKey().compareTo(o2.getKey());
                }else{
                    return o2.getValue().compareTo(o1.getValue());
                }
            }
        });
       for(Map.Entry<Character,Integer> mapping:list){
           System.out.print(mapping.getKey());
       }

    }

    //连续输入字符串，将其分为长度为8的字符串数组，不足8位则补0
    public static List<String>  orderString(String target){
        List<String> list=new ArrayList<>();
        String subString=target;
        while(subString.length()>8){
            String s=subString.substring(0,8);
            list.add(s);
            subString=subString.substring(8,subString.length());
        }
        if(subString.length()<8&& subString.length()!=0){
            int len=subString.length();
            for(int i=0;i<8-len;i++){
                subString=subString+"0";
            }
        }
        list.add(subString);
        return list;
    }

    //输入字符串，按照指定规则将其排序，共三条规则
    public static String sortString(String target){
        String low=target.toLowerCase();
        List<Character> list=new ArrayList<>();
        for(int i=0;i<low.length();i++){
            if(low.charAt(i)>='a' && low.charAt(i)<='z'){
                list.add(low.charAt(i));
            }
        }

        List<Integer> other=new ArrayList<>();
        for(int i=0;i<low.length();i++){
            if(low.charAt(i)<'a' || low.charAt(i)>'z'){
                other.add(i);
            }
        }
        Collections.sort(list);
        String result="";
        int charNum=0;
        int otherNum=0;
        while(result.length()<target.length()){
            if(otherNum<other.size() && result.length()==other.get(otherNum)){
                result+=target.charAt(other.get(otherNum));
                otherNum++;
            }else{
                result+=list.get(charNum);
                charNum++;
            }
        }

        return result;
    }

}
