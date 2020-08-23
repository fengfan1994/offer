package Match;

//根据正则表达式匹配字符串
public class StringMatch {
    public static void main(String[] args) {
        String[] strs={"A10","W20","D23","SATDT","W45"};
        String regEx= "^[AWSD]\\d{2}$";
        for(String t:strs){
          if(t.matches(regEx)){
              System.out.println(t);
          }
      }
    }
}
