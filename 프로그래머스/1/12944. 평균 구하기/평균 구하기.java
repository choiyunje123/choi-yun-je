class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        double sum = 0;
        int len = arr.length;
        for(int i=0; i<len; i++) {
            sum += arr[i];
        }
        answer = sum/len;
        return answer;
    }
}