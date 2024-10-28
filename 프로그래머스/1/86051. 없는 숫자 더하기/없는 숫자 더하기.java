class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int[] sum = new int[10];
        
        for(int i=0; i<numbers.length; i++) {
            sum[numbers[i]] = 1;
        }

        for(int i=0; i<sum.length; i++) {
            if(sum[i] == 0){
                answer += i;
            }
        }
        
        
        
        return answer;
    }
}