package algorithm;
import java.util.*;
public class 걷기반26_제일작은수제거하기 {
    public int[] solution2(int[] arr) {

        int[] temp = arr.clone();
        Arrays.sort(temp);
        int min = temp[0];
//        배열을 복사해와서 정렬, min값을 정의해줌
//        정렬했기때문에 0번째 인덱스가 가장 작은 값

        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != min) {
                list.add(arr[i]);
            }
        }
        //ArrayList를 이용하여 최솟값과 같지 않은 수만 추가

        int[] answer;
//        리턴값 선언만 해놓기

        if(list.size() == 0) {
            answer = new int[1];
            answer[0] = -1;
//            list의 길이가 0이라면 answer의 인덱스값을 1로 초기화 해주고, -1을 넣어줌
        } else {
            answer = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                answer[i] = list.get(i);
            }
//            list에 값이 존재한다면, answer의 i번째 인덱스에 list의 동일 인덱스번호에 있는 값을 넣어줌
        }

        return answer;
    }


//
//    public int[] solution1(int[] arr) {
//        int[] answer;
//        int[] arr1 = new int[arr.length];
//        for(int i = 0; i < arr.length; i++) {
//            arr1[i] = arr[i];
//        }
//
//        Arrays.sort(arr1);
//        int min = arr1[0];
//        List<int[]> arrList2 = Arrays.asList(arr);
//        arrList2.remove(min);
//
//        return answer;
//    }
//       아 진자 타입변환 모르겠네 ㅡ ㅅㅡ 컬렉션프레임웤 빨리 배워야 전환을 할듯
//      대체 내가 쓴 List는 왜 리턴값으로 안받아주는건지 모르겠다......


    public static void main(String[] args){
        걷기반26_제일작은수제거하기 Solution = new 걷기반26_제일작은수제거하기();

        int[] arr = {4, 3, 2, 1};

        System.out.println(Arrays.toString(Solution.solution2(arr)));
//                      return값이 배열일때, 출력하려면 Arrays.toString써야함
    }

}