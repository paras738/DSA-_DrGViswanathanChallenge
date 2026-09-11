class Solution {
    public int[] nextGreaterElements(int[] nums) {

        int n = nums.length;

        int[] ans = new int[n];

        // Initially, every answer is -1
        Arrays.fill(ans, -1);

        Stack<Integer> st = new Stack<>();

        // Traverse the array twice
        for (int i = 2 * n - 1; i >= 0; i--) {

            int index = i % n;

            // Remove elements that are not greater
            while (!st.isEmpty() && st.peek() <= nums[index]) {
                st.pop();
            }

            // Fill answer only during the actual/original traversal
            if (i < n && !st.isEmpty()) {
                ans[index] = st.peek();
            }

            // Push current element
            st.push(nums[index]);
        }

        return ans;
    }
}