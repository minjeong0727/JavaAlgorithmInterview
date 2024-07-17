package string_processing;

public class ReverseString344 {
    public void reverseString(char[] s) {
        int start = 0;
        int end = s.length-1;

        //서로 중앙으로 이동해 나가다 겹치는 지점에 도달하면 종료
        while(start < end){
            //임시 변수를 이용해 값 스왑
            char tmp = s[start];
            s[start] = s[end];
            s[end] = tmp;
            //앞쪽 문자는 한 칸 뒤로, 뒤쪽 문자는 한 칸 앞으로 이동
            start++;
            end--;
        }
    }
//    public void reverseString1(char[] s) {
//        //char[] s 배열을 받는다
//        //배열에서 하나씩 꺼내온다.
//        //스트링빌더를 통해 문자열로만든다.
//        //뒤집는다.
//        //다시 char 배열로 변환한다.
//        StringBuilder sb = new StringBuilder();
//        String str;
//        for (int i = 0; i < s.length; i++) {
//            str = sb.append(s);
//        }
//        String reverseStr = str.reverse();
//        char ch;
//        for (int i = 0; i < reverseStr.length; i++) {
//            ch = charAt(i);
//            s.append(ch);
//        }
//        return s;
//    }

        public void reverseString2(char[] s) {
        StringBuilder sb = new StringBuilder();
        //배열의 각 원소를 StringBuilder에 추가
        for(char c: s){
            sb.append(c);
        }
        //StringBuilder를 뒤집음
        sb.reverse();
        //뒤지힌 StringBuilder로부터 다시 배열 S를 업데이트
        for(int i = 0; i < s.length; i++){
            s[i] = sb.charAt(i);
        }
    }



}
