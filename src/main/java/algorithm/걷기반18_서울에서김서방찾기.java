package algorithm;

public class 걷기반18_서울에서김서방찾기 {
    public String solution1(String[] seoul) {
        String answer = "";
        String x = "";
        for ( int i = 0 ; i < seoul.length ; i++){
            if(seoul[i].equals("Kim")){
                x = i+"";
            }
        }
        answer = "김서방은 " + x + "에 있다";
        return answer;
    }


    public static void main(String[] args){
        걷기반18_서울에서김서방찾기 Solution = new 걷기반18_서울에서김서방찾기();
        String[] seoul = {"Jane", "Kim"};

        System.out.println(Solution.solution1(seoul));
    }
}
