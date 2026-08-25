class Solution {
    public String makeGood(String s) {

        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();

        for (char ch : s.toCharArray()) {

            if (!st.isEmpty() &&
                ((Character.isUpperCase(ch) && st.peek() == Character.toLowerCase(ch))
                || 
                (Character.isLowerCase(ch) && st.peek() == Character.toUpperCase(ch)))) {

                st.pop();
            }
            else {
                st.push(ch);
            }
        }

        while (!st.isEmpty()) {
            sb.append(st.pop());
        }

        sb.reverse();

        return sb.toString();
    }
}