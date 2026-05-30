import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> findSubarray(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int fs = -1, fe = -1, s = 0, e = 0, sum = 0, max_sum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >= 0) {
                sum += arr[i];
                e = i;

                if(sum > max_sum) {
                    max_sum = sum;
                    fs = s;
                    fe = e;
                }

                else if(sum == max_sum) {
                    if(e - s > fe - fs) {
                        fe = e;
                        fs = s;
                    }
                }
            }

            else {
                s = i+1;
                e = i+1;
                sum = 0;
            }
        }

        if(max_sum < 0) {
            list.add(-1);
            return list;
        }

        for (int i = fs; i <= fe; i++)
            list.add(arr[i]);

        return list;
    }

    public static void main(String[] args) {
        int[] arr = {-1,-2,-3,0};
        System.out.println(new Solution().findSubarray(arr));
    }
}


/*
    Time Complexity: O(n)
    Space Complexity: O(k);
*/