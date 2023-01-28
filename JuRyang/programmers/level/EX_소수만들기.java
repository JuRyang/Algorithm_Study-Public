package JuRyang.programmers.level;

import java.util.ArrayList;

public class EX_소수만들기 {
    /**
     주어진 숫자 중 3개의 수를 더했을 때 소수가 되는 경우의 개수를 구하려고 합니다.
     숫자들이 들어있는 배열 nums가 매개변수로 주어질 때,
     nums에 있는 숫자들 중 서로 다른 3개를 골라 더했을 때 소수가 되는 경우의 개수를 return 하도록 solution 함수를 완성해주세요.

     제한사항
     nums에 들어있는 숫자의 개수는 3개 이상 50개 이하입니다.
     nums의 각 원소는 1 이상 1,000 이하의 자연수이며, 중복된 숫자가 들어있지 않습니다.

     입출력 예
     nums	        result
     [1,2,3,4]	        1
     [1,2,7,6,4]	    4
     */


    public static int solution(int[] nums) {
        int answer = 0;
        int cnt = 0;
        for(int i = 0; i<nums.length; i++){
            for(int k = i+1; k<nums.length; k++){
                for(int j = k+1; j<nums.length; j++){
                    int  a = nums[i] + nums[k]+nums[j];
                    for(int z =1; z<=a; z++){
                        if(a % z == 0){
                            cnt +=1;
                        }
                    }
                    if(cnt == 2){
                        answer+=1;
                    }

                }
            }
        }



        return answer;
    }

/*
    public int solution(int[] nums) {
        int answer = 0;
        ArrayList<Integer> info  = new ArrayList<>();
        for(int i = 0; i<nums.length; i++){
            for(int k = i+1; k<nums.length; k++){
                for(int j = k+1; j<nums.length; j++){
                    int  a = nums[i] + nums[k]+nums[j];
                    info.add(a);
                    System.out.println(info);
                }
            }
        }

        for(Integer i : info) {
            int count = 2;
            answer++;
            while(count < i) {
                if(i % count == 0) {
                    answer--;
                    break;
                }
                count++;
            }
        }

        return answer;
    }
    */

    public static void main(String[] args) {

        int [] num = {1,2,3,4};
        solution(num);

    }
}
