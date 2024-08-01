# 노드는 뭘로 이루어져있을까?
각 노드는 데이터와 다음 노드를 가리키는 포인터(참조)로 구성된다.

## 단일 연결리스트 (Singly Linked List)
```java
public class ListNode{
    int val;    //노드가 저장하는 데이터 (값)
    ListNode next;  // 다음 노드를 가리키는 참조(포인터)
    
    //기본 생성자
    publiv ListNode(){}
    
    //값만 초기화하는 생성자
    public ListNode(int val){
        this.val = val;
    }
    
    //값과 다음 노드를 초기화하는 생성자
    public ListNode(int val, ListNode next){
        this.val = val;
        this.next = next;
    }
}

```

### 노드 생성
```java
public static void main(Stirng[] args){
    //노드 생성
    ListNode node1 = new ListNode(1);
    ListNode node2 = new ListNode(2);
    ListNode node3 = new ListNode(3);
    
    //노드 연결
    node1.next = node2;
    node2.next = node3;
    
    //리스트: 1->2->3
}


```

### 리스트 순회
```java
public static vodi main(String[]args){
    //노드 생성
    ListNode node1 = new ListNode(1);
    ListNode node2 = new ListNode(2);
    ListNode node3 = new ListNode(3);

    //노드 연결
    node1.next = node2;
    node2.next = node3;
    
    //리스트 순회
    ListNode current = node1;
    while(current != null){
        System.out.println(current.val + " ");
        current = current.next;
    }
   // 출력: 1 2 3 
}


```

---
## 연결리스트(Dobuly Linked List)
이중 연결리스트에서는 각 노드가 다음 노드뿐만 아니라 이전 노드에 대핸 참조도 가진다.

```java
public class DoublyLitNode{
    int val;
    DoublyListNode next;
    DoublyListNode prev;
    
    public DoublyListNode(){}
    public DoublyListNode(int val){
        this.val;
    }
    public DoublyListNode(int val, DoublyListNode next, DoublyListNode prev){
        this.val = val;
         this.next = next;
         this.prev= prev;
    }
}

```

### 노드 생성 및 연결
```java

 public static void main(String[] args) {
        // 노드 생성
        DoublyListNode node1 = new DoublyListNode(1);
        DoublyListNode node2 = new DoublyListNode(2);
        DoublyListNode node3 = new DoublyListNode(3);

        // 노드 연결 (양방향)
        node1.next = node2;
        node2.prev = node1;
        node2.next = node3;
        node3.prev = node2;

        // 리스트: 1 <-> 2 <-> 3
    }
```

### 리스트 순회
```java
public static void main(Stringp[]args){
    //노드 생성 및 연결(위의 예제 참고)
    DoublyListNode node1 = new DoublyLisNode(1);
    DoublyListNode node2 = new DoublyListNode(2);
    DoublyListNode node3 = new DoublyListNode(3);
    
    node1.next = node2;
    node2.prev = node1;
    node2.next = node3;
    node3.prev = node2;
    
    //리스트 순회(앞에서 뒤로)
    DoublyListNode current = node1;
    while(current != null){
        System.out.print(current.val + " ");
        current = current.next;
    }
    //출력: 1 2 3
    //리스트 순회(뒤에서 앞으로
    current = node3;
    while(current != null){
        System.out.print(current.val + " ");
        current = current.prev;
    }
    //출력:3 2 1 
}
```