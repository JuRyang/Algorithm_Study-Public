package JuRyang.programmers.level;

import java.util.*;

public class EX_모의고사 {
    /**
     *
     수포자는 수학을 포기한 사람의 준말입니다. 수포자 삼인방은 모의고사에 수학 문제를 전부 찍으려 합니다.
     수포자는 1번 문제부터 마지막 문제까지 다음과 같이 찍습니다.

     1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
     2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
     3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...

     1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때,
     가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성해주세요.

     제한 조건
     시험은 최대 10,000 문제로 구성되어있습니다.
     문제의 정답은 1, 2, 3, 4, 5중 하나입니다.
     가장 높은 점수를 받은 사람이 여럿일 경우, return하는 값을 오름차순 정렬해주세요.
     입출력 예
     answers	            return
     [1,2,3,4,5]	        [1]
     [1,3,2,4,2]	        [1,2,3]
     입출력 예 설명
     입출력 예 #1
     수포자 1은 모든 문제를 맞혔습니다.
     수포자 2는 모든 문제를 틀렸습니다.
     수포자 3은 모든 문제를 틀렸습니다.
     따라서 가장 문제를 많이 맞힌 사람은 수포자 1입니다.

     입출력 예 #2

     모든 사람이 2문제씩을 맞췄습니다.
     * */

    public static void main(String[] args) {
        int [] a = {2,1,3,4,1};
        //int [] a = {1,3,2,4,2};
        //int [] a = {1,2,3,4,5};
        solution(a);

    }
    public static int[] solution(int[] answers) {
        int[] answer = new int[3];

        int[]  score = new int[3];
        Map<Integer,Integer> map = new HashMap<>();
        int [] a = {1, 2, 3, 4, 5};
        int [] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int [] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int a_score = 0;
        int b_score = 0;
        int c_score = 0;

        for(int i =0; i< answers.length; i++) {
            //런타임에러
//            if(answers[i] == a[i]){
//                a_score++;
//            }
//            if(answers[i] == b[i]){
//                b_score++;
//              //  map.put(2,b_score);
//            }
//
//            if(answers[i] == c[i]){
//                c_score++;
//               // map.put(3,c_score);
//            }

            if (answers[i] == a[i % 5]) {
                a_score++;
            }
            if (answers[i] == b[i % 8]) {
                b_score++;
                //  map.put(2,b_score);
            }

            if (answers[i] == c[i % 10]) {
                c_score++;
                // map.put(3,c_score);
            }

            map.put(1, a_score);
            map.put(2, b_score);
            map.put(3, c_score);
        }


        int max = Math.max(Math.max(a_score,b_score),c_score);

        ArrayList<Integer> list = new ArrayList<Integer>();
        if(max==a_score) list.add(1);
        if(max==b_score) list.add(2);
        if(max==c_score) list.add(3);

        answer = new int[list.size()];


        for(int i =0; i<answer.length; i++) {
            answer[i] = list.get(i);
            System.out.println(answer[i]);
        }



        return answer;
    }

    /**
     *
     * 머가 다른거야 결과는 똑같은거같은데?????????????????
     */
//    public static List solution(int[] answers) {
//        List answer = new ArrayList<>();
//        Map<Integer,Integer> map = new HashMap<>();
//        int [] a = {1, 2, 3, 4, 5};
//        int [] b = {2, 1, 2, 3, 2, 4, 2, 5};
//        int [] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
//        int a_score = 0;
//        int b_score = 0;
//        int c_score = 0;
//
//        for(int i =0; i< answers.length; i++){
//            //런타임에러
////            if(answers[i] == a[i]){
////                a_score++;
////            }
////            if(answers[i] == b[i]){
////                b_score++;
////              //  map.put(2,b_score);
////            }
////
////            if(answers[i] == c[i]){
////                c_score++;
////               // map.put(3,c_score);
////            }
//
//            if(answers[i] == a[i%5]){
//                a_score++;
//            }
//            if(answers[i] == b[i%8]){
//                b_score++;
//                //  map.put(2,b_score);
//            }
//
//            if(answers[i] == c[i%10]){
//                c_score++;
//                // map.put(3,c_score);
//            }
//            map.put(1,a_score);
//            map.put(2,b_score);
//            map.put(3,c_score);
//
//        }
//
//        System.out.println(a_score);
//        System.out.println(b_score);
//        System.out.println(c_score);
//        List<Integer> keySet = new ArrayList<>(map.keySet());
//
//        keySet.sort(((o1, o2) -> map.get(o2).compareTo(map.get(o1))));
//
//        for (Integer key : keySet) {
//            System.out.println("Key : " + key+" , Val : " + map.get(key));
//            if(map.get(key) !=0){
//                answer.add(key);
//            }
//        }
////
//        System.out.println(answer.toString());
//
//        return answer;
//    }

}
