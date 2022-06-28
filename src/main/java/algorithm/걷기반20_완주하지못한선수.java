package algorithm;
import java.util.*;
public class 걷기반20_완주하지못한선수 {

    public String solution1(String[] participant, String[] completion) {
        String answer = "23";        // 1. 두 배열을 정렬한다
        Arrays.sort(participant);
        Arrays.sort(completion);

        int i = 0;
        for( i = 0 ; i < completion.length ; i++ ) {

            if (!participant[i].equals(completion[i])) {
                return participant[i];
            }

        }
        return participant[i];
    }


//        return participant[i];

//    public String solution1(String[] participant, String[] completion) {
//        String answer = "";
//
//        ArrayList<String> unCompletion = new ArrayList<String>();
//        ArrayList<String> participantP = new ArrayList<String>();
//
//        for (int i = 0 ; i < participant.length ; i ++ ){
//            unCompletion.add(participant[i]);
//        }
//        for (int i = 0; i < completion.length ; i ++ ){
//            participantP.add(completion[i]);
//        }
//
//
//        unCompletion.removeAll(participantP);
//        answer = unCompletion.toString();
//
//        return answer;
//
//    }
//    public String solution2(String[] participant, String[] completion) {
//        String answer = "";
//
//        return answer;
//    }
//                  실패해버린solution1........반환타입이 List로 나와서 []괄호안에 들어가는것도문제고
//                  동명이인의 경우는 둘중 하나만 완주자로 처리해서 삭제하지않고 둘다 삭제해버리니까 쉣망했음

    public static void main(String[] args){
        걷기반20_완주하지못한선수 S = new 걷기반20_완주하지못한선수();

        String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion = {"josipa", "nikola", "filipa", "marina"};
        System.out.println(S.solution1(participant,completion));

    }
}
