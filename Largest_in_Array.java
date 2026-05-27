class Solution{
    public static void main(String[] args) {
        int[] arr = new int[]{-100,-99,-2,-1,0};
        System.out.println(Solution.largest(arr));
    }

    public static int largest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        for(int z : arr)
            largest = Math.max(largest,z);

        return largest;
    }
}


/*
    Time complexity: O(n)
    Space Complexity: O(1)
*/