public class 걷기반19_수박수박수박수박수박수 {
    public String solution1(int n) {
        String answer = "";
        String su = "수";
        String bak = "박";
        for ( int i = 0 ; i < n ; i++){
            if( i % 2 == 0 ){
                answer += su;
            } else{
                answer += bak;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        걷기반19_수박수박수박수박수박수 Solution = new 걷기반19_수박수박수박수박수박수();

        int n = 3;

        System.out.println(Solution.solution1(n));
    }
}
