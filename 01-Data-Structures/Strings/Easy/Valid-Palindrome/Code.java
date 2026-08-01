public class Code {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(char ch: s.toCharArray()){
            if(Character.isLetter(ch) || Character.isDigit(ch)){
                sb.append(Character.toLowerCase(ch));
            }
        }
        return (sb.toString()).equals(sb.reverse().toString());
    }
}
