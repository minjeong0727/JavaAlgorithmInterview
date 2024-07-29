```java
int[]result = new int[nums.length];
int p = 1;
for(int i = 0; i < nums.length; i++){
    resul[i] = p;
    p*=nums[i];
}
```
nums=[1,2,3,4]일 시 
- i = 0 : `resut[0]=1`(초기값)
- i = 1 : `result[1]=1`(1의 곱)
- i = 2 : `result[2]=2`(1*2)
- i = 3 : `result[3]=6`(1*2*3)

'result'배열은  `[1,1,2,6]`이 된다.

이제 각 요소의 오른쪽에 있는 모든 요소들의 곱을 계산하고, 이를 왼쪽 곱과 곱하여 최종 결과를 업데이트한다.
```java
p = 1;
for (int i = nums.length - 1; i >= 0; i--) {
    result[i] *= p;
    p *= nums[i];
}


```
- result[3] *= 1 : result[3] = 6 (오른쪽에 요소가 없음)
- result[2] *= 4 : result[2] = 8 (2 * 4)
- result[1] *= 12 : result[1] = 12 (1 * 12)
- result[0] *= 24 : result[0] = 24 (1 * 24)


만약 왼쪽 또는 오른족 하나만 계산한다면, 자신을 제외한 나머지 요소들의 값은 완전히 계산할 수 없다.

