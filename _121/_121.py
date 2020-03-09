from typing import List


class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        if prices.__len__() <= 1:
            return 0
        P = {}
        P[0] = 0
        min_price = prices[0]
        for i in range(1, prices.__len__()):
            min_price = min(min_price, prices[i])
            P[i] = max(P[i - 1], prices[i] - min_price)
        return P[prices.__len__() - 1]
