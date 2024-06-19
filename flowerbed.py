from typing import List

class Solution:
    def minDays(self, bloomDay: List[int], m: int, k: int) -> int:
        if m * k > len(bloomDay):
            return -1
        
        def canMakeBouquets(days: int) -> bool:
            bouquets = 0
            flowers = 0
            
            for bloom in bloomDay:
                if bloom <= days:
                    flowers += 1
                    if flowers == k:
                        bouquets += 1
                        flowers = 0
                else:
                    flowers = 0
                
                if bouquets >= m:
                    return True
            
            return False
        
        left, right = min(bloomDay), max(bloomDay)
        result = -1
        
        while left <= right:
            mid = (left + right) // 2
            if canMakeBouquets(mid):
                result = mid
                right = mid - 1
            else:
                left = mid + 1
        
        return result