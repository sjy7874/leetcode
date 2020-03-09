from typing import List


class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        if prices.__len__() <= 1:
            return 0
        P = [{} for i in range(prices.__len__())]
        P[0][0] = 0
        P[0][1] = -prices[0]
        P[0][2] = 0
        for i in range(1, prices.__len__()):
            P[i][0] = max(P[i - 1][0], P[i - 1][2])
            P[i][1] = max(P[i - 1][1], P[i - 1][0] - prices[i])
            P[i][2] = P[i - 1][1] + prices[i]
            pass
        return max(P[-1][0], P[-1][2])
