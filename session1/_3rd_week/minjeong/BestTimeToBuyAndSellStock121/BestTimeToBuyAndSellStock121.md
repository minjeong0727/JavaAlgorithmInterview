```java
public int maxProfit(int[]prices){
    //최대 이익은 0, 저점은 임시로 첫 번째 값으로 지정
    int maxProfit = 0, minPrice=prices[0];
    //현재 갑을 우측으로 차례대로 이동하면서 계산
    for(int price:prices){
        //지금까지의 저점 계산
        minPrice = Math.min(minPrice, price);
        //현재 값과 저점의 차이가 최대 이익인 경우 교체한다.
        maxProfit = Math.max(maxProfit, price-minPrice);
    }
    return maxProfit;
}

```

본래의 코드는 완전 탐색을 사용하여 계속 사고팔고를 반복하는 O(N2)이었지만 , 타임아웃이 이뤄진다.
하지만 책에 나온대로 코드를 작성해보면 이전 상태의 저점을 기준으로 가격차이를 계속 계산하고, 
현재 값과 저점의 차이가 최대이익인 경우 교체해 나간다면 O(n)의 시간 복잡도를 가지게 된다.