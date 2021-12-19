package Misc;

public class CheckForAnagram {

    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;

        int[] count = new int[26];

        for(int i=0;i<s.length();i++)
        {
            count[s.charAt(i)-'a']++;//increasing the value at that index by 1
            count[t.charAt(i)-'a']--;//decreasing the value at that index by 1

        }
        for(int i=0;i<count.length;i++)
        {
            if(count[i]!=0)
                return false;
        }
        return true;
    }

//    public static boolean isAnagramV2(String originalString, String testString) {
//
//    }

    public static void main(String[] args) {

//        System.out.println(isAnagram("anagram", "nagaram"));

        System.out.println('a'-'a');
        System.out.println('b'-'a');
        System.out.println('c'-'a');
    }
}
