package BackRrack;

import java.util.ArrayList;

public class PhoneString {
    static ArrayList<String> res=new ArrayList<String>();

    public static void main(String[] args) {
        String srtr="034";
        new PhoneString().letterCombinations(srtr);
        for(String s:res){
            System.out.println(s);
        }
    }

    public ArrayList<String> letterCombinations(String digits) {
        if(digits==null||digits.length()==0){
            res.add("");
            return res;

        }

        String[] mapping={"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        letterCombinations(digits,0,"",mapping);
        return res;
    }


    private void letterCombinations(String digits, int i, String string,String[] mapping) {
        if(i>=digits.length()){
            res.add(string);
            return;
        }
        String strs=mapping[digits.charAt(i)-'0'];
        for(char c:strs.toCharArray()){
            letterCombinations(digits,i+1,string+c,mapping);
        }

    }
}
