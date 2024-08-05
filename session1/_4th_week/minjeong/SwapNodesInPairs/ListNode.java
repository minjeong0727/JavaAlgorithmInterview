package week4.SwapNodesInPairs;

public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
class SwapNodesInPairs24 {
    public ListNode swapPairs(ListNode head) {
        //스왑을 진행할 노드
        ListNode node = head;

        while (node != null && node.next != null) {
            //임시변수를 이용해 값인 교환
            //node는 value와 next데이터 주소로 이루어졌기 때문에 swap 해준다.
            int tmp;
            tmp = node.val;
            node.val = node.next.val;
            node.next.val = tmp;
            //두 칸 앞으로 이동
            node = node.next.next;

        }
        //첫 번째 노드를 정답으로 리턴
        return head;
    }
}

