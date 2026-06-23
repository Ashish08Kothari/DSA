class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().minDays(new int[]{1,10,3,10,2},3,1));
        System.out.println(new Solution().minDays(new int[]{1,10,3,10,2},3,2));
        System.out.println(new Solution().minDays(new int[]{7,7,7,7,12,7,7},2,3));
    }

    public int minDays(int[] bloomDay, int m, int k) {
        int s = Integer.MAX_VALUE, e = Integer.MIN_VALUE, n = bloomDay.length;

        if (m*k > n) return -1;

        for(int z : bloomDay) {
            s = Math.min(s,z);
            e = Math.max(e,z);
        }

        while ( s <= e ) {
            int mid = s + (e-s) / 2;
            if(canMake(bloomDay,m,k,mid)) e = mid - 1;
            else s = mid + 1;
        }

        return s;
    }

    boolean canMake(int[] bloomDay, int m, int k, int days) {
        int cnt = 0, total = 0;
        for (int z : bloomDay) {
            if (z > days) cnt = 0;
            else cnt++;
            if (cnt >= k) {
                total++;
                cnt = 0;
            }
        }

        return total >= m;
    }
}

/*
    Time Complexity : O(n log m)
    Space Complexity : O(1)

    n => Number of Flowers
    m => MaxBloomDay - MinBloomDay
*/