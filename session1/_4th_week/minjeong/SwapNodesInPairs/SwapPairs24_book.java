package week4.SwapNodesInPairs;

public class SwapPairs24_book {
    public ListNode swapPairs(ListNode head){
        if(head!= null && head.next != null){
            //다음의 노드를 선언한다.
            ListNode p = head.next;
            //다음다음 노드를 파라미터로 전달하고 스왑된 값을 리턴받는다.
            head.next = swapPairs(head.next.next);
            //다음다음 노드는 현재 노드로 지정
            p.next = head;
            //다음 노드 리턴
            return p;
        }
        return head;
    }
}
// https://leetcode.com/problems/swap-nodes-in-pairs/
//1-2-3-4-5-6
//-->
// <-
//    -->
//    <-
//        -->
//        <-
//반복적으로 풀이하는 방법이 있던데 내 기준에서는 이 방법이 훨씬 깔끔하고 효율적으로 보여 책에 있는 모범답안 중 이 방법을 택했다.
//포인터 역할을 하는 P -> P는 head.next가 되고, p.next는 head가 된다.
//내가 직전에 풀이했던 코드보다 더 깔끔하고 유용해보인다.