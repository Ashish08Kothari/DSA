class Solution{
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6};
        new Solution().reverseArray(arr);
        for(int z : arr)
            System.out.print(z+" ");
    }

    public void reverseArray(int[] arr){
        helper(arr,0,arr.length-1);
    }

    void helper(int[] arr, int left, int right){
        if(left >= right) return;
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        helper(arr, left+1, right-1);
    }
}

/*
    Time Complexity: O(n)
    Space Complexity: O(n)
*/