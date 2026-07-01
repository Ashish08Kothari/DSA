import java.util.HashMap;
class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().isAnagram("anagram","nagaram"));
    }

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap<Character,Integer> map = new HashMap<>();
        for (char c : s.toCharArray())
            map.put(c,map.getOrDefault(c,0)+1);
        
        for (char c : t.toCharArray())
            map.put(c,map.getOrDefault(c,0)-1);
        
        for (int f : map.values())
            if (f != 0) return false;
        
        return true;
    }
}

/*
    Time Complexity : O(n)
    Space Complexity : O(n)
*/