```java

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        //배열을 탐색한다.
        //홀수인링크와 짝수인 링크 둘로 나눈후
        //이어붙인다.
        Iterator it = new Iterator();
        while(head.it.hasNext){
            if(head.it%2 == 1){
                ListNode l1 = head.it.next;
            }else l2 = head.it.next;

        }
        if(l1.next = null){
            ListNode list = (l1.next.next).add(l2);
        }
        return list;
    }
}
```
초기에는 이런식으로 코드를 작성했지만 문제가 있었다.
### 1. 잘못된 Iterator 사용
`ListNode`는 단일 연ㄹ결 리스트의 노드를 나타내는 클래스다.\
연결리스트에서 노드를 탐색하거나 조작할때는 주로 직접 푄터(참조)를 이동하면서 작업한다.\
그러나 `Iterator`는 주로 컬렉션이나 배열과 같은 데이터 구조에서 요소를 순차적으로 접근하는데 사용되는 인터페이스이기 때문에 Iterator를 사용할 필요는 없다.
