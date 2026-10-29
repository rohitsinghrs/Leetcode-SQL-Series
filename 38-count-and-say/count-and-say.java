
class Solution {
    public String countAndSay(int n) {
        String result = "1";

        for (int step = 2; step <= n; step++) {
            StringBuilder next = new StringBuilder();
            int i = 0;

            while (i < result.length()) {
                char ch = result.charAt(i);
                int count = 0;

                while (i < result.length() &&
                       result.charAt(i) == ch) {
                    count++;
                    i++;
                }

                next.append(count);
                next.append(ch);
            }

            result = next.toString();
        }

        return result;
    }
}
