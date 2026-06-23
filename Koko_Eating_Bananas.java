class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int s = 1, e = 1;
        for (int z : piles) e = Math.max(z,e);

        while (s <= e) {
            int m = s + (e-s) / 2;
            if (canSheEat(piles,h,m)) e = m-1;
            else s = m+1;
        }

        return s;
    }

    boolean canSheEat(int[] piles, int h, int k) {
        long cnt = 0;
        for (int z : piles) {
            cnt += (long) z/k;
            if (z % k != 0) cnt++;
        }

        return cnt <= h;
    }

    public static void main(String[] args) {
        System.out.print(new Solution().minEatingSpeed(new int[]{30,11,23,4,20}, 6));
    }
}

/*
    Time Compllexity : O(n log m)
    Space Complexity : O(1)

    n => Number of elements
    m => Maximum element 
*/