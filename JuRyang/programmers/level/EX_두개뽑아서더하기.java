package JuRyang.programmers.level;

import java.util.*;

public class EX_두개뽑아서더하기 {
    /**
     *
     정수 배열 numbers가 주어집니다.
     numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는 모든 수를 배열에 오름차순으로 담아
     return 하도록 solution 함수를 완성해주세요.

     입출력 예 #1

     2 = 1 + 1 입니다. (1이 numbers에 두 개 있습니다.)
     3 = 2 + 1 입니다.
     4 = 1 + 3 입니다.
     5 = 1 + 4 = 2 + 3 입니다.
     6 = 2 + 4 입니다.
     7 = 3 + 4 입니다.
     따라서 [2,3,4,5,6,7] 을 return 해야 합니다.
     입출력 예 #2

     2 = 0 + 2 입니다.
     5 = 5 + 0 입니다.
     7 = 0 + 7 = 5 + 2 입니다.
     9 = 2 + 7 입니다.
     12 = 5 + 7 입니다.
     따라서 [2,5,7,9,12] 를 return 해야 합니다.


     입출력                예
     numbers	        result
     [2,1,3,4,1]	    [2,3,4,5,6,7]
     [5,0,2,7]	        [2,5,7,9,12]
     * */

    public static void main(String[] args) {
        //int [] a = {2,1,3,4,1};
        int [] a = {4,5,6,7,8,9,9};
        solution(a);

    }

    public static Object[] solution(int[] numbers) {
        HashMap<Integer,Integer> list = new HashMap<>();
        List<Integer> lists = new ArrayList<>();

        for(int i = 0; i <numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i != j) {
                    int sum = numbers[i] + numbers[j];
                    list.put(sum, i);

                }
            }
        }
        Object[] answer = list.keySet().toArray();
        Arrays.sort(answer);
        System.out.println(Arrays.toString(answer));
        return answer;
    }
}
