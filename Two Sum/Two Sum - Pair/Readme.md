Given an array `arr[]` of `n` integers and a `target` value, check if there exists a pair whose sum equals the `target`.

PS: This a variation of the 2-Sum problem

## Approach:

1. **Naive Approach - O(n^2) time & O(1) space**: 
- The basic approach is to generate all the possible pairs and check if any of them add up to the target value. To generate all pairs, we simply run two nested loops.
- Use two nested loops to check every pair of elements and see if their sum equals the target. This approach has a time complexity of O(n^2).

2. **Better Approach - O(n log n) time & O(1) space**: 
- Sort the array in non-decreasing order.
- Loop through each element arr[i] from index 0 to n-2
- Fro each arr[i], calculate complement = target - arr[i]
- Perform binary search for complement in the subarray from index i+1 to n-1
- If the complement is found, return true
- If the loop completes without finding any valid pair, return false

3. **Better Approach 2**: 
- The idea is to use the two-pointer technique but for using the two-pointer technique, the array must be sorted. Once the array is sorted then we can use this approach by keeping one pointer at the beginning (left) and another at the end (right) of the array. 
- Check the sum of the elements at these two pointers:
--  If the sum equals the target, we’ve found the pair.
--   If the sum is less than the target, move the left pointer to the right to increase the sum.
--  If the sum is greater than the target, move the right pointer to the left to decrease the sum.

Note: This approach is the best approach for a sorted array. But if array is not sorted, then we use the below approach.

4. **Expected Approach**: Use a hash map to store the indices of the elements. For each element, check if the complement exists in the map and ensure that the indices are different. This approach has a time complexity of O(n) and space complexity of O(n).