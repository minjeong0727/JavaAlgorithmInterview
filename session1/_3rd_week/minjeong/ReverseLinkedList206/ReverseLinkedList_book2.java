package ReverseLinkedList;

public class ReverseLinkedList_book2 {

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


}
