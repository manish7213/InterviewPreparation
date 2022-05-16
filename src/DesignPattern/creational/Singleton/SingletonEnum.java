package DesignPattern.creational.Singleton;

/**
 * Making Singleton as Enums benefits: protect against below violations:
 * 1. Enum is thread safe so, synchronise is not required.
 * 2. Can not be cloned.
 * 3. Can not be Serialized.
 */
public enum SingletonEnum {
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
        SingletonEnum singleton = SingletonEnum.INSTANCE;

        System.out.println(singleton.getValue());
        singleton.setValue(2);
        System.out.println(singleton.getValue());

    }
}
