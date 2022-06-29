package algorithm;

public class 걷기반21_이상한문자만들기{
    public String solution1(String s) {
        String answer = "";

        char[] s_Char = s.toUpperCase().toCharArray();
//        문자열 s를 단일문자배열 s_Char에 대문자화해서 담아줌

        boolean a = true;
//        짝수홀수 체크가 아니라 true false를 번갈아가면서 적용
//        경우의 수가 2개밖에 없기때문에 가능한 방법

        for( int i = 0 ; i < s_Char.length ; i++) {
            a = (s_Char[i] == ' ') ? true : !a;
//            s_Char 의 내용물이 ' '(스페이스한칸)이면 트루, 그게 아니라면 for문 앞전바퀴에 반댓값(초기값이 true니까 0번재 인덱스는 false, 1번째 인덱스는 다시 true)

            if( a == true ) {    // 불린값이 for문에 의해서 a -> !a -> a -> !a로 계속 바뀌는중
                                 // ' ' (스페이스한칸)일땐 a로 바꾸고 그 다음에선 다시 -> !a -> a 순서
                                 // 초기값이 ture이므로 a!는 false
                s_Char[i] = Character.toLowerCase(s_Char[i]);
//                              a인 상태일때 소문자로 치환함 ( !a 일땐 대문자를 그대로 유지 )
            }
        }

        for( int i = 0 ; i < s_Char.length ; i++){
            answer += s_Char[i] + "";
        }
//        s_Char의 각 인덱스값을 다시 문자열로 바꿔서 answer에 적재

        return answer;
    }




    public static void main(String[] args){
        걷기반21_이상한문자만들기 Solution = new 걷기반21_이상한문자만들기();

        String s = "try hello world";

        System.out.println(Solution.solution1(s));
    }
}
