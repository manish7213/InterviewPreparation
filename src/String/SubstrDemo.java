package String;

public class SubstrDemo {

    public static void main(String[] args) {

        String str = "Manish Kumar";

        String substring = str.substring(0);
        System.out.println(substring);

        String substring1 = str.substring(1);
        System.out.println(substring1);

        String substring2 = str.substring(2);
        System.out.println(substring2);

        String substring3 = str.substring(1, 3); //[) --> right value is not inclusive
        System.out.println(substring3);

        String substring4 = str.substring(3, 6);
        System.out.println(substring4);

    }
}
