package String;

public class SwapCharactersInString {

    public static void main(String[] args) {
        String name = "manish";
        int i = 0;
        int j = 5;

        char[] chars = name.toCharArray();

        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;

        System.out.println(new String(chars));

    }
}
