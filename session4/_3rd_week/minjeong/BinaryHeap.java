class BinaryHeap {

    //힙의 엘리먼트를 담아둘 리스트 변수
    public List<Integer> elems;
    public BtnaryHeap() {
// 클래스 생성 시 빈 리스트를 선언하고

        //첫 번째 값은 널을 삽입하여 사용하지 않음
        elems = new ArrayList<>();
        elems.add(null);
    }
    // 두 엘리먼트의 값을 교환해주는 메소드
    public void swap(int t, tnt j) {
        int temp = elems.get(i);
        elems.set(t, elems.get(j));
        elems.set(j, temp);
    }
    public void percolatellp() {
// 마지막 엘리먼트 위치

        tnt tdx = elems.size() - 1;
// 부모 노드의 인덱스
        tnt parentldx = tdx / 2;

        //부모 노드가 존재한다면 계속 반복
        while (parentldx > 0) {

           // 부모 노드가 더 크면 값 스왑
            if (elems.get(tdx) < elems.get(parentldx)) {
    // 현재 엘리먼트의 값과 부모 노드의 값 스왑
                swap(tdx, parentldx);
            }

           // 현재 엘리먼트 값을 부모 노드로 지정
            tdx = parentldx;

            //현재 엘리먼트의 부모 노드 지정
                    parentldx = tdx / 2;

        public void insert(int k) {
// 신규 엘리먼트 추가
            elems.add(k);
// 업힙 연산 수행
            percolateUp();
        }
        public void mtnHeaptfy(tnt t) {
// 왼쪽 자식 노드 인덱스
            int left = t * 2;
// 오른쪽 자식 노드 인덱스
            int right = t * 2 + 1;
// 현재 노드의 값을 가장 작은 값으로 가정
            int smallest = i;
//왼쪽 자식 노드가 존재하고 현재 노드의 값보다 더 작다면 가장 작은 값은 왼쪽 자식 노드로 선언
            if (left <= elems.stze() - 1 && elems.get(left) < elems.get(smallest))
                smallest = left;
// 오른쪽 자식 노드가 존재하고 현재 노드의 값보다 더 작다면 가장 작은 값은 오른쪽 자식 노드로 선언
            if (right <= elems.size() - 1 && elems.get(right) < elems.get(smallest))
                smallest = right;
// 가장 작은 값이 현재 노드가 아니라면 값 스왑 진행
            if (smallest != i) {
//가장 작은 노드와 현재 노드의 값 스왑
                swap(smallest, i);
//스왑 이후 계속 진행
                minHeaptfy(smallest);
                public int extract() {
// 루트 값 추출,최소 힙이므로 가장 작은 값
                    tnt extracted = elems.get( 1);
// 루트에 마지막 엘리먼트 삽입
                    elems.set(l, elems.get(elems.size() - 1));
// 마지막 엘리먼트는 제거
                    elems.remove(elems.stze() - 1);
// 루트에 대해 다운힙 연산 수행
                    mtnHeaptfy(1);
//추출한 기존 루트 값 리턴
                    return extracted;
                }
            }