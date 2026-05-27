class Solution {
    public static void main(String[] args) {
        int[] arr = new int[]{2,2,2,2};
        System.out.println(new Solution().check(arr));
    }

    public boolean check(int[] arr) {
        int n = arr.length, cnt = 0;
        for(int i = 0; i < n; i++) {
            if(arr[i] > arr[(i+1) % n])
                cnt++;
            
            if(cnt > 1)
                return false;
        }

        return true;
    }
}


/*
    Time Complexity: O(n)
    Space Complexity: O(1)
*/