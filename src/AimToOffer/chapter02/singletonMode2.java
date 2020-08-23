package AimToOffer.chapter02;

public class singletonMode2 {
    private singletonMode2(){};

    private static singletonMode2 instance=null;

    public static singletonMode2 getInstance(){
        if(instance==null){
            synchronized (singletonMode2.class){
                if(instance==null){
                    instance=new singletonMode2();
                }
            }
        }
        return instance;
    }
}
