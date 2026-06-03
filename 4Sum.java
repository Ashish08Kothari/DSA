import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public static void main(String[] args) {
        int[] arr = {2,2,2,2,2};
        System.out.println(new Solution().fourSum(arr, 8));
    }

    public List<List<Integer>> fourSum(int[] arr, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(arr);
        int n = arr.length;

        for (int i = 0; i < n-3; i++) {
            if (i > 0 && arr[i] == arr[i-1])
                continue;

            for (int j = i+1; j < n-2; j++) {
                if (j > i+1 && arr[j] == arr[j-1])
                    continue;

                int k = j+1, l = n-1;

                while (k < l) {
                    long sum = (long)arr[i] + (long)arr[j] + (long)arr[k] + (long)arr[l];

                    if (sum == target) {
                        list.add(Arrays.asList(arr[i],arr[j],arr[k],arr[l]));
                        k++;
                        l--;

                        while (k < l && arr[k] == arr[k-1])
                            k++;

                        while (k < l && arr[l] == arr[l+1])
                            l--;
                    }

                    else if (sum < target)
                        k++;

                    else
                        l--;
                }
            }
        }

        return list;
    }
}

/*
    Time Complexity: O(n^3)
    Space Complexity: O(k)
*/