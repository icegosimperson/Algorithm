import java.util.*;

class PG_43165_Bfs_R3 {
    private static class Node{
        int sum, index;
        Node(int sum, int index){
            this.sum = sum;
            this.index = index;
        }
    }
    public int solution(int[] numbers, int target) {
        int answer = 0;
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(new Node(numbers[0], 0));
        queue.add(new Node(-numbers[0], 0));
        while(!queue.isEmpty()){
            Node cur = queue.poll();
            if(cur.index==numbers.length-1){
                if(cur.sum==target){
                    answer++;
                }
                continue;
            }
            int nextIdx = cur.index + 1;
            queue.add(new Node(cur.sum + numbers[nextIdx], nextIdx));
            queue.add(new Node(cur.sum - numbers[nextIdx], nextIdx));
        }
        return answer;
    }
}