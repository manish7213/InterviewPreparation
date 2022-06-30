package Misc;

import java.io.IOException;
import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        String s = "Manish;Monu;Sonu;Dinesh";
        splitFuc(s);
    }
    private static void splitFuc(String s) {

        String[] str = s.split(";");
        System.out.println(Arrays.toString(str));
    }
}
