import java.util.ArrayList;
import java.util.HashMap;


class Solution{
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,2,3,5,3};
        ArrayList<ArrayList<Integer>> list = new Solution().countFreq(arr);
        for(ArrayList<Integer> l : list){
            System.out.println(l.get(0) +" ----> "+ l.get(1));
        }
    }

    public ArrayList<ArrayList<Integer>> countFreq(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for(int z : arr)
            map.put(z, map.getOrDefault(z,0)+1);

        for(int key : map.keySet()){
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(key);
            temp.add(map.get(key));

            list.add(temp);
        }

        return list;
    }
}

/*
    Time Complexity: O(n)
    Space Complexity: O(n)
*/