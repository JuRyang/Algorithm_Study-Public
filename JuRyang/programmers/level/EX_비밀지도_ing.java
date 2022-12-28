package JuRyang.programmers.level;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class EX_비밀지도_ing {

/*
프로도가 비상금을 숨겨놓는 장소를 알려줄 비밀지도를 손에 넣었다.
그런데 이 비밀지도는 숫자로 암호화되어 있어 위치를 확인하기 위해서는 암호를 해독해야 한다.
다행히 지도 암호를 해독할 방법을 적어놓은 메모도 함께 발견했다.

지도는 한 변의 길이가 n인 정사각형 배열 형태로, 각 칸은 "공백"(" ") 또는 "벽"("#") 두 종류로 이루어져 있다.
전체 지도는 두 장의 지도를 겹쳐서 얻을 수 있다. 각각 "지도 1"과 "지도 2"라고 하자. 지도 1 또는 지도 2 중 어느 하나라도 벽인 부분은 전체 지도에서도 벽이다.
지도 1과 지도 2에서 모두 공백인 부분은 전체 지도에서도 공백이다.
"지도 1"과 "지도 2"는 각각 정수 배열로 암호화되어 있다.
암호화된 배열은 지도의 각 가로줄에서 벽 부분을 1, 공백 부분을 0으로 부호화했을 때 얻어지는 이진수에 해당하는 값의 배열이다.



매개변수	값
n	5
arr1	[9, 20, 28, 18, 11]
arr2	[30, 1, 21, 17, 28]
출력	["#####","# # #", "### #", "# ##", "#####"]



    * */

//    static int solution(int[][] sizes) {
//
//        String nTwo = Integer.toBinaryString(155);
//        }
//
//        System.out.println("답 : "+w*h);
//        return w*h; //결과
//    }

    public static void main(String[] args) {
        /*psvm 단축키 */

        int p =1;
        int result = 0;
        int n = 6;
        int[] tmp = new int[n];
        List<Object> temp = new ArrayList<>();
        int [] arr1 = {46, 33, 33 ,22, 31, 50};
        int [] arr2  = {27 ,56, 19, 14, 14, 10};


        BigInteger A_binary = new BigInteger(String.valueOf(46), 2);

        System.out.println("A_binary "+A_binary );

        for(int i = 0; i < n; i++){
            tmp[i] = arr1[i] + arr2[i];
            temp.add(tmp[i]);
        }
     //    32 16 8 4 2 1
        System.out.println(temp);

        //재귀함수..? ㅁㄹㄱㄷ ]
        for(int i = 1; i < n; i++){
            result=b(i);
            System.out.println(i+"!=" +result);
        }





    }

    int a (int n){
        int p = 1;
        for(int i = 0; i<=n; i++ ){
            p = 2*i;
        }
        return p;
    }

    static int b(int n){
        if(n <= 1){
            return n;
        }else{
            return b(n-1) * 2;
        }
    }

}