package String;

public class ImplementStrStr {
    public int strStr(String haystack, String needle) {

        int i = 0;
        int j = 0;
        int count = 0;
        if(needle.length() > haystack.length()) {
            return -1;
        }
        while(i < haystack.length() && j < needle.length()) {


            if(haystack.charAt(i) != needle.charAt(j)) {
                i++;
            } else {
                i++;
                j++;
                count++;
            }
        }
        if(count != needle.length()) {
            return -1;
        }
        return i;
    }
}
