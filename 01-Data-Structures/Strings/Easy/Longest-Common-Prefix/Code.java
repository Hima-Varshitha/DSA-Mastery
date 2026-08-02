public class Code {
    public static void main(String[] args) {
        String[] s= {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(s));
    }
    public static String longestCommonPrefix(String[] s) {
        if(s == null || s.length == 0) return "";
        String prefix = s[0];
        for(int i=0; i<s.length; i++){
            while(!s[i].startsWith(prefix)){
                prefix = prefix.substring(0, prefix.length()-1);
                if(prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }
}
