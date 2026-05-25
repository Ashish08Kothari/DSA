import java.util.ArrayList;
import java.util.Collections;

class Solution{
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        ArrayList<Integer> list = new Solution().getDivisors(num);
        for(int z : list){
            System.out.print(z+" ");
        }
    }

    public ArrayList<Integer> getDivisors(int n){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i*i <= n; i++){
            if(n % i == 0){
                list.add(i);
                if(n / i != i)
                    list.add(n / i);
            }
        }

        Collections.sort(list);
        return list;
    }
}

/* Time Complexity: O(klogk + √n)
   Space Complexity: O(n)

   k => number of divisors.
   n => number
*/

