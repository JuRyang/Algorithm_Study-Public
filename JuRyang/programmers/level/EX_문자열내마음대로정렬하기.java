package JuRyang.programmers.level;

import java.util.*;

import static JuRyang.programmers.level.EX_문자열내마음대로정렬하기.solution;

public class EX_문자열내마음대로정렬하기 {
    /**
     * 2023. 01. 01

     문제 설명
     문자열로 구성된 리스트 strings와, 정수 n이 주어졌을 때, 각 문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬하려 합니다.
     예를 들어 strings가 ["sun", "bed", "car"]이고 n이 1이면 각 단어의 인덱스 1의 문자 "u", "e", "a"로 strings를 정렬합니다.

     입출력 예
     strings	                n	        return
     ["sun", "bed", "car"]	    1	    ["car", "bed", "sun"]
     ["abce", "abcd", "cdx"]	2	    ["abcd", "abce", "cdx"]
     * @return
     */

    public static String[] solution(String[] strings, int n) {

        //String [] answer={};
        //List<String> answer = new ArrayList<>();
        HashMap<Integer, String> list = new HashMap<Integer,String>();
        List<String> lists = new ArrayList<>();

        for(int i =0; i < strings.length; i++){
            String[] result = strings[i].split("");

            //문자를 숫자로 바꾸자
            int a = result[n].charAt(0);

            lists.add(result[n]);
            //list.put(i,result[n]);
            list.put(a,strings[i]);
            Collections.sort(lists);
         //  list.put(String.valueOf(lists), strings[i]);

        }

        List<String> keyInfo = new ArrayList<String>();
        for(Map.Entry<Integer, String> entry : list.entrySet()){
            keyInfo.add(entry.getValue());
        }

        System.out.println(keyInfo);
        String[] answer = new String[keyInfo.size()];

        try {

            for(int t=0; t<keyInfo.size(); t++) {
                System.out.println("keyInfo.get(t)");
                answer[t] = keyInfo.get(t);
            }
        }
        catch(IndexOutOfBoundsException e) {

            System.out.println(e);

        }

       // Arrays.sort(answer);
        System.out.println(Arrays.toString(answer)+"<>");
        return answer;
    }

    public static void main(String[] args) {
//        String  [] a = {"sun", "bed", "car"};
//        int n = 1;
        String  [] a = {"abce", "abcd", "cdx"};
        int n = 2;

        solution(a,n);

    }
}
