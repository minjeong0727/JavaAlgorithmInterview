```java
class Solution {
    public String removeDuplicateLetters(String s) {
    //중복된 문자를 제오하고 사전식 순서로 나열하라...
    HashSet<Character>set = new HashSet<>();
    for(Character c : s.toCharArray()){
    set.add(c);
    }
    StringBuilder  result = new StringBuilder();
    for(Character c: set){
    
        result.append(c);
           }
    return result.toString();
        }
}
```

``test1은 통과되었는데 test2는 통과되지않았다. 
사실 중복된 문자르 제외하고 사전식 순서로 나열하라는데  abcd가 아닌 acdb인게 책을 보기전까지 이해가 잘 가지 않았다.``

```java
package RemoveDuplicateLetters316;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicateLetters316_RecursionBook {

    public Set<Character> toSortedSet(String s) {
        // 문자열을 문자 단위 집합으로 저장할 수 있는 변수 선언
        Set<Character> set = new TreeSet<>(new Comparator<Character>() {
            // 비교 메소드 재정의
            @Override
            public int compare(Character o1, Character o2) {
                // 동일한 문자이면 무시
                if (o1 == o2) return 0;
                    // 새로운 문자(o1)가 기본 문자(o2)보다 크면 뒤에 위치
                else if (o1 > o2) return 1;
                    // 작으면 앞에 위치
                else return -1;
            }
        });

        // 문자열을 문자 단위로 집합에 저장, 정렬된 상태로 저장한다.
        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }

        return set;
    }

    public String removeDuplicateLetters(String s) {
        if (s.isEmpty()) {
            return ""; // Base case: If the string is empty, return an empty string.
        }

        for (char c : toSortedSet(s)) {
            // 해당 문자가 포함된 위치부터 접미사로 지정
            String suffix = s.substring(s.indexOf(c));
            // 전체 집합과 접미사 집합이 일치하면 해당 문자 정답에 추가하고 재귀 호출 진행
            if (toSortedSet(s).equals(toSortedSet(suffix))) {
                return c + removeDuplicateLetters(suffix.replace(String.valueOf(c), ""));
            }
        }

        return ""; // Return an empty string if the loop doesn't find any match
    }

    public static void main(String[] args) {
        RemoveDuplicateLetters316_RecursionBook obj = new RemoveDuplicateLetters316_RecursionBook();
        System.out.println(obj.removeDuplicateLetters("cbacdcbc")); // Output should be "acdb"
    }
}

```
#### toSortedSet
문자열을 문자 단위로 분리하여   `TreeSet`에 저장한다.\
`TreeSet`은 자동을 오름차순을 정렬하기 때문에,\
이를 통해 중복없는 문자를 정렬된 상태로 얻을 수 있다.

`Comparator`를 사용하여 두 문자를 비교하고, 새로운 문자가 기존 문자보다 크면 뒤에, 작으면 앞에 배치한다.


#### removeDuplicateLetters 
재귀적으로 문자열을 처리하며, 면재 문자가 포함된 위치부터 접미사를 만들어\
그 접미사에 중복된 문자가 없다면 그 문자를 결과 문자열에 추가한다.