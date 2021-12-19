package DesignPattern;


public enum SingletonV3 {
    INSTANCE;

    int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

}

class EnumDemo {

    public static void main(String[] args) {
        SingletonV3 singletonV3 = SingletonV3.INSTANCE;

        System.out.println(singletonV3.getValue());
        singletonV3.setValue(2);
        System.out.println(singletonV3.getValue());
    }
}

