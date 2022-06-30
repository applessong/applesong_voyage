package algorithm;

public class 알고리즘테스트_자연수뒤집어더하기 {
    public String solution(int n) {
        String answer = "";

        int length = Long.toString(n).length(); //(1)
        int[] reverse = new int[length];
        for (int i = 0; i < length; i++) {
            reverse[i] = (int) (n % 10); //(2)
            n /= 10; //(3)
        }
        String reverseStr="";
        int total = 0;
        for ( int i = 0; i < reverse.length-1 ; i++ ){
            reverseStr += reverse[i]+"+";
        }
        for ( int i = 0; i < reverse.length ; i++ ){
            total += reverse[i];
        }
        reverseStr += reverse[reverse.length-1]+"="+total;
        answer = reverseStr;
        return answer;

    }

    public static void main(String[] args) {
        알고리즘테스트_자연수뒤집어더하기 method = new 알고리즘테스트_자연수뒤집어더하기();
        System.out.println(method.solution(718253));
    }
}