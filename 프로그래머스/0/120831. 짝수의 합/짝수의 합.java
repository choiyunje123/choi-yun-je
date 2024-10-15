class Solution {
    public int solution(int n) {
        int answer = 0;

        for(int j=2; j<=n; j++){
            if(j%2 == 0){
                answer += j;
            }
        }
        return answer;
    }
}