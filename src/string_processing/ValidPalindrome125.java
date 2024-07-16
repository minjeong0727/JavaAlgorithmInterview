package string_processing;
public static void main(){

    //package string_processing;
//import Scanner.util.*;
//public class ValidPalindrome125 {
//    public boolean isPalindrome(String s) {
//        String plaindorme = LowerCase(s);
//        //영어, 숫자 제외한 모든것 생략
//        //palindrome을 거꾸로 뒤집고 원본과 isEquals()
//        for(int i = palindrome.length ; i = 0;  i--){
//            String reversePalindrome = append(i);
//        }
//        if(palindrome.isEquals(reversePalindrome)){
//            return true;
//        }
//        else return false;
//
//    }
//
//    public static void main(String[]args){
//        Scannr sc = new Scanner(System.in);
//        String s = sc.nextToString();
//        isPlaindrome(s);
//    }
//}

    class ValidPalindrome125 {
        //1. 문자 단위로 직접 비교해서 처리
        public boolean isPalindrome1(String s){
            int start = 0;
            int end = s.length()-1;

            //서로 중앙으로 이동해 나가다 겹치는 지점에 도달하면 종료
            while(start < end){
                //영숫자인지 판별하고 유효하지 않으면 한 칸씩 이동
                if(!Character.isLetterOrDigit(s.charAt(start))){
                    start++;
                }else if(!Character.isLetterOrDigit(s.charAt(end))){
                    end--;
                }else{//유효한 문자라면 앞 글자와 뒷글자를 모두 소문자로 변경해 비교
                    if(Character.toLowerCase(s.charAt(start))!=Character.toLowerCase(s.charAt(end))){
                        //하나라도 일치하지 않는다면 펠린드롬이 아니므로 false 리턴
                        return false;
                    }
                    //앞쪽 문자는 한 칸 뒤로, 뒤쪽 문자는 한 칸 앞으로 이동
                    start++;
                    end--;
                }
            }
            //무사히 종료될 경우 펠린드롬이므로 true 리턴
            return true;
        }



        //2. 문자열 직접 비교
        public boolean isPalindrome2(String s) {
            //정규식으로 유효한 문자만 추출한 다음 모두 소문자로 변경
            String s_filtered = s.replaceAll("[^A-Za-z0-9]","").toLowerCase();
            //문자열을 뒤집은 다음 String으로 변경
            String s_reversed = new StringBuilder(s_filtered).reverse().toString();
            //두 문자열이 동일한지 비교
            return s_filtered.equals(s_reversed);
        }

}