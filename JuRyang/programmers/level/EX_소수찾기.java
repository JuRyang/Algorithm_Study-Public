package JuRyang.programmers.level;

import java.lang.reflect.Array;
import java.util.Arrays;

import static JuRyang.programmers.EX_치킨쿠폰.solution;

public class EX_소수찾기 {
    /**
     1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환하는 함수, solution을 만들어 보세요.
     소수는 1과 자기 자신으로만 나누어지는 수를 의미합니다.
            (1은 소수가 아닙니다.)

    제한 조건
    n은 2이상 1000000이하의 자연수입니다.

     입출력 예
            n	result
            10	4               1 2 3 4 5 6 7 8 9 10
             5	3               5 4 3 2 1
    입출력 예 #1
            1부터 10 사이의 소수는 [2,3,5,7] 4개가 존재하므로 4를 반환

    입출력 예 #2
            1부터 5 사이의 소수는 [2,3,5] 3개가 존재하므로 3를 반환
     */


    public static int solution(int n) {
        int answer = 0;
        for(int i = 2 ; i <= n ; i++){
            int count = 0;
            for(int j = 2 ; j <= n; j++){
                if (i % j == 0){
                    count++;
                }
            }
            if (count < 2){
                answer ++;
            }
        }

        System.out.println(answer);
        return answer;

    }


    public static void main(String[] args) {
       // solution(10);
        solution(5);

    }
}
