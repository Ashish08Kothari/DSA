import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public static void main(String[] args) {
        int arr[] = {-1,0,1,2,-1,-4};
        System.out.println(new Solution().threeSum(arr));
    }

    public List<List<Integer>> threeSum(int[] arr) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(arr);
        int n = arr.length;

        for (int i = 0; i < n-2; i++) {
            if (i > 0 && arr[i] == arr[i-1])
                continue;

            int j = i+1, k = n-1;
            while (j < k) {
                int num1 = arr[i], num2 = arr[j], num3 = arr[k];
                int sum = num1 + num2 + num3;

                if (sum == 0) {
                    list.add(Arrays.asList(num1, num2, num3));
                    j++;
                    k--;

                    while (j < k && arr[j] == arr[j-1])
                        j++;

                    while (j < k && arr[k] == arr[k+1])
                        k--;
                }

                else if (sum > 0)
                    k--;
                
                else
                    j++;
            }
        }
        return list;
    }
}


/*
    Time Complexity: O(n^2)
    Space Complexity: O(k)
*/