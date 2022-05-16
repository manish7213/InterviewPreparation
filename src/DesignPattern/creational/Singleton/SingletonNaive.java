package DesignPattern.creational.Singleton;

/**
 * Example :
 * java.lang.Runtime#getRuntime()
 * java.awt.Desktop#getDesktop()
 * java.lang.System#getSecurityManager()
 */

public class SingletonNaive {

    public static SingletonNaive instance;
    public String value;

    private SingletonNaive(String value) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
        this.value = value;
    }

    public static SingletonNaive getInstance(String value) {
        if (instance == null) {
            instance = new SingletonNaive(value);
        }

        return instance;
    }
}


class SingletonNaiveMain {
    public static void main(String[] args) {
        SingletonNaive singleton_naive1 = SingletonNaive.getInstance("2");
        SingletonNaive singleton_naive2 = SingletonNaive.getInstance("3");

        System.out.println(singleton_naive1.hashCode());
        System.out.println(singleton_naive2.hashCode());

        System.out.println(singleton_naive1.value);
        System.out.println(singleton_naive2.value);

    }


}
