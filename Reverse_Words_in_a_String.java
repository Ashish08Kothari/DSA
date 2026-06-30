class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().reverseWords("  hello world  "));
    }

    public String reverseWords(String st) {
        st = st.trim();
        String[] arr = st.split("\\s+");
        int s = 0, e = arr.length-1;
        while (s < e) {
            String temp = arr[s];
            arr[s++] = arr[e];
            arr[e--] = temp;
        }

        return String.join(" ", arr);
    }
}

/*
    Time Complexity : O(n)
    Space Complexity : O(n)
*/