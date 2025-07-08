class Solution {
    public int maxEvents(int[][] events) {
        Arrays.sort(events, (event1, event2) -> Integer.compare(event1[0], event2[0])); 
        
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(); 
        int totalEventsAttended = 0;
        int currentDay = 0;
        int eventIndex = 0;
        int totalEvents = events.length;
        
        while (!minHeap.isEmpty() || eventIndex < totalEvents) {
            if (minHeap.isEmpty()) {
                currentDay = events[eventIndex][0];
            }
            while (eventIndex < totalEvents && events[eventIndex][0] <= currentDay) {
                minHeap.offer(events[eventIndex][1]);
                eventIndex++;
            }
            minHeap.poll();
            totalEventsAttended++;
            currentDay++;
            while (!minHeap.isEmpty() && minHeap.peek() < currentDay) {
                minHeap.poll();
            }
        }
        
        return totalEventsAttended;
    }
}
