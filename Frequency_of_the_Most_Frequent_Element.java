import java.util.Arrays;

class Solution{
    public static void main(String[] args) {
        int[] arr = new int[]{1,4,8,13};
        System.out.println(new Solution().maxFrequency(arr, 5));
    }

    public int maxFrequency(int[] arr, int k) {
        Arrays.sort(arr);
        int left = 0, right = 0;
        long total = 0, res = 0;
        while(right < arr.length){
            total += arr[right];
            while(arr[right] * (right-left+1l) > total+k){
                total -= arr[left++];
            }

            res = Math.max(res, right-left+1l);
            right++;
        }

        return (int)res;
    }
}

/*
    Time Complexity: O(n + n log n)
    Space Complexity: O(log n)
*/