import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        while(n!=0){
        //num을 10으로 나눈 나머지를 sum에 더한다.
        answer += n%10;
        //num을 10으로 나눈 값을 다시 num에 저장한다.
        n /= 10;
        }

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}