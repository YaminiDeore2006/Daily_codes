class Solution {
    boolean isPalindrome(String s) {
        // code here
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < s.length() ; i++)
        {
            sb.append(s.charAt(i));
        }
        if(s.equals(sb.reverse().toString())) // for string ypu need to use eua
        // equals function for comparation .
        {
            return true;
        }
        return false;
    }
}
