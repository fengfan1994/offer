package NiuKe.Improvement;
import java.util.*;
public class test {
    public static void main(String[] args) {
        Map<Character,Integer> map=new TreeMap<Character, Integer>();
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
    }
}
