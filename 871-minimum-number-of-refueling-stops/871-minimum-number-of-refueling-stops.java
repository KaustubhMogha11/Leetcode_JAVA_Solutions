class Solution {
    public int minRefuelStops(int target, int startFuel, int[][] stations) {
        PriorityQueue<Integer> fuelInStation = new PriorityQueue<>((x, y) -> (y - x));
        
        int res = 0;
        int fuel = startFuel;
        
        for (int[] station : stations) {
            while (fuel < station[0]) {
                if (fuelInStation.isEmpty()) return -1;
                fuel += fuelInStation.poll();
                res++;
            }
            fuelInStation.offer(station[1]);
        }
        
        while (fuel < target) {
            if (fuelInStation.isEmpty()) return -1;
            fuel += fuelInStation.poll();
            res++;
        }
        
        return res;
    }
}