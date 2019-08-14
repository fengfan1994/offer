package DesignMode;

public class Singleton {
    private static Singleton singleton;
    private Singleton(){

    }

    //懒汉式，线程不安全
    public static Singleton getInstance1(){
        if(singleton==null){
            singleton=new Singleton();
        }
        return singleton;
    }

    //双重校检锁,线程安全
    public static Singleton getInstance2(){
        if(singleton==null){
            synchronized (Singleton.class){
                if(singleton==null){
                    singleton=new Singleton();
                }
            }
        }
        return singleton;
    }

    private static class SingletonHolder{
        private static final Singleton INSTANCE=new Singleton();
    }

    //基于静态内部类，线程安全
    public static Singleton getInstance3(){
        return SingletonHolder.INSTANCE;
    }
}
