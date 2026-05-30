class Solution {
    public static void main(String[] args) {
        int[] arr = {7,6,4,3,1};
        System.out.println(new Solution().maxProfit(arr));
    }

    public int maxProfit(int[] prices) {
        int max_profit = 0, buy = prices[0];
        for (int i = 1; i < prices.length; i++) {
            int profit = prices[i] - buy;
            max_profit = Math.max(max_profit,profit);
            buy = Math.min(prices[i], buy);
        }

        return max_profit;
    }
}


/*
    Time Complexity: O(n)
    Space Complexity: O(1)
*/