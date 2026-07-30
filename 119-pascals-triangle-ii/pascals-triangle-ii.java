class Solution {
    public List<Integer> getRow(int rowIndex) {

        List<Integer> row = new ArrayList<>();

        long value = 1; // C(rowIndex, 0)

        for (int i = 0; i <= rowIndex; i++) {

            // Add current value
            row.add( (int)value);

            // Calculate next value using:
            // C(n, k+1) = C(n, k) * (n-k) / (k+1)
            value = value * (rowIndex - i) / (i + 1);
        }

        return row;
    }
}