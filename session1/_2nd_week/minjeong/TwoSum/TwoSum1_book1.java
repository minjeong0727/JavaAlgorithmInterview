package TwoSum;

public class TwoSum1_book1 {
    //브루트 포스
    public int[] twoSum(int[]nums, int target){
        //입력값 배열을 처음부터 순회
        for(int i = 0; i < nums.length; i++){
            //입력값 배열을 그다음부터 순회
            for(int j = i+1; j< nums.length; j++){
                //두 수의 핪을 비교해 target과 일치하는 경우 정답으로 리턴
                if(nums[i] + nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
}
