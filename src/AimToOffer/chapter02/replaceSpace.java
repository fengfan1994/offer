package AimToOffer.chapter02;

public class replaceSpace {
    public StringBuilder replaceSpaceWithString(String target){
        StringBuilder result=new StringBuilder();
        for(char c:target.toCharArray()){
            if(c==' '){
                result.append("%20");
            }else{
                result.append(c);
            }
        }
        System.out.println(result);
        return result;
    }

    public static void main(String[] args){
        String target="We are happy.";
        new replaceSpace().replaceSpaceWithString(target);
    }
}
