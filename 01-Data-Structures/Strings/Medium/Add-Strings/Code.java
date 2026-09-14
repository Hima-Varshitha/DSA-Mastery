class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder res = new StringBuilder();
        int n1 = num1.length()-1, n2 = num2.length()-1;
        int carry = 0;
        while(n1 >= 0 && n2 >= 0){
            int dig1 = num1.charAt(n1)-'0';
            int dig2 = num2.charAt(n2)-'0';

            int sum = dig1 + dig2 + carry;

            res.insert(0, sum%10);
            carry = sum/10;
            n1--;
            n2--;
        }
        while(n1 >= 0){
            int dig = num1.charAt(n1)-'0';
            int sum = dig + carry;
            res.insert(0, sum%10);
            carry = sum/10;
            n1--;
        }
        while(n2 >= 0){
            int dig = num2.charAt(n2)-'0';
            int sum = dig + carry;
            res.insert(0, sum%10);
            carry = sum/10;
            n2--;
        }
        if(carry > 0) res.insert(0, carry);
        return res.toString();
    }
}