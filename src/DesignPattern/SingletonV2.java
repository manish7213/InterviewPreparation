package DesignPattern;

/**
 * Double lock checking.
 */
public class SingletonV2 {

    private static SingletonV2 INSTANCE = null;

    private SingletonV2() {}

    public static SingletonV2 getInstance() {
        if (INSTANCE == null) {
            synchronized (SingletonV2.class) {
                if (INSTANCE == null) {
                    INSTANCE = new SingletonV2();
                }
            }
        }
        return INSTANCE;
    }
}
