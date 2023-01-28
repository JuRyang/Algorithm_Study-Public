package JuRyang.programmers.level;

import java.util.HashSet;

public class EX_크기가작은부분문자열 {
    /**
     * 숫자로 이루어진 문자열 t와 p가 주어질 때, t에서 p와 길이가 같은 부분문자열 중에서,
     * 이 부분문자열이 나타내는 수가 p가 나타내는 수보다 작거나 같은 것이 나오는 횟수를 return하는 함수 solution을 완성하세요.
     * <p>
     * 예를 들어, t="3141592"이고 p="271" 인 경우, t의 길이가 3인 부분 문자열은 314, 141, 415, 159, 592입니다.
     * 이 문자열이 나타내는 수 중 271보다 작거나 같은 수는 141, 159 2개 입니다.
     * <p>
     * <p>
     * 입출력 예
     * t	                p	    result
     * "3141592"	        "271"	    2
     * "500220839878"	    "7"	        8
     * "10203"	            "15"	    3
     */

    public static void main(String[] args) {

//        String t ="3141592";
//        String p ="271";

//        String t ="500220839878";
//        String p ="7";

//        String t ="10203";
//        String p ="15";

        String t ="111111";
        String p ="0";


        solution(t,p);

    }

    public static int solution(String t, String p) {
        int answer = 0;

        for(int i=0; i<t.length();i++){
            if(p.length()<=(t.length()-i)){
                String a = t.substring(i,i+p.length());
                System.out.println(a);
                if(Integer.parseInt(a)<= Integer.parseInt(p)){
                    answer++;
                }
            }

        }
        System.out.println(answer);

        return answer;
    }

    /**
     *
     * 런타임에러 -> 질문하기에 보니까 비슷한 사례 있었음
     *
     * subString은 String 을 리턴하기때문에 숫자형으로 형변환
     *
     * Integer.parseInt를 사용했을 때 런타임에러가 남
     * p의 제한사항으로 최대길이가 18자리 라고 주어졌는데
     * 이 경우 Integer의 최댓값인 약21억(10자리)을 초과하기 때문에,
     * 처리하지못해서 더큰 정수형 데이터인 Long클래스의 parseLong을 사용한 것
     *
     *
     *
     * */

}