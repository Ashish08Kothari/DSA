import java.util.HashMap;
class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().romanToInt("LVIII"));
    }   

    public int romanToInt(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int n = s.length();
        int num = map.get(s.charAt(n-1));

        for (int i = n-2; i >= 0; i--) {
            int curr = map.get(s.charAt(i)), prev = map.get(s.charAt(i+1));
            if (curr >= prev) num += curr;
            else num -= curr;
        }

        return num;
    }
}

/*
    Time Complexity : O(n)
    Space Complexity : O(n)
*/