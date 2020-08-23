package AimToOffer.chapter03;

public class doublePower {
    //两个浮点数无法用==判别相等，因为精度不够
    public double getResult(double base,int component){
        double result=1.0;
        if(equal(base,0.0)&& component==0){
            return -1;
        }
       else if(equal(base,0.0)&&component!=0){
            return result;
        }else{
            if(component>0){
                for(int i=1;i<=component;i++){
                    result*=base;
                }
                return result;
            }else{
                component=component*(-1);
                for(int i=1;i<=component;i++){
                    result*=base;
                }
                return 1/result;
            }
        }
    }

    public static void main(String[] args){
        System.out.println(new doublePower().getResult(0,0));
    }

    public boolean equal(double a,double b){
        if(a-b<0.000001 && a+b>-0.000001){
            return true;
        }
        return false;
    }
}
