/**
 * Problem: Stock Buy and Sell to Maximize Profit
 *
 * Description:
 * Given an array of stock prices where the i-th element represents the price of a stock on day i, 
 * the goal is to find the maximum profit by making multiple transactions. You may buy and sell the 
 * stock on the same day, but you cannot hold multiple stocks at the same time.
 *
 * Approach:
 * - Traverse the array of prices:
 *   1. If the price on day i is greater than the price on day i-1, calculate the profit 
 *      as the difference (prices[i] - prices[i-1]).
 *   2. Accumulate this profit to get the maximum possible profit.
 * - The solution ensures that every opportunity to make a profit is utilized.
 *
 * Example:
 * Input: prices = [7, 1, 5, 3, 6, 4]
 * Output: 7
 * Explanation:
 * - Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 4.
 * - Buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 3.
 * - Total profit = 4 + 3 = 7.
 *
 * Key Takeaways:
 * - The greedy approach ensures optimal profit in O(n) time complexity with O(1) space complexity.
 * - This problem illustrates how local profit opportunities can combine to yield a global maximum profit.
 */


import java.util.Arrays;
public class Day_07_StockBuyAndSell {

    public static int maximumProfit(int prices[]){

        int n = prices.length;
        int result = 0;

        for(int i = 1; i < n; i++){
            if(prices[i] > prices[i-1]){
                result += prices[i] - prices[i-1];
            }
        }
        return result;

    }

    public static void main(String[] args) {
        int prices[] = {100, 180, 260, 310, 40, 535, 695};
        System.out.println(maximumProfit(prices)); // Output: 7
    }
}