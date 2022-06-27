package algorithm;

public class 걷기반17_문자열다루기기본 {
    public boolean solution1(String s) {
        boolean answer = true;
        answer = (s.length() == 4 || s.length() == 6 ) && s.matches("^[0-9]*$");

        return answer;
    }
    public static void main(String[] args){
        걷기반17_문자열다루기기본 Solution = new 걷기반17_문자열다루기기본();

        String s = "123423";

        System.out.println(Solution.solution1(s));
    }
}
