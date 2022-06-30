package InheritanceDemo;

public class Test {

    public Test() {
        System.out.println("Parent Test Constructor !!");
    }

    public Test(int i) {
        System.out.println("Parent Class Parametrized Constructor "+ i);
    }

    public void printHello() {
        System.out.println("Printing hello !!");
    }
}


class ChildTest extends Test {

    public ChildTest(){
        System.out.println("Child Test Constructor !!");
    }

    public ChildTest(int i){
        System.out.println("Child Class Parametrized Constructor "+ i);
        System.out.println("Child Test Constructor !!");
    }

    public static void main(String[] args) {

//        ChildTest childTest = new ChildTest();
//        childTest.printHello();

        ChildTest childTest1 = new ChildTest(2);
        childTest1.printHello();
    }
}
