package JuRyang.sss;

import java.util.*;

public class EntrySet {
    /**
     * 컬렉션 프레임워크
        List -> 순서 O, 중복 O (ArrayList, LinkedList, Stack, Vector ...)
        Set  -> 순서 X, 중복 X (HashSet, TreeSet..)
        Map  -> 순서 X  키는 중복을 허용하지 않고 값은 중복 허용한다 key, value
                (HashMap, TreeMap , Hashtable, properties 등)

     Map 인터페이스
     키(key)와 값(value) 하나의 쌍으로 묶어서 저장하는 컬렉션 클래스
     기존에 저장된 데이터와 중복된 키와 값을 저장하면 기존의 값은 없어지고 , 나중에 저장된 값이 남음

     Set keySet()   : Map에 저장된 모든 key객체를 반환한다.
     Set entrySet() : Map에 저장되어 있는  key-value쌍을 Map.Entry타입의 객체로 저장한 set으로 반환한다.
     */
    public static void main(String[] args) {
//        Map<String, Object> map = new HashMap<String, Object>();
//        map.put("a","aa");
//        map.put("b","bb");
//        map.put("c","cc");

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(1,10);
        map.put(2,20);
        map.put(3,30);

//        System.out.println("map : "+ map); //a=aa, b=bb, c=cc}
//        System.out.println("map key : "+ map.keySet()); //[a, b, c]
//        System.out.println("map value : "+ map.values());//[aa, bb, cc]
        System.out.println("entrySet()함수---------------------------------------------");

        //entrySet()함수를 사용해서 Map의 전체 key value를 꺼냄
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            System.out.println("key : " +entry.getKey() + " ,  value: " +entry.getValue());
        }

        System.out.println("keySet()함수---------------------------------------------");

        for (Integer mapKey:map.keySet() ) {
            System.out.println("key : " +mapKey+ " ,  value : "+map.get(mapKey));
        }
        System.out.println("=================================================");
        Iterator<Map.Entry<Integer, Integer>> info = map.entrySet().iterator();

        while (info.hasNext()){
            Map.Entry<Integer, Integer> list = info.next();
            Integer key = list.getKey();
            Object value = list.getValue();
            System.out.println("key : " +key + " ,  value: " +value);


        }

        Map<Integer, String> map2 = new HashMap<Integer, String>();
        map2.put(1, "value01");
        map2.put(2, "value02");
        map2.put(3, "value03");
        map2.put(4, "value04");
        map2.put(5, "value05");

        System.out.println("entrySet().iterator()함수---------------------------------------------");
        Iterator<Map.Entry<Integer, String>> list = map2.entrySet().iterator();
        while (list.hasNext()){
            Map.Entry<Integer,String> entry = (Map.Entry<Integer,String> )list.next();
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println("key : " +key+ " ,  value : "+map2.get(key));


        }


        System.out.println("keySet().iterator()함수---------------------------------------------");
        Iterator<Integer> ite = map2.keySet().iterator();
        while (ite.hasNext()){
            Integer key = ite.next();
            String value = map2.get(key);
            System.out.println("key : " +key+ " ,  value : "+map2.get(key));

        }

        System.out.println("===================");



        List<Integer> keySet = new ArrayList<>(map.keySet());
        Collections.sort(keySet, (o1, o2) -> (map.get(o2).compareTo(map.get(o1))));
        System.out.println(keySet+"keySet2");
        for(int i = 1; i < map.size(); i++){
            System.out.println("dddddddddd>>"+keySet.get(i));
        }

        List<Integer> keySet2 = new ArrayList<>(map.keySet());
        Iterator<Integer> ite2 = map.keySet().iterator();
        while (ite2.hasNext()){
            Integer key = ite2.next();
            Integer value = map.get(key);
           // System.out.println("key : " +key+ " ,  value : "+map.get(key));
            keySet2.add(value);
//            System.out.println(map.get(key)+" : map.get(key)");

        }
        Collections.sort(keySet2, (o1, o2) -> (map.get(o2).compareTo(map.get(o1))));
        System.out.println(">_<"+keySet2);
//
//        System.out.println("**keySet2 : " +keySet2);
//        for(Map.Entry<Integer, Integer> entry : map.entrySet().){
//            keySet2.add(entry.getValue());
//        }
//        System.out.println("keySet2 : " +keySet2);



        System.out.println(keySet+"11keySetkeySetkeySetkeySet");

        //  Collections.sort(keySet, (o1, o2) -> (map.get(o2).compareTo(map.get(o1))));
        System.out.println(keySet+"keySetkeySetkeySetkeySet");


    }
}
