class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().minMaxDist(new int[]{1, 2, 3, 4, 5}, 2));
    }

    public double minMaxDist(int[] stations, int K) {
        double s = 0, e = 0;
        for(int i = 0; i < stations.length-1; i++)
            e = Math.max(e,stations[i+1] - stations[i]);
        
        while(e-s > 1e-6) {
            double mid = s + ( e - s ) / 2.0;
            if(helper(stations,K,mid))
                e = mid;
            else
                s = mid;
        }
        
        return e;
    }
    
    boolean helper(int[] a, int k, double dis) {
        int cnt = 0;
        
        for(int i = 0; i < a.length-1; i++){
            int diff = a[i+1] - a[i];
            cnt += (int)diff/dis;
        }
        return cnt <= k;
    }
}

/*
    Time Complexity : O(n log n)
    Space Complexity : O(1)
*/