# Key Point

현재의 인덱스를 계속 스택에 쌓아두다가 , 이전보다 상승하는 지점에서 현재 온도와 스택에 쌓아둔 인덱스 지점의 온도 차이를 비교해서,\
더 높다면 다음과 같이 스택의 값을 pop()으로 꺼내고,\
현재 인덱스와 스택에 쌓아둔 인덱스의 차이점을 정답으로 업데이트 한다. 그리고 현재 인덱서를 다시 스택에 삽입한다.

```java
while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]){
    int last = stack.pop();
    result[last] = i- last;
        }
    stack.push(i);    
```