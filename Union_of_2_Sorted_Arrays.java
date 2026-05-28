import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

class Solution {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5}, b = {1, 2, 3, 6, 7};
        System.out.println(Solution.findUnion(a, b));
    }

    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        HashSet<Integer> set = new HashSet<>();
        for(int z : a)
            set.add(z);
        
        for(int z : b)
            set.add(z);

        ArrayList<Integer> list = new ArrayList<>();
        for(int z : set)
            list.add(z);

        Collections.sort(list);

        return list;
    }
}


/*
    Time Complexity: O(a + b + n log n);
    Space Complexity: O(n);

    a --> No. of elements in array a
    b --> No. of elements in array b
    n --> No. of unique elements
*/