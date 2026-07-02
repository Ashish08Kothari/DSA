import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Map;
class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().frequencySort("tree"));
    }

    public String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) 
            map.put(c,map.getOrDefault(c,0)+1);
        
        PriorityQueue<Map.Entry<Character,Integer>> pq = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        pq.addAll(map.entrySet());

        StringBuilder ans = new StringBuilder();
        while (!pq.isEmpty()) {
            Map.Entry<Character,Integer> temp = pq.poll();
            ans.append(String.valueOf(temp.getKey()).repeat(temp.getValue()));
        }

        return ans.toString();
    }
}

/*
    Time Complexity : O(n + k log k)
    Space Complexity : O(n)
*/