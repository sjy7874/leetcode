from typing import List


class Solution:
    tem = {}

    def findSubsequences(self, nums: List[int]) -> List[List[int]]:

        tem = []
        for n in range(nums.__len__()):
            for m in range(tem.__len__()):
                if (nums[n] >= tem[m][-1]):
                    array_temp = tem[m][:]
                    array_temp.append(nums[n])
                    tem.append(array_temp)
            tem.append([nums[n]])
            pass
        for i in range(len(tem) - 1, -1, -1):
            if tem[i].__len__() == 1:
                del tem[i]
                i = i - 1
                pass

        return [i for n, i in enumerate(tem) if i not in tem[:n]]
