class Solution {
    boolean solution(String s) {
        int count = 0;
        
        s = s.toLowerCase();
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'p') {
                count++;
            }
            else if (s.charAt(i) == 'y') {
                count--;
            }
        }
        return count == 0;
    }
}