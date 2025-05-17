class Solution:
    def mySqrt(self, x: int) -> int:
        if x < 2:
            return x
        l, r = 1
        while l <= r:
            # Calculating mid value to reduce no of operations
            m = (l + r) // 2
            # Checking if mid * mid gives the value of x
            if m * m == x:
                return m
            # If the value of m * m is less than value of x, l value needs to start from m + 1
            elif m * m < x:
                l = m + 1
            # If the value of m * m is greater than value of x, r value needs to start from m - 1
            else:
                r = m - 1
        
