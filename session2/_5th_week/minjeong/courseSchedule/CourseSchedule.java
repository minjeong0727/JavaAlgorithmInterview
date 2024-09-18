package courseSchedule;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CourseSchedule {

    public boolean dfs(Map<Integer, List<Integer>>finishToTakeMap, Integer finish, List<Integer>takes, List<Integer>taken){
        //완료해야 하는 노드가 처리해야 하는 노드에 이미 포함되 있다면
        //그래프 순환 구조이므로 false 리턴
        if(takes.contains(finish))return false;

        //이미 처리하 논드라면 true 리턴
        if(taken.contains(finish))return true;

        //완료해야 하는 코스에 값이 있따면
        if (finishToTakeMap.containsKey(finish)){
            //처리해야 하는 노드에 현재 완료해야 하는 노드 츠가
            takes.add(finish);
            //처리해야하는 노드 순ㄴ회
            for(Integer take:finishToTakeMap.get(finish)){
                //재귀DFS, 탐색 결과가 false라면 false를 리턴한다.
                if(!dfs(finishToTakeMap, take, takes, taken))return false;
            }
            //탐색 후에는 처리했으므로 노드 제거
            takes.remove(finish);
            //이미 처리한 노드 추가
            taken.add(finish);
        }
        //코스에 문제가 없으므로 true 리턴
        return true;


    }


    public boolean canFinish(int numCourses, int[][]prerequisites){
        Map<Integer, List<Integer>> finishToTakeMap = new HashMap<>();
        //완료하기 위해 처리해야 하는 일정을 finish-> take형태의 그래프로 구성
        for(int[]pre:prerequisites){
            //값이 존재하지 않을 경우 빈 리스트 생성
            finishToTakeMap.putIfAbsent(pre[0], new ArrayList<>());
            //처리해야 하는 코스 추가
            finishToTakeMap.get(pre[0]).add(pre[1]);
        }


        //처리해야 하는 노드를 저장하는 변수
        List<Integer>takes = new ArrayList<>();
        //처리한 노드를 저장하는 변수
        List<Integer>taken = new ArrayList<>();
        //완료해야 하는 노드 순회
        for(Integer finish : finishToTakeMap.keySet()){
            //DFS결과가 false라면 최종 결과도 false로 리턴
            if(!dfs(finishToTakeMap, finish, takes, taken))return false;
        }
        //모든 코스에 문제가 없으므로 true 리턴
        return true;
    }
}

//
//-그래프 순환(Cycle Detection):코스를 수강할 때 순환 구조가 발생하면 무한 루프에 빠지게 되어 모든 코스를 완료할 수 없기 때문에, 이를 탐지하는것이 중요하다.
//-DFS탐색(깊이 우선 탐색):DFS를 통해 코스 간의 의존성을 탐색하고, 순환구조가 있으면 바로 종료한다.
//        numCourses = 2, **prerequisites = [[1, 0]]**일 경우:
//        1번 과목을 수강하기 위해 0번 과목을 먼저 수강해야 한다는 의미입니다.
//        finishToTakeMap은 {1: [0]}로 구성됩니다.
//        DFS를 통해 1번 과목에 대해 탐색을 시작하고, 1번 과목은 0번 과목을 선행 과목으로 필요로 하므로 0번 과목도 탐색합니다.
//        0번 과목에는 더 이상 선행 과목이 없으므로, 탐색이 종료됩니다. 순환 구조가 없기 때문에 true가 반환됩니다.
