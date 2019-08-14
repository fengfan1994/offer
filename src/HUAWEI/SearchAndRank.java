package HUAWEI;

import java.util.*;

class Studnet implements Comparable<Studnet>{
    String name;
    int grade;
    public static int flag;

    public Studnet(String name,int grade){
        this.name=name;
        this.grade=grade;
    }

    @Override
    public String toString(){
        return name+" "+grade;
    }


    @Override
    public int compareTo(Studnet o) {
        if(flag==0){
            return o.grade-grade;
        }else{
            return grade-o.grade;
        }
    }
}

public class SearchAndRank {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int total=sc.nextInt();
            Studnet.flag=sc.nextInt();
            Studnet[] stu=new Studnet[total];
            for(int i=0;i<total;i++){
                stu[i]=new Studnet(sc.next(),sc.nextInt());
            }
            Arrays.sort(stu);
            for(Studnet s:stu){
                System.out.println(s);
            }
        }

    }
}
