package DesignPattern;

/**
 * Traditional way
 */

public class SingletonV1 {

    private static SingletonV1 INSTANCE = null;

    private SingletonV1(){}

    public static SingletonV1 getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SingletonV1();
        }

        return INSTANCE;
    }

    public static void main(String[] args) {

        SingletonV1 singletonV1 = SingletonV1.getInstance();

        System.out.println(singletonV1.hashCode());

    }


}
