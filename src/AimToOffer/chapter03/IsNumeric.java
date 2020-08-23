package AimToOffer.chapter03;

import java.util.LinkedList;

public class IsNumeric {
    public boolean isNumric(char[] str){
        //判断有无正负号，数字，小数点
        boolean signal = false,decimal = false,hasE = false;
        for(int i=0;i<str.length;i++){
            if(str[i] == 'E' || str[i] == 'e'){
                //e后面必须有数字，所以是最后一位肯定不通过
                if(i==str.length-1 || i==0){
                    return false;
                }
                //不能有两个e
                if(hasE){
                    return false;
                }
                hasE = true;
            }else if(str[i] == '+' || str[i] == '-'){
                //不是第一次出现，那么后面能出现符合的地方只有紧贴着e的后面一位，不是则不通过
                if(signal && str[i-1] != 'E' && str[i-1] != 'e'){
                    return false;
                }
                //第一次出现，如果不是出现在第一位，那么还是判断一下是不是出现在e的后面一位
                if(!signal && i>0 && str[i-1] != 'E' && str[i-1] != 'e'){
                    return false;
                }

                signal = true;
            }else if(str[i] == '.'){
                //如果存在e并且e后面为小数则不通过,存在多个小数点也不通过
                if(hasE || decimal) return false;
                decimal = true;
            }else if(str[i] < '0' || str[i] > '9'){
                //不是e也不是+-符号也不是小数点，那么只能是数字，不是数字就是非法的字符
                return false;
            }
        }

        return true;
    }
}
