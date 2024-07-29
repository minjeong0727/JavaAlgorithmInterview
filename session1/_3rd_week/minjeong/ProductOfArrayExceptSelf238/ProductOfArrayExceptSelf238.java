package week3.ProductOfArrayExceptSelf238;

public class ProductOfArrayExceptSelf238 {
    public int[] productExceptSelf(int[] nums){
        int[]result = new int[nums.length];
        //왼쪽 곱셈
        int p = 1;
        for(int i = 0; i < nums.length; i++){
            result[i] = p;
            p*=nums[i];
        }
        p = 1;
        for(int i = nums.length-1; i >= 0; i--){
            result[i] *= p;
            p*= nums[i];

        }
        return result;
    }
}
