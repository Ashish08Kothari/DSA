class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().shipWithinDays(new int[]{3,2,2,4,1,4}, 3));
    }

    public int shipWithinDays(int[] weights, int days) {
        int s = 1, e = 0;
        for (int z : weights) {
            s = Math.max(s,z);
            e += z;
        }

        while (s <= e) {
            int m = s + (e-s) / 2;
            if(canShip(weights,days,m)) e = m-1;
            else s = m+1;
        }

        return s;
    }

    boolean canShip(int[] weights, int days, int capacity) {
        int totalDays = 1, temp = capacity;
        for (int z : weights) {
            if (z <= capacity) capacity -= z;
            else {
                totalDays++;
                capacity = temp - z;
            }
        }

        return totalDays <= days;
    }
}

/*
    Time Complexity : O(n log m)
    Space Complexity : O(1)
*/