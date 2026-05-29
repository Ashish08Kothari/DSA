class Solution {
    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2};
        System.out.println(new Solution().majorityElement(arr));
    }

    public int majorityElement(int[] arr) {
        int candidate = 0, cnt = 0;
        for(int z : arr) {
            if(cnt == 0)
                candidate = z;

            if(candidate == z)
                cnt++;

            else
                cnt--;
        }

        return candidate;
    }
}


/*
    Time Complexity: O(n)
    Space Complexity: O(1)

    Boyer–Moore majority vote algorithm
*/