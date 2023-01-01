package JuRyang.programmers.level;

import java.util.*;

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

    public static List<String> solution(String[] strings, int n) {

       // String [] answer={};
        List<String> answer = new ArrayList<>();
        Map<Integer, String> list = new HashMap<>();
        List<String> lists = new ArrayList<>();
        for(int i =0; i < strings.length; i++){
            String[] result = strings[i].split("");

            //문자를 숫자로 바꾸자
            int a = result[n].charAt(0);
            char b  = result[n].charAt(0);
            //System.out.println(a+":");
            //System.out.println(b+":");

            lists.add(result[n]);


 //           System.out.println(lists.toString()+"0_0");
            list.put(a,strings[i]);
            Collections.sort(lists);
//            System.out.println(list.entrySet()+">_<");
         //  list.put(String.valueOf(lists), strings[i]);


        }

        System.out.println(lists.toString()+"0_0");
        System.out.println(lists.get(0));
        System.out.println(list.entrySet()+">_<");

        // 맵은 중복 허용 안되자나 ㅠㅠㅠ 짜증나 ㅠㅠㅠㅠㅠㅠ


        List<Integer> keySet = new ArrayList<>(list.keySet());
        Collections.sort(keySet);

        for (Integer key : keySet) {
            System.out.print("Key : " + key);
            System.out.println(", Val : " + list.get(key));
            answer.add(list.get(key));
        }
        System.out.println(answer.toString());







//
//        for (Map.Entry<Integer, String> entrySet : list.entrySet()) {
//           // System.out.println(entrySet.getKey() + " : " + entrySet.getValue());
//
////            Iterator<Map.Entry<Integer, String>> list2 = list.entrySet().iterator();
////            while (list2.hasNext()){
////                Map.Entry<Integer,String> entry = (Map.Entry<Integer,String> )list2.next();
////                int key = entry.getKey();
////                String value = entry.getValue();
////                Collections.sort(((o1, o2) -> list.get(o1.getKey()).compareTo(list.get(o2.getKey()))));
////
////            }
//
////            List<Map.Entry<Integer, String>> entryList = new LinkedList<>(list.entrySet());
////            entryList.sort(((o1, o2) -> list.get(o1.getKey()).compareTo(list.get(o2.getKey()))));
////            for(Map.Entry<Integer, String> entry : entryList){
////                System.out.println("key : " + entry.getKey() + ", value : " + entry.getValue());
////            }
//       }




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
