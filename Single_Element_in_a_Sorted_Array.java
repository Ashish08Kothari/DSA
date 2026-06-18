class Solution {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3,4,4,8,8};
        System.out.println(new Solution().singleNonDuplicate(arr));
    }

    public int singleNonDuplicate(int[] nums) {
        int l = 0,h = nums.length - 1;
        while(l < h){
            int mid = (h - l) / 2 + l;
            if((mid > 0 && nums[mid] == nums[mid - 1])){
                if((mid + 1) % 2 == 1){
                    h = mid - 2;
                }
                else{
                    l = mid + 1;
                } 
            }
            else{
                if((mid) % 2 == 1){
                    h = mid - 1;
                }
                else{
                    l = mid;
                }
            }
        }
        return nums[l];
    }
}

/*
    Time Complexity : O(log n)
    Space Complexity : O(1)
*/