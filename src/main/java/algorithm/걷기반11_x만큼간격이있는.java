package algorithm;

import java.util.Arrays;

public class 걷기반11_x만큼간격이있는 {
        public long[] solution(int x, int n) {
            long[] answer = new long[n];

            for ( int i = 0 ; i < n ; i++ ){
//                i < 5가 false가 될때까지 i를 계속 1씩 더함
//                i가 5일때는 실행되지 않음
//                0,1,2,3,4 총 5번 실행
                answer[i] = (long)x * (i+1);
//                i가 0일때 그대로 쓰면 answer 첫번째 인덱스가 0이 되므로 1을 더해준 후 x를 곱해 x의 배수로 만들어준다
//                그리고 그 값을 i번째(0번째)인덱스에 넣어준다
            }
            return answer;

        }

    public static void main(String[] args) {
        걷기반11_x만큼간격이있는 S = new 걷기반11_x만큼간격이있는();
        int x = 2;
        int n = 5;

        System.out.println(Arrays.toString(S.solution(x,n)));
    }
}
