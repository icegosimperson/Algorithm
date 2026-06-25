// 933 - ping(t) 호출마다 t 추가, queue 앞에서 t-3000 미만인 거 while로 poll, size 반환
class 933_Number of Recent Calls {
    ArrayDeque<Integer> queue;
    public RecentCounter() {
        queue = new ArrayDeque<>();
    }

    public int ping(int t) {
        queue.add(t);
        while(!queue.isEmpty() && queue.peek()<t-3000){
            queue.poll();
        }
        return queue.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */