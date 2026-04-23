Given an array `arr[]` of `n` integers and a `target` value, check if there exists a pair whose sum equals the `target`.

PS: This a variation of the 2-Sum problem

## Approach:

1. **Naive Approach**: 
- The basic approach is to generate all the possible pairs and check if any of them add up to the target value. To generate all pairs, we simply run two nested loops.Use two nested loops to check every pair of elements and see if their sum equals the target. This approach has a time complexity of O(n^2).

2. **Better Approach**: Sort the array and use two pointers to find the pair. This approach has a time complexity of O(n log n) due to sorting, and O(n) for the two-pointer traversal.

3. **Better Approach 2**: Use a hash set to store the elements of the array. For each element, check if the complement (target - current element) exists in the set. This approach has a time complexity of O(n) and space complexity of O(n).

4. **Expected Approach**: Use a hash map to store the indices of the elements. For each element, check if the complement exists in the map and ensure that the indices are different. This approach has a time complexity of O(n) and space complexity of O(n).