import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[] arr = {3,1,-2,-5,2,-4};
        System.out.println(Arrays.toString(new Solution().rearrangeArray(arr)));
    }

    public int[] rearrangeArray(int[] arr) {
        int[] result = new int[arr.length];
        int pos = 0, neg = 1;

        for(int z : arr) {
            if(z >= 0) {
                result[pos] = z;
                pos += 2;
            }

            else {
                result[neg] = z;
                neg += 2;
            }
        }

        return result;
    }
}

/*
    Time complexity: O(n)
    Space Complexity: O(n)
*/