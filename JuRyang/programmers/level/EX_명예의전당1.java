package JuRyang.programmers.level;


import java.util.*;

public class EX_명예의전당1 {
    /**
     * "명예의 전당"이라는 TV 프로그램에서는 매일 1명의 가수가 노래를 부르고, 시청자들의 문자 투표수로 가수에게 점수를 부여합니다.
     * 매일 출연한 가수의 점수가 지금까지 출연 가수들의 점수 중 상위 k번째 이내이면 해당 가수의 점수를 명예의 전당이라는 목록에 올려 기념합니다.
     * 즉 프로그램 시작 이후 초기에 k일까지는 모든 출연 가수의 점수가 명예의 전당에 오르게 됩니다.
     * k일 다음부터는 출연 가수의 점수가 기존의 명예의 전당 목록의 k번째 순위의 가수 점수보다 더 높으면,
     * 출연 가수의 점수가 명예의 전당에 오르게 되고 기존의 k번째 순위의 점수는 명예의 전당에서 내려오게 됩니다.
     *
     * 이 프로그램에서는 매일 "명예의 전당"의 최하위 점수를 발표합니다. 예를 들어, k = 3이고,
     * 7일 동안 진행된 가수의 점수가 [10, 100, 20, 150, 1, 100, 200]이라면,
     * 명예의 전당에서 발표된 점수는 아래의 그림과 같이 [10, 10, 10, 20, 20, 100, 100]입니다.
     *
     * 입출력 예
     * k	score	                                            result
     * 3	[10, 100, 20, 150, 1, 100, 200]	                    [10, 10, 10, 20, 20, 100, 100]
     * 4	[0, 300, 40, 300, 20, 70, 150, 50, 500, 1000]	    [0, 0, 0, 0, 20, 40, 70, 70, 150, 300]

     10 100,10 10
     * */

    public static void main(String[] args){
       // int [] score = {10, 100, 20, 150, 1, 100, 200};
        int [] score = {0, 300, 40, 300, 20, 70, 150, 50, 500, 1000};

       // int k = 3;
        int k = 4;

        solution(k,score);

    }

    public static int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        int temp;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i< score.length; i++){
            if(list.size() < k ){
                list.add(score[i]);
                list.sort(Integer::compareTo);
                answer[i] = list.get(0);
            }else{
                temp= list.get(0);
                if(temp < score[i]){
                    list.set(0,score[i]);
                    list.sort(Integer::compareTo);
                    System.out.println(list);
                }
                answer[i] = list.get(0);
            }

            System.out.println(Arrays.toString(answer));

        }


        return answer;
    }
}
