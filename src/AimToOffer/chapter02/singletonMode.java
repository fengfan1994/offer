package AimToOffer.chapter02;

public class singletonMode {
    private singletonMode(){};

    private static singletonMode instance=new singletonMode();

    public static singletonMode getInstance(){
        return instance;
    }
}
