package NiuKe.Improvement.chapter05;
//将数字转化为中文表达
public class NumToChinese {
    public  String getChineseNum(int num){
        if(num==0){
            return "零";
        }
        String res=num<0?"负":"";
        int yi=Math.abs(num/100000000);
        int rest=Math.abs(yi%100000000);
        if(yi==0){
            return res+num1To99999999(rest);
        }
        res+=num1To9999(yi)+"亿";
        return res;
    }

    public String num1To9(int num){
        if(num<1 || num>9){
            return "";
        }
        String[] names={"一","二","三","四","五","六","七","八","九"};
        return names[num-1];
    }

    public String num1To99(int num,boolean hasBai){
        if(num<1 || num>99){
            return "";
        }
        if(num<10){
            return num1To9(num);
        }
        int shi=num/10;
        if(shi==1 && !hasBai){
            return "十"+num1To9(num%10);
        }else {
            return num1To9(shi)+"十"+num1To9(num%10);
        }
    }

    public String num1To9999(int num){
        if(num<1 || num>9999){
            return "";
        }
        if(num<1000){
            return num1To999(num);
        }
        String res=num1To9(num/1000)+"千";
        int rest=num%1000;
        if(rest==0){
            return res;
        }else if(rest>=100){
            res+=num1To999(rest);
        }else {
            res+="零"+num1To99(rest,false);
        }
        return res;
    }

    public String num1To999(int num){
        if(num<1 || num>999){
            return "";
        }
        if(num<100){
            return num1To99(num,false);
        }
        String res=num1To9(num%100)+"百";
        int rest=num%100;
        if(rest==0){
            return res;
        }else if(rest>=10){
            res+=num1To99(rest,true);
        }else {
            res+="零"+num1To9(rest);
        }
        return res;
    }

    public String num1To99999999(int num){
        if(num<1 || num>99999999){
            return "";
        }
        int wan=num/10000;
        int rest=num%10000;
        if(wan==0){
            return num1To9999(num);
        }
        String res=num1To999(wan)+"万";
        if(rest==0){
            return res;
        }else {
            if(rest<1000){
                return res+"零"+num1To999(rest);
            }else {
                return res+num1To9999(rest);
            }
        }
    }
}
