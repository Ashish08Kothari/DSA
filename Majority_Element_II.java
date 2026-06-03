import java.util.ArrayList;
import java.util.List;

class Solution {
    public static void main(String[] args) {
        int[] arr = {1};
        System.out.println(new Solution().majorityElement(arr));
    }

    public List<Integer> majorityElement(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int candidate1 = 0, candidate2 = 0, cnt1 = 0, cnt2 = 0, n = arr.length;

        for (int num : arr) {
            if (num == candidate1)
                cnt1++;
            else if (num == candidate2)
                cnt2++;
            else if (cnt1 == 0) {
                candidate1 = num;
                cnt1 = 1;
            }
            else if (cnt2 == 0) {
                candidate2 = num;
                cnt2 = 1;
            }
            else {
                cnt1--;
                cnt2--;
            }
        }

        cnt1 = 0;
        cnt2 = 0;

        for (int num : arr) {
            if (num == candidate1) cnt1++;
            else if (num == candidate2) cnt2++;
        }

        if (cnt1 > n / 3) list.add(candidate1);
        if (cnt2 > n / 3) list.add(candidate2);

        return list;
    }
}

/*
    Time Complexity: O(n)
    Space Complexity: O(1)
*/