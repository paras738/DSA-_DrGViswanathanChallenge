class Solution {
    public List<Integer> postorder(Node root) {

        LinkedList<Integer> ans = new LinkedList<>();

        if (root == null)
            return ans;

        Stack<Node> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {

            Node node = stack.pop();
            ans.addFirst(node.val);

            for (Node child : node.children) {
                stack.push(child);
            }
        }

        return ans;
    }
}