package JuRyang.programmers.level;

import java.util.*;

public class EX_잘라서배열로저장 {

    /**
     * 문자열 my_str과 n이 매개변수로 주어질 때, my_str을 길이 n씩 잘라서 저장한 배열을 return하도록 solution 함수를 완성해주세요.
     *
     *  my_str	                n	result

     * "abc1Addfggg4556b"	    6	["abc1Ad", "dfggg4", "556b"]
     * "abcdef123"	            3	["abc", "def", "123"]
     * */

    public static String[] solution(String my_str, int n) {
        String[] answer = {};
        String[] result = my_str.split("");
        System.out.println(Arrays.toString(result)); //[a, b, c, 1, A, d, d, f, g, g, g, 4, 5, 5, 6, b]

        String aa = my_str.substring(0,6);
        System.out.println(aa+"<"); //abc1A<

       // ArrayList<String> io = new ArrayList<>();
        Map io = new HashMap();
        for(int i = 0; i<result.length / n; i++){
           for(int  j = i*n ; j < i*n+n ; j ++){
                String a = my_str.substring(i,n);
                io.put(i,a);
            }
        }

        System.out.println(io.values()+"answer");

        return answer;
    }

    public static void main(String[] args) {

        EX_잘라서배열로저장 aa = new EX_잘라서배열로저장();
        EX_잘라서배열로저장 aa2 = new EX_잘라서배열로저장();
       // aa.solution("abc1Addfggg4556b",6);
        aa2.solution("abcdef123",3);


    }
}
