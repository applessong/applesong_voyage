public class 걷기반13_2016년  {
    public String solution(int a, int b) {
        String answer = "";
        String day[] = {"THU","FRI","SAT","SUN","MON","TUE","WED"};
//        2016년 1월1일이 FRI에 들어가는데, THU부터 시작하는 이유는 1월1일의 day_count값은 1이고,
//        이를 %7하면 1인데, 이 값을 인덱스값에 적용하면 day[1]이기때문에 맞음!!
//        day_count % 7 -1도 해봤는데, 만약 14일이라면 0이 된후 -1이 적용되서 day[-1]인덱스값이 적용되서 오류가 발생

        int[] month_length = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int day_count = 0;
        for ( int i = 0 ; i < a-1 ; i++ ){
            day_count += month_length[i];
        }
        day_count += b;
        answer = day[day_count % 7];
        return answer;

//        day_count % 7 한 값이 0이면 day의 마지막 인덱스를 대입하는 if문도 괜찮을듯...?
//        아래에 실험해봐씀~_~ 근데 의미없는거같다
//        날짜관련 메서드를 쓰기전까진 식을 바꿀방법이 없을듯

//        String answer = "";
//        String day[] = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
//        int[] month_length = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//        int day_count = 0;
//        for ( int i = 0 ; i < a-1 ; i++ ){
//            day_count += month_length[i];
//        }
//        day_count += b;
//        day_count %= 7;
//        if (day_count == 0){
//            answer = day[6];
//        } else {
//            answer = day[day_count-1];
//        }
//        return answer;
    }

    public static void main(String[] args) {
        걷기반13_2016년 S = new 걷기반13_2016년();
        int a = 2;
        int b = 7;

        System.out.println(S.solution(a,b));
    }
}
