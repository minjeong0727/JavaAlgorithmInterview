
### 초기 솔루션 코드

```java
Class Solution {    
//    public ListNode reverseList(ListNode head) {        
//        ArrayList<Integer>list = new ArrayList<>(head);
//        while(iterator.hasNext){            
//            Integer element = it.next();    
//        }        for(int x :element){           
//            System.out.println(x.reverse)        }   
//    }
//


```

=> 처음에는 `Iterator`를 사용하여 역순으로 반복할 생각이었지만, \
`Iterator`는 주로 컬렉션을 순회할뿐, 역순으로 뒤집는데는 적합하지 않고, \
단순 반복문을 사용하여 연결 리스트를 역순으로 뒤집는것이 효과적으로 생각하여 방법 2를 택했다.



### 방법2: 반복구조로 뒤집기
```java

 public ListNode reverseList(ListNode head){
        ListNode prev = null, node = head;
        //노드 끝으로 이동할때까지 순회
        while(node != null){
            //현재 노드의 다음 노드 미리 지정
            ListNode next = node.next;
            //현재 노드의 다음으로 이전 노드 지정
            node.next = prev;
            //이전 노드는 현재 노드로 지정
            prev = node;
            //미리 지정했던 다음 노드를 현재 노드로 변경
        }
        //prev는 뒤집힌 연결 리스트의 첫번째 노드
        return prev;
    }

```
방법2를 택해서 풀이를 진행해보자 타임아웃이 발생하여 책에 나온 방법1을 택하게 되었다.



### 방법1: 재귀 구조로 뒤집기
```java
public class ReverseLinkedList_book1 {
    public ListNode reverseList(ListNode head) {
        return reverse(head, null);
    }

    public ListNode reverse(ListNode node, ListNode prev){
        //현재 노드인 node가 넓이면 리턴
        if(node == null)return prev;
        //현재 노드의 다음 노드 미리 지정
        ListNode next = node.next;
        //현재 노드의 다음으로 이전 노드 지정
        node.next = prev;
        //다음 노드와 현재 노드를 파라미터로 하여 재귀 호출
        return reverse(next, node);
        }
    }



```
1->2->3->4->5를 \
5->4->3->2->1로 \
바꿔야하기때문에 null을 매개변수로 추가시켜주어 prev와 next를 이용해 재귀적으로 반복한다.
```
⭐️Tip
1. 현재 노드 (`current`)를 시작노드(`head`)로 설정한다.
 - `prec`sms `null`로 시작
 -  `current`는 `head`로 시작
 
2. 반복문을 통해 리스트를 순회한다.
 - `prev`를 현재 노드로 업데이트
 - `current`를 다음 노드로 업데이트
 
3. 반복문을 종료한다.
    `prev`가 역순으로 뒤집힌 리스트의 새로운 head
```



문제 : https://leetcode.com/problems/reverse-linked-list/description/