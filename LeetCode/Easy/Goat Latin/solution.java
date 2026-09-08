import java.util.*;

class Solution {

    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u';
    }

    public static String toGoatLatin(String str) {
      String[] words = str.split(" ");
      String ans = "";

      for (int i = 0; i < words.length; i++) {
        String word = words[i];
        char firstChar = word.charAt(0);

        if (!isVowel(firstChar)) {
            ans += word.substring(1) + firstChar + "ma";
        } else {
            ans += word + "ma";
        }

        for (int j = 0; j <= i; j++) {
            ans += "a";
        }

        if (i != words.length - 1) {
            ans += " ";
        }
      }return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();
        System.out.println(toGoatLatin(str));
        sc.close();
    }
}