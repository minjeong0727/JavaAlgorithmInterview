package week3.MergeTwoSortedLists;

public class MergeTwoSortedLists21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2){
        //두 노드 중 한쪽이 null이면 null이 아닌 노드를 리턴 -> list1에 더 이상 노드가 없을때까지 나머지 list2를 결과 리스트에 추가하기 위해서다.
        if(list1 == null)return list2;
        if(list2 == null) return list1;


        //l2가 더 크면 l1에 재귀 호출 결과를 엮고 l1으 ㄹ리턴
        if(list1.val < list2.val){
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
            //l1이 더 크거나 같으면 l2에 재귀 호출 결과를 엮고 l2를 리턴
        }else{
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }


    }
}
