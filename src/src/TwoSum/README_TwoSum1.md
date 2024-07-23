# Two Sum

### 제출코드
```java

package TwoSum;

import java.util.HashMap;
import java.util.Map;

public class TwoSum1 {
  public int[] twoSum(int[]nums, int target){
      //값을 키로, 인덱스를 값으로 하는 해시맵 생성
      Map<Integer,Integer>map = new HashMap<>();
      for(int i = 0; i < nums.length; i++){
          //현재 값과 타겟의 차이를 계산
          int complement = target-nums[i];
          //차이가 해시맵에 존재하는지 혹인
          if(map.containsKey(complement)){
              //존재하면 현재 인덱스와 해시맵에 저장된 인덱스를 반환
              return new int[] {map.get(complement),i};
          }
          //해시맵에 현재 값과 인덱스 저장
          map.put(nums[i],i);
      }
      //만약 값을 갖지 못하면 빈 배열 반환
      return new int[]{};
  }
}


```

### 초기 구상코드
```java
class Solution {
    public int[] twoSum(int[] nums, int target) {
        //배열을 순회하면서 target값을 달성한다.
        //배열 nums
        //타겟 target
        //배열을 스캔할 포인터
        Map<Integer,Integer>firstPointer = new HashMap<>();
        Map<Integer,Integer>secondPointer = new HashMap<>(); 
        for(int i = 0; i < nums; i++){
            firstPointer.put(i,nums[i]);
            secondPointer.put(i+1, nums[i+1]);
            
            if(fistPointer.getValue() + secondPointer.getValue() 
            == target){
                return firstPointer.key && secondPointer.key;
            }else {
                secondPointer++;
                
            }
        }
    }
}


```

초기구상코드는 말이 되지않는 코드지만
원래 나는 초기구상코드는 간단하게 뭐가 필요한지 생각하고\
간단한 흐름,변수들만 간단히 적은다음\
일단 그 즉시 생각나는 방법을 문법에 구애받거나 맞고틀림에 상관없이 그냥 쓰고 고쳐나간다

이번 초기구상코드에서는 배열을순회하고 합하여 target값을 구하는것이기 때문에
투포인터방법과 맵이 생각나서 사용했지만 문제에 부딪혔고(2개의 map으로 복잡)
책을 참고했다.

#### ➡️책에서 참고된 부분은 내가 당연하다고 생각했던 <key,value>를 역으로 <value,key>이런 방식으로 저장한것
    
->그런데 이 방식에 대해서는 만약에 test가 같은 value가나오면 어떡할지 궁금하다...테스트케이스에서 이런 상황은 고려하지않으니 상관이없을까?

#### ➡️ target-nums[i] 를 통하여 map.containsKey()를 사용해서 해결법을 구하는 방법

저번주에 set과 map에 대해 분명 정리했는데 그 함수를 사용해야지하고 바로바로 생각이 나오지않은것같아서 좀 아쉽다.
