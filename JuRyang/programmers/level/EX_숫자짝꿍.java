package JuRyang.programmers.level;


import java.time.LocalDate;
import java.util.*;

public class EX_숫자짝꿍 {
    /**
     *
     * 2023.03.05
     두 정수 X, Y의 임의의 자리에서 공통으로 나타나는 정수 k(0 ≤ k ≤ 9)들을 이용하여 만들 수 있는 가장 큰 정수를 두 수의 짝꿍이라 합니다
     (단, 공통으로 나타나는 정수 중 서로 짝지을 수 있는 숫자만 사용합니다).
     X, Y의 짝꿍이 존재하지 않으면, 짝꿍은 -1입니다. X, Y의 짝꿍이 0으로만 구성되어 있다면, 짝꿍은 0입니다.

     예를 들어, X = 3403이고 Y = 13203이라면, X와 Y의 짝꿍은 X와 Y에서 공통으로 나타나는 3, 0, 3으로 만들 수 있는 가장 큰 정수인 330입니다.
     다른 예시로 X = 5525이고 Y = 1255이면 X와 Y의 짝꿍은 X와 Y에서 공통으로 나타나는 2, 5, 5로 만들 수 있는 가장 큰 정수인 552입니다
     (X에는 5가 3개, Y에는 5가 2개 나타나므로 남는 5 한 개는 짝 지을 수 없습니다.)
     두 정수 X, Y가 주어졌을 때, X, Y의 짝꿍을 return하는 solution 함수를 완성해주세요.

     입출력 예
     X	        Y	        result
     "100"	    "2345"	    "-1"
     "100"	    "203045"	"0"
     "100"	    "123450"	"10"
     "12321"	"42531"	    "321"
     "5525"	    "42531"	    "552"
     * */

    public static void main(String[] args){
        String a = "100";
        String b ="123450";
        solution(a,b);

    }

    public static String solution(String X, String Y) {
        String answer ="";
        StringBuilder sb = new StringBuilder();

        int [] x = new int[10];
        int [] y = new int[10];

        for(String a : X.split("")){
            x[Integer.parseInt(a)]++;
        }

        for(String b : Y.split("")){
            y[Integer.parseInt(b)]++;
        }

        for(int i =9; i>=0; i--){
            while(x[i] > 0 && y[i] > 0){
                sb.append(i);

                x[i]--;
                y[i]--;
            }
        }
        if("".equals(sb.toString())) {
            return "-1";
        }
        if("0".equals(sb.toString().substring(0,1))) {
            return "0";
        }


//ajffk gkekrk rnrmffld goTRdj ajffk wha Wlfflsek g.........................
        // dlfeks rlt dhffla...dlfeks dhffuTdj............................bb
//        String answer = "";
//
//        String [] a = X.split("");
//        String [] b = Y.split("");
//
//        List<String> list = new ArrayList<>();
//
//        for(int i =0; i <a.length; i++){
//            for(int z = 0; z <b.length; z++){
//                if(a[i].equals(b[z])){
//                    list.add(a[i]);
//                    System.out.println(a[i]+" , "+b[z]);
//                }
//            }
//        }
//
//        if(list.size() == 0){
//            return  "-1";
//        }
//
//        System.out.println(answer);
        return sb.toString();
    }
}
