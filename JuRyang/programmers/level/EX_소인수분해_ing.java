package JuRyang.programmers.level;

import java.util.HashSet;

public class EX_소인수분해_ing {

/**
소인수분해란 어떤 수를 소수들의 곱으로 표현하는 것입니다. 예를 들어 12를 소인수 분해하면 2 * 2 * 3 으로 나타낼 수 있습니다.
따라서 12의 소인수는 2와 3입니다.
자연수 n이 매개변수로 주어질 때 n의 소인수를 오름차순으로 담은 배열을 return하도록 solution 함수를 완성해주세요.

매개변수	값
n	5
arr1	[9, 20, 28, 18, 11]
arr2	[30, 1, 21, 17, 28]
출력	["#####","# # #", "### #", "# ##", "#####"]

입출력 예
n	result
12	[2, 3]
17	[17]
420	[2, 3, 5, 7]

 * */


    static HashSet<Object> Solution(int n) {

        HashSet answer= new HashSet<>();
            for(int i=2; i<=n; i++){
                while(n%i==0){
                    if (n % i == 0) {
                        n/= i;
                        answer.add(i);

                    }
                }

            }
        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        /*psvm 단축키 */
        Solution(420);


    }



}