class Solution {
    public boolean isPalindrome(String s) {
        boolean answer = true;
        int last = s.length() - 1;
        s = s.toLowerCase();
        // 굳이 while문이 아닌 for문을 이용하여 작성해보고싶었음
        for (int first = 0; first < last; first++, last--) { 
            // isLetterOrDigit 함수에 대해 모르고 있었음 -> 인자로는 char형을 받음
            if (!Character.isLetterOrDigit(s.charAt(first))) {
                last++;
            } else if (!Character.isLetterOrDigit(s.charAt(last))) {
                first--;
            } else if (s.charAt(first) != s.charAt(last)) {
                answer = false;
                break;
            } 
        }
        return answer;
    }
}