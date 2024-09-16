package ReconstructItinerary;

import java.util.*;

public class RecursionDfs {
    public void dfs(List<String>results, Map<String, PriorityQueue<String>>fromToMap, String from){
        //from -> to 값이 존재하는 경우 반복해서 재귀 DFS
        while(fromToMap.containsKey(from)&& ! fromToMap.get(from).isEmpty()){
            //사전 어휘순 첫 위치부터 우선수누이 큐를 이용해 추출 및 재귀 DFS진행
            dfs(results, fromToMap, fromToMap.get(from).poll());
        }
        //재귀 DFS가 모두 끝났다면 최종 위치는 도착지이므로 결과를 출발지 앞으로 삽입한다.
        results.add(0, from);
    }


    public List<String> findItinerary(List<List<String>> tickets) {
        List<String>results = new LinkedList<>();
        Map<String, PriorityQueue<String>> fromToMap = new HashMap<>();

        //여행 일정을 from -> to형태의 그래프로 구성
        for(List<String>ticket:tickets){
            //값이 존재하지 않을 경우 빈 우선순위 큐 생성
            fromToMap.putIfAbsent(ticket.get(0),new PriorityQueue<>());
            //목적지 to추가, 우선순위 큐이므로 to는 항상 사전 어휘순으로 정렬된다.
            fromToMap.get(ticket.get(0)).add(ticket.get(1));
        }
        //재귀dfs시작
        dfs(results, fromToMap, "JFK");
        return results;
    }
}
//
//
// 그래프의 구성
//        - 어휘순으로 방문해야 하기 때문에 그래프를 구성할때 우선순위 큐를 사용, 입력값이 무작위로 들어온다고 해도 사전순으로 계속 정렬
//        - 우선 순위 큐이므로 한 번 꺼낸 경로는 사라져 재방문하지 않을 것이며, 어떤 경우든 여행 일정은 도착지까지 이어질 것이므로 이대로 탐색하다 보면 도착지에 무사히 도달할 것이다.
//
//-여행결로 결과 저장법
//    - 결과변수 results에 add()를 할 때 인덱스 0을 지정해 맨 앞에 값을 삽입하느 ㄴ것이다.
//        즉, DFS를 모두 진행하고 되돌아왔을ㄸ ㅐ해당 위치를 결과에 삽입하게 되며 가장먼저 삽입하게 될 위치는 최종 위치인 도착지이므로, 출발지까지 결과를 차례대로 앞으로 삽입하게 된다.
//        LinkedList사용