package combinations77;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Combinations77 {
    public void dfs(List<List<Integer>>results, LinkedList<Integer>elements, int n, int start, int k){
        //k번째 노드에 도달하며 ㄴ결과에 추가
        if(k ==0){
            //자바 8+의 스트림을 이용해 elements의 내용을 결과에 삽입
            results.add(elements.stream().collect(Collectors.toList()));
            return;
        }
        // 현재 엘리먼트 이후 엘리먼트 탐색
        for(int i = start; i <= n; i++){
            //전달받은 엘리먼트에 더해 현재 엘리먼트 추가
            elements.add(i);
            //재귀DFS
            dfs(results,elements, n, i+1, k-1);
            //돌아온 이후에는 현재 엘리먼트 삭제
            elements.removeLast();
        }
    }
    public List<List<Integer>>combine(int n, int k){
        //결과 저장 리스트 선언
        List<List<Integer>>results = new ArrayList<>();
        //DFS시작
        dfs(results, new LinkedList<>(), n, 1, k);
        return results;
    }
}
/*
-Stream은 컬렉션 등의 데이터를 처리하는 강력한 도구로, 데이터를 필터링하고 변환하는 작업을 함수형 프로그래밍 스타릴로 수행할 수 있게 해준다.
-Stream의 연산은 중간 연산(필터링, 변환 등)과 최종 연산(집계, 수집 등)으로 나뉘며, 중간 연산은 지연 실행된다.
-Stream을 사용하면 코드의 가독성이 높아지고, 대량의 데이터를 효과적으로 처리할 수 있다.

- 중간연산: 스트림을 변환하는 작업이다. 이 연산들은 지연 실행되며, 최종 연산이 호출될 때 실행된다. 중간 연산은 새로운 스트림을 반환한다.
Stream<String>filteredStream = stream.filter(s->!s.isEmpty());
예)filter(), map(), sorted()
- 최종연산 : 스트림의 데이터를 처리하여 결과를 반환하는 연산이다.
최종 연산을 호출하면 스트림이 닫히며 더 이상 사용할 수 없다.
예)collect(), forEach(), reduce()

 */