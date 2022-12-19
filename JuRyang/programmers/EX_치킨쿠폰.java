package JuRyang.programmers;

public class EX_치킨쿠폰 {

    /**
     프로그래머스 치킨은 치킨을 시켜먹으면 한 마리당 쿠폰을 한 장 발급합니다.
     쿠폰을 열 장 모으면 치킨을 한 마리 서비스로 받을 수 있고, 서비스 치킨에도 쿠폰이 발급됩니다.
     시켜먹은 치킨의 수 chicken이 매개변수로 주어질 때
     받을 수 있는 최대 서비스 치킨의 수를 return하도록 solution 함수를 완성해주세요.

     입출력            예
     chicken	    result
     100	          11
     1,081	         120

    1081 /10 = 108 -1
    108 /10 10 -8
    10 /10 1

    * */

     public static int solution(int chicken) {
        int answer = 0;
        int coupon = chicken; // 한마리 당 쿠폰 한장
        int service = 0; //10장 모으면 치킨 한마리가 공짜!
        int tempCoupon = 0; //쩌리 쿠폰들 모으자

        //쿠폰이 10장 미만일때까지
         while(coupon >= 10){
             service += coupon / 10; //10장 모으면 치킨 한마리가 공짜!
             tempCoupon = coupon % 10; //쩌리 쿠폰들 모으자
             coupon = tempCoupon + coupon /10;

             System.out.println(service+"");


         }

        return answer;
    }

    public static void main(String[] args) {
        /*psvm 단축키 */

        //solution(100);
        solution(1081);

    }

}