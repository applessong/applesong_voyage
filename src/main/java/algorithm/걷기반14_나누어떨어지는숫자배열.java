package algorithm;

import java.util.ArrayList;
import java.util.Arrays;

public class 걷기반14_나누어떨어지는숫자배열 {

    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        ArrayList<Integer> list1 = new ArrayList<Integer>();

    for ( int i = 0 ; i < arr.length ; i ++ ) {
        if (arr[i] % divisor == 0) {
            list1.add(arr[i]);
        }
    }

//    if


//ArayyList메서드       list1.isEmpty   -    list1배열의 배열길이가 0일 경우에 (선언 이후 list1.length가 0으로 초기화 된 상태빈 배열)) ture값 반환
//문자열메서드           srt.isEmpty     -    문자열 str이 null(선언만한상태),빈값(선언과초기화까지항상태)일 때 true값 반환, 공백 혹은 문자열이 포함 될시에 true값 반환
//문자열메서드           str.isBlank     -    문자열 str이 null(선언만한상태),빈값(선언과초기화까지항상태),공백(space)일 경우 true값 반환함

    answer = new int[1];
    answer[0] = -1;
    return answer;
    }
    public static void main(String[] args) {
        걷기반14_나누어떨어지는숫자배열 S = new 걷기반14_나누어떨어지는숫자배열();
        int[] arr = {5, 9, 7, 10};
        int divisor = 5;

        System.out.println(Arrays.toString(S.solution(arr, divisor)));
//                (S.solution(int[] arr, int divisor));

    }
}
