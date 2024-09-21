package maximumDepthOfBinaryTree;

import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {
        val = x;
    }
}

public class Main {
    public int maxDepth(TreeNode root) {
        // 예외 처리
        if (root == null) return 0;

        // BFS 진행을 위한 큐 선언
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root); // root부터 큐에 삽입
        int depth = 0; // 깊이 변수 선언

        // 큐가 비워질 때까지 반복
        while (!queue.isEmpty()) {
            depth += 1; // 반복할 때마다 깊이 +1
            int q_size = queue.size(); // 큐 크기 계산

            for (int i = 0; i < q_size; i++) {
                TreeNode cur = queue.poll(); // 가장 왼쪽 노드 추출

                if (cur.left != null) queue.add(cur.left); // 왼쪽 자식 노드
                if (cur.right != null) queue.add(cur.right); // 오른쪽 자식 노드
            }
        }
        return depth;
    }

    public static void main(String[] args) {
        // 트리 생성 및 테스트
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        Main solution = new Main();
        int depth = solution.maxDepth(root);
        System.out.println("Maximum depth of the binary tree: " + depth);
    }
}


//
//재귀 구조 사용해보기
//public int maxDepth(TreeNode root){
//    if(root == null)return 0;
//    //왼쪽 노드의 깊이만큼 +1처리된 값이 리턴된다
//    int left = maxDepth(root.left);
//    //오른쪽 노드의 깊이만큼 +1처리된 값이 리터노딘다
//    int right = maxDepth(root.right);
//    //왼쪽/오른쪽 노드 중 큰 값에 +1하여 리턴
//    return Math.max(left,right)+1;
//}