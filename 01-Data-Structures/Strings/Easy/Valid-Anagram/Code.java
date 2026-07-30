public class Code {
    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        System.out.println(isAnagram(s, t));
    }
    public static  boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        char[] count = new char[26];
        for(char ch: s.toCharArray()){
            count[ch-'a']++;
        }
        for(char ch: t.toCharArray()){
            count[ch-'a']--;
        }
        for(int i: count){
            if(i != 0) return false;
        }
        return true;
    }
}
