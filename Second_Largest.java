class Solution{

    public int getSecondLargest(int[] arr) {
        int l = Integer.MIN_VALUE, sl = Integer.MIN_VALUE;
        for(int z : arr) {
            if(z > l) {
                sl = l;
                l = z;
            }

            else if (z < l && z > sl) {
                sl = z;
            }
        }

        return sl != Integer.MIN_VALUE ? sl : -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{10, 10, 10};
        System.out.println(new Solution().getSecondLargest(arr));
    }
}


/*
    Time Complexity: O(n)
    Space Complexity: O(1)
*/