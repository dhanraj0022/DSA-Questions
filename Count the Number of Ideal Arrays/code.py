# This can be solved I think by using permutations or combinations
#  0  1 such that a[1] can be divided by a[0], 3 can be divided with 1
# [1, 1] [1, 3]
# Removing values that can't be divided can be subtracted from the initial combination
# n refers to the number of elements in an array, size of an array
# a[i] % a[i-1] = 0 assuming the array is sorted, smallest multiplier is 2
# maxValue <= 10^4 so we can use log base 2 (maxValue) which would give us the max unique elements in an array
# N <= 10^4 ... log base 2 10^4 = 14 (Unique elements)
