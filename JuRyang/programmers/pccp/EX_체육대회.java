package JuRyang.programmers.pccp;

import java.util.*;

public class EX_체육대회 {

    /**
     * 당신이 다니는 학교는 매년 체육대회를 합니다. 체육대회는 여러 종목에 대해 각 반의 해당 종목 대표가 1명씩 나와 대결을 하며,
     * 한 학생은 최대 한개의 종목 대표만 할 수 있습니다. 당신의 반에서도 한 종목당 1명의 대표를 뽑으려고 합니다.
     * 학생들마다 각 종목에 대한 능력이 다르지만 이 능력은 수치화되어 있어 미리 알 수 있습니다.
     * 당신의 반의 전략은 각 종목 대표의 해당 종목에 대한 능력치의 합을 최대화하는 것입니다.
     * <p>
     * 다음은 당신의 반 학생이 5명이고, 종목의 개수가 3개이며,
     * 각 종목에 대한 학생들의 능력치가 아래 표와 같을 때, 각 종목의 대표를 뽑는 예시입니다.음은 당신의 반 학생이 5명이고,
     * 종목의 개수가 3개이며, 각 종목에 대한 학생들의 능력치가 아래 표와 같을 때, 각 종목의 대표를 뽑는 예시입니다.
     * <p>
     * <p>
     * 테니스	탁구	수영
     * 석환	40	    10	10
     * 영재	20	    5	0
     * 인용	30	    30	30
     * 정현	70	    0	70
     * 준모	100	    100	100
     */


    public static int solution(int[][] ability) {
        int answer = 0;


        // 각 종목당 한명씩 중복이 되면 안됨

        int max = 0;
        int size = 0;
        TreeMap<String, Integer> list = new TreeMap<>();
        Map<Integer, Integer> sum = new HashMap<>();
        for (int i = 0; i < ability.length; i++) {

            size = ability[i].length; // 3 [40, 10, 10]

            for (int j = 0; j < ability[i].length; j++) {
                // list.put(i+","+j, ability[i][j]);
                list.put(i + "" + j, ability[i][j]); // 인당 1종목이기 때문에  같은 사람임을 구분하기 위해 i번지로 앞에 구분시킴

            }

            System.out.println(list.entrySet());

        }








        int y = 0;
        List keyInfo = new ArrayList(list.keySet());
        ArrayList<Integer> ddd = new ArrayList();


        for (int i = 0; i < keyInfo.size(); i++) {
            Set keyList = new TreeSet();
            keyList.add(keyInfo.get(i));

            for ( int j =  size; j < keyInfo.size(); j++) {
                String a = (String) keyInfo.get(j+1);
                String b = (String) keyInfo.get(j);
                keyList.add(keyInfo.get(j));

                if (keyList.size() == size) {
                    int summ =0;

                    System.out.println(size);

                    keyList.contains(((String) keyInfo.get(j)).charAt(0));

                for (Object k: keyList) {
                    if (a.charAt(0) != b.charAt(0) && a.charAt(1) != b.charAt(1)) {

                        //  summ = list.get(keyInfo.get(i)) +  list.get(keyInfo.get(j));
                        //ddd.add(summ);
                        //keyList.add(keyInfo.get(k));
                        // String b = (String) keyInfo.get(j);
                        //keyList.put(b.charAt(1),keyInfo.get(j));
                        //keyList.put(a.charAt(1),keyInfo.get(i));

                        summ += list.get(k);
                        System.out.println("key list : "+ keyList);

                        System.out.println("summ: "+ summ);
                        ddd.add(summ);

/*
                            int summ = 0;

                            for ( Object d : keyList) {
                                System.out.println("Object: " + d);
                                System.out.println("list.get(d): " + list.get(d));


                                summ += list.get(d);
                                System.out.println("summ: "+ summ);
                                ddd.add(summ);
                                //    System.out.println(ddd);

                                if(summ == 300){
                                    System.out.println("key list : "+ keyList);
                                }

                            }

                            */
                    }
                    }

                }



            }
        }

        Collections.sort(ddd, Collections.reverseOrder());

        answer = ddd.get(0);

            System.out.println(ddd + "<><<<");
        //System.out.println(Arrays.sort(keyList));


        System.out.println(answer);

        return answer;
    }


    //같은 사람인지 구분하기 위한 체크 함수

/*
    public static boolean chk(String key, String key2,String key3){

        boolean result = false;
        char firstChara=  key.charAt(0);
        char firstChara2=  key.charAt(0);
        char firstChara3=  key.charAt(0);

        int a = firstChara;
        int b = firstChara2;
        int c = firstChara3;

        if(key.charAt(0) ==  key2.charAt(0) || key2.charAt(0) == key3.charAt(0)||key.charAt(0) == key3.charAt(0)){
            result = true;
        }
        return result;
    }
*/
    public static boolean chk2(String key, String key2) {

        boolean result = false;
        char firstChara = key.charAt(0);
        char firstChara2 = key.charAt(0);

        if (key.charAt(0) == key2.charAt(0)) {
            result = true;
        }

        return result;
    }


    public static void main(String[] args) {
        int[][] input = {{40, 10, 10},
                            {20, 5, 0},
                            {30, 30, 30},
                            {70, 0, 70},
                            {100, 100, 100}};
        //int [][] input = {{20, 30}, {30, 20}, {20, 30}};
        // String input="eeddee";
        solution(input);
        //solution2(input);

    }

}
