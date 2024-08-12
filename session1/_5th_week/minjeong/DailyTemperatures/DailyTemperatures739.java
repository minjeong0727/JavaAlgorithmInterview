package DailyTemperatures;
import java.util.Deque;
import java.util.ArrayDeque;
public class DailyTemperatures739 {



        public int[] dailyTemperatures(int[] temperatures) {
            // 매일의 온도 리스트(temperatures)를 입력받아서, 더 따뜻한 날씨를 위해서는 며칠을 더 기다려야 하는지 출력하는 함수
            // 결과를 담을 정수 배열 선언
            //`result`배열은 최종적으로 각 날에 대ㅐㅎ 더 따뜻한 날까지의 일수를 저자앟ㄹ 배열이다.
            //처음엔 모두 0으로 초기화된다.
            int[] result = new int[temperatures.length];
            //`stack`은 현재까지 처리한 날들 중, 아직 더 따뜻한 날을 찾지 못한 날둘의 인덱스를 저장한다, 여기서 Deque는 스택의 역할을 한다.
            Deque<Integer> stack = new ArrayDeque<>();
            //`temperatures'배열의 각 날을 순회하며, 그 날의 온도가 더 따뜻한지 확인한다.
            for (int i = 0; i < temperatures.length; i++) {
                // 현재 날(i의 온도가 스택의 맨 위에 있는 날(가장 마지막으로 저장된 날)의 온도보다 높은지를 확인한다. 만약 현재 온도가 더 높다면, 그 날('last')은 현재 날('i')에 더 따뜻한 날을 찾은 것이다. 그래서 i-last를 result[last]에 저장한다.
                while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                    int last = stack.pop();
                    // 결과 업데이트
                    result[last] = i - last;
                }
                stack.push(i);
            }

            return result;
        }


}
