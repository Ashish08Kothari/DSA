import java.util.ArrayList;

class Solution {
    public static void main(String[] args) {
        int[] arr = {5, 10, 20, 40};
        System.out.println(leaders(arr));
    }

    static ArrayList<Integer> leaders(int[] arr) {
        int leader = arr[arr.length-1];
        ArrayList<Integer> list = new ArrayList<>();
        list.add(leader);
        for (int i = arr.length-2; i >= 0; i--) {
            if(arr[i] >= leader) {
                leader = arr[i];
                list.add(leader);
            }
        }

        reverse(list);
        return list;
    }

    static void reverse(ArrayList<Integer> list) {
        int s = 0, e = list.size()-1;
        while (s < e) {
            int temp = list.get(s);
            list.set(s++, list.get(e));
            list.set(e--, temp);
        }
    }
}


/*
    Time Complexity: O(n)
    Space Complexity: O(k)

    k --> No. of leaders
*/