from typing import List


class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        P = {}
        P[0] = nums[0]
        max_count = nums[0]
        for i in range(1, nums.__len__()):
            P[i] = max(nums[i], P[i - 1] + nums[i])
            max_count = max(max_count,P[i])
        return max_count
