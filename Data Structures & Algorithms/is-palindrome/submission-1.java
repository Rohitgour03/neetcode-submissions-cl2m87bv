class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder newStr = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                newStr.append(Character.toLowerCase(c));
            }
        }

        char[] newCharArr = newStr.toString().toCharArray();
        int start = 0, end = newStr.length() - 1;
        while(start < end) {
            if (newCharArr[start] != newCharArr[end]) return false;
            start++;
            end--;
        }
        return true;
    }
}
