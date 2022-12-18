package JuRyang.programmers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class EX_로그인성공 {
    /**
     *
     머쓱이는 프로그래머스에 로그인하려고 합니다.
     머쓱이가 입력한 아이디와 패스워드가 담긴 배열 id_pw와 회원들의 정보가 담긴 2차원 배열 db가 주어질 때,
     다음과 같이 로그인 성공, 실패에 따른 메시지를 return하도록 solution 함수를 완성해주세요.

     아이디와 비밀번호가 모두 일치하는 회원정보가 있으면 "login"을 return합니다.
     로그인이 실패했을 때 아이디가 일치하는 회원이 없다면 “fail”를,
     아이디는 일치하지만 비밀번호가 일치하는 회원이 없다면 “wrong pw”를 return 합니다.

     회원들의 아이디는 문자열입니다.
     회원들의 아이디는 알파벳 소문자와 숫자로만 이루어져 있습니다.
     회원들의 패스워드는 숫자로 구성된 문자열입니다.
     회원들의 비밀번호는 같을 수 있지만 아이디는 같을 수 없습니다.
     id_pw의 길이는 2입니다.
     id_pw와 db의 원소는 [아이디, 패스워드] 형태입니다.
     1 ≤ 아이디의 길이 ≤ 15
     1 ≤ 비밀번호의 길이 ≤ 6
     1 ≤ db의 길이 ≤ 10
     db의 원소의 길이는 2입니다.

     입출력 예
     id_pw	                                db	                    result

     ["meosseugi", "1234"]	        [["rardss", "123"],             "login"
                                    ["yyoom", "1234"],
                                    ["meosseugi", "1234"]]

     ["programmer01", "15789"]	    [["programmer02", "111111"],    "wrong pw"
                                    ["programmer00", "134"],
                                    ["programmer01", "1145"]]

     ["rabbit04", "98761"]	        [["jaja11", "98761"],           "fail"
                                    ["krong0313", "29440"],
                                    ["rabbit00", "111333"]]

     * */

    public static void main(String[] args) {
        String [] a = {"meosseugi", "12347"};
        String [][]b = {{"rardss", "123"}, {"yyoom", "1234",} ,{"meosseugi", "1234"}} ;
        Solution(a,b);

    }

    private static void Solution(String[] id_pw, String[][] db) {


        boolean d = false;
        String result = "";
        for(String[] info :db) {
            d = Arrays.deepEquals(id_pw, info);   //비번이 틀렸을 경우 조건이 안맞음. (이차원배열 확인)
        }
        if(d ==true){
            System.out.println("로그인");
            result = "login";
        }else{
            for(int i = 0; i<db.length; i++) {
                //if(id_pw[0]  == db[i][0] && id_pw[1]  == db[i][1]){
                if(id_pw[0]  == db[i][0]){
                    if(id_pw[1] != db[i][1]) {
                        System.out.println("비번 틀림");
                        result = "wrong_pw";
                    }
                }

            }
            if(!result.equals("login") && !result.equals("wrong_pw")){
                result ="fail";
                System.out.println("fail");
            }


            //코드를 간단하게 하고싶어서 배열 확인 함수를 이용해서 비교하려고 했음
            // Arrays.deepEquals(); 이차원배열 비교 함수, Arrays.Equals(id_pw,db); 일차원 비교 함수
            // 로그인 성공 ,실패는 아이디 비번 deepEquals로 확인하고
            //  잘못된 비밀번호 확인 여부는 info에 일차원 배열로 디비에 있는 아이디 비번을 넣고
            //일차원 배열 비교 함수로 다시 비교하려고 했음 근데  별 다르지않는 로직이어서 포기함

//        String result = "";
//        for(int i= 0; i< db.length; i++){
//            String [] info = {db[i][0] , db[i][1]};
//            Arrays.deepEquals(id_pw,db);   //비번이 틀렸을 경우 조건이 안맞음. (이차원배열 확인)
//            System.out.println(Arrays.deepEquals(id_pw,info) +"<<");
//            System.out.println(Arrays.toString(id_pw));
//            System.out.println(Arrays.toString(info));
//            if(Arrays.deepEquals(id_pw,db) == true){
//                result = "fail";
//                System.out.println(result);
//                if(id_pw[0] == info[0] && id_pw[1] != info[1]){
//                    result =  "wrong pw";
//                    System.out.println(result);
//                }
//            }
//
//        }





//        for(int i = 0; i<db.length; i++) {
//            if(id_pw[0]  == db[i][0]){
//                if(id_pw[1] == db[i][1]){
//                    result = "login";
//                }else{
//                    if(result.contains("login")){
//                    }else{
//                        result = "wrong pw";
//                    }
//
//                }
//            }else if(result != "login" && result != "wrong pw"){
//                result = "fail";
//            }
//        }


           }




    }
}
