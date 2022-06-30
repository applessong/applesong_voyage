package algorithm;

import java.util.Arrays;

public class 걷기반23_자연수뒤집어배열로만들기 {


    public int[] solution1(long n) {
        String n_str = Long.toString(n);
        int[] answer = new int[n_str.length()];
//        문자열의 길이만큼 answer배열의 길이 지정


//        String[] n_str_arr = n_str.split("");
//        String[] n_str_reverse = new String[n_str_arr.length];
//
//        for ( int i = 0 ; i < n_str_arr.length ; i++ ) {
//            for ( int j = n_str_arr.length ; j--){
////              answer[i] = Integer.parseInt(n_str_arr[j]
//             }
////        }
//        이건 문자열로 바꿔서 이중 for문으로 문자열 마지막 인덱스를 answer 첫번째 인덱스로 넣는걸로
//        시작해서 문자열 첫 인덱스를 answer 마지막 인덱스에 넣는 식인데
//        어째서인지 형변환이 똑바로 안되서 실패해따......어려워 타입변경 ㅠㅠ


        for ( int i = 0 ; i < n_str.length() ; i++ ) {
                answer[i] = n_str.charAt(n_str.length()-1-i) -'0';
            }
//        문자열의 길이만큼 for문 실행
//        answer 0에 n_str의 4번인덱스를 넣어줌. -'0';은 형변환
//        charAt메소드 안에 있는 내용은, 문자열길이가 5고, 마지막 인덱스가 4니깐
//        -1을 해서 4를 만들어주고, 다음 바퀴엔 3을 만들어주기 위해 -i를 빼줌
//        (첫바퀴i=0,두바퀴i=1,세바퀴i=2)

        return answer;
    }

    public static void main(String[] args){
        걷기반23_자연수뒤집어배열로만들기 Solution = new 걷기반23_자연수뒤집어배열로만들기();

        long n = 12345;

        System.out.println(Arrays.toString(Solution.solution1(n)));
    }

}
