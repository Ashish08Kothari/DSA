class Solution{
    public static void main(String[] args) {
        int[] arr = {8, 2, 4, 5, 3, 7, 1};
        System.out.println(new Solution().missingNum(arr));
    }

    int missingNum(int[] arr) {
        long sum = 0, total = 0;
        int n = arr.length + 1;
        total = (long)n * (n+1) / 2;
        for(int z : arr)
            sum += z;

        return (int)(total - sum);
    }
}

/*
    Time Complexity: O(n)
    Space Complexity: O(1)
*/