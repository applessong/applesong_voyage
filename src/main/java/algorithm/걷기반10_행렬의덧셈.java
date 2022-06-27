package algorithm;

import java.util.Arrays;

//오ㅓ......2차원이상배열쓰니까 자동으로 임포트문 적어줌;; 쩐다;ㅇ;;

public class 걷기반10_행렬의덧셈 {

    public int[][] Solution(int[][] arr1, int[][] arr2) {


        int[][] answer = new int[arr1.length][arr1[0].length];

        for ( int i = 0 ; i < arr1.length ; i++){
            for ( int j = 0 ; j < arr1[0].length ; j++){
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return answer;


//이건 좋아요 젤 많이 달려있던 풀이!!
//        public int[][] solution(int[][] arr1, int[][] arr2) {
//            int[][] answer = {};
//            answer = arr1;
//     answer에다가 arr1을 넣어버림 ㅋㅋㅋㅋㅋㅋ 신박하네!!
//     answer에다가 arr1 그냥 넣어버림으로써 내가 8행에서 실행했던 answer의 2차원배열의 갯수를 그냥 편안~하게 맞춰버림
//            for(int i=0; i<arr1.length; i++){
//                for(int j=0; j<arr1[0].length; j++){
//                    answer[i][j] += arr2[i][j];
//     여기도 이미 answer에다가 arr1을 더해놨기때문에, 나처럼 arr1+arr2이 아니라, arr1 그 자체에 arr2를 가산대입해벌임;; 진짜 사람들 너무 똑똑하다 나만멍청해 8ㅁ8
//                }
//            }
//            return answer;
    }


    public static void main(String[] args){
        걷기반10_행렬의덧셈 S = new 걷기반10_행렬의덧셈();
//        행렬더하기라는 타입의 변수(참조변수)선언, Solution은 변수명.= 뒷부분은 행렬더하기 class를 쓰는 인스턴스를 생성하겠다
//        앞의 행렬더하기와 뒤의 행렬더하기는 그 내용이 다르다.
        int[][] arr1 = {{1,2},{3,4}};
        int[][] arr2 = {{5,6},{7,8}};
        System.out.println(Arrays.deepToString(S.Solution(arr1,arr2)));
//                                             >>[S]:35행에서 선언한 변수명.[Solution]:행렬더하기class안에서 선언한 Solution메서드
// 2개의 행렬을 메서드로 보내서 계산해와서, 다시 하나의 행렬(answer)로 출력하는 식...... 저 Arrays.deepToString식의 순서를 몰라서 한참 헤멨다.
//        바보같이 System.out.println(S.Solution(Arrays.deepToString(arr1,arr2)));    <<<<이렇게 쓰고있었다 ㅋㅋㅋㅋㅋㅋ
//                                 변수명.메서드명
    }

}
