package week5.ValidParentheses20;

import java.util.LinkedList;

public class ValidParentheses20 {
    public boolean isValid(String s) {
        LinkedList<Character> linkedList = new LinkedList<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                linkedList.push(ch);
            } else {
                // 닫는 괄호일 경우
                if (linkedList.isEmpty()) {
                    return false;
                }
                char top = linkedList.pop();
                if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {
                    return false; // 유효하지 않음
                }
            }
        }
        // 모든 괄호가 처리된 후 스택이 비어 있어야 유효함
        return linkedList.isEmpty();
    }

}
