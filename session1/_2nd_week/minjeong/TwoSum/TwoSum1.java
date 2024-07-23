package TwoSum;

import java.util.HashMap;
import java.util.Map;

public class TwoSum1 {
  public int[] twoSum(int[]nums, int target){
      //값을 키로, 인덱스를 값으로 하는 해시맵 생성
      Map<Integer,Integer>map = new HashMap<>();
      for(int i = 0; i < nums.length; i++){
          //현재 값과 타겟의 차이를 계싼
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
