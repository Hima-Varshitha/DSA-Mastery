public class Code{
    public static void main(String[] args){
        String s = "abcde";
        String goal = "cdeab";
        System.out.println(rotateString(s, goal));
    }
    public static boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) return false;
        String str = s+s;
        for(int i=0; i<s.length(); i++){
            if(goal.equals(str.substring(i, i+s.length()))) return true;
        }
        return false;
    }
}