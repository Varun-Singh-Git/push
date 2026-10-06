class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        for(int i=0;i<words.length;i++){
            String rev = "";
            char[] w =words[i].toCharArray();
            for(int j=w.length-1;j>=0;j--){
                rev+= w[j];
            }
            words[i]=rev;
        }return String.join(" ", words);
    }
}