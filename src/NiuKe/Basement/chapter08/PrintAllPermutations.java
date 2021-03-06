package NiuKe.Basement.chapter08;

public class PrintAllPermutations {
    public static void printAllpermutations1(String str){
        char[] chs=str.toCharArray();
        process1(chs,0);
    }

    public static void process1(char[] chs,int i){
        if(i==chs.length){
            System.out.println(String.valueOf(chs));
            return;
        }
        for(int j=i;j<chs.length;j++){
            swap(chs,i,j);
            process1(chs,i+1);
            swap(chs,i,j);
        }
    }

    public static void swap(char[] chs, int i, int j) {
        char tmp = chs[i];
        chs[i] = chs[j];
        chs[j] = tmp;
    }

    public static void main(String[] args) {
        String test1 = "abc";
        printAllpermutations1(test1);
    }
}
