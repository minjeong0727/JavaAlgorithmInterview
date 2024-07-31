처음에 구상한 코드가 있었는데 깃 조작이익숙치 않아 실수로 날아가 버렸다....

처음 구상한 코드는 배열처럼 인덱스를 통해 접근하는 방법이었는데 암튼 결과적으로는 잘못된 코드였다.

링크드리스트와 배열은 엄연히 다른것으로 리스트는 큐와 데크를 통해 보통 사입과 추출 모두 양방향출입이 가능하다.

### 스택을 이용해 풀어보자
```java
public boolean isPalindrome(ListNode head){
    Stack<Integer> stack = new Stack<>();
    //연결리스트를 스택에 삽입
    ListNode node = head;
    while(node != null){
        stack.add(node.val);
        node = node.next;
        
    }
    //연결리스트가 모두 빌때까지 비교
    while(head != nul){
        //연결 리스트와 스택에서 추출한 값을 비교해 펠린드롬 판별
        if(head.val != stack.pop()){
            return false;
            
        }
        head = head.next;
    }
    return true;
}
```

### 데크를 이용해보자
```java
public boolean isPalindorome(ListNode head){
    Deque <Integer>deque = new LinkedList<>();
    //연결 리스트를 데크에 삽입
    ListNode node = head;
    while(node != null){
        deque.add(node.val);
        node = node.next;
    }
    //데크가 모두 비거나(짝수 개일때)1개 이하 (홀수 개일때) 가 될때까지 비교
    while(!deque.isEmpty() && deque.size()>1){
        //데크의 양 끝을 추출해 펠린드롬 여부 확인
        if(deque.pollFirst()!= deque.pollLast()){
            return false;
        }
    }
    return true;
}

```