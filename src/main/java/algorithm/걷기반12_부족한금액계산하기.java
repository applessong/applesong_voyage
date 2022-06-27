package algorithm;

public class 걷기반12_부족한금액계산하기 {
        public long Solution(int price, int money, int count) {
            long answer = -1;
            long price_now = 0;
//이부분 처음
            for ( int i = 0 ; i < count+1 ; i++ ){
                price_now += price * i;
                if ( price_now > money ){
                    answer = price_now-money;
                } else {
                    answer = 0;
                }
            }
            return answer;
        }


//        public long solution(long price, long money, long count) {
//            return Math.max(price * (count * (count + 1) / 2) - money, 0);
//        }
//        이거슨 좋아요가 제일 많이 달린 코드.....
//    math 메서드를 알고있어야 풀수있다.....ㅋㅋㅋㅋㅋㅋ math.max가 애초에 조건확인(더 큰수)후 반환하기때문에 더 조건문이 필요가 없다....
//    거기다가 for문없이 (price * (count * (count + 1) / 2)ㅋㅋㅋㅋㅋㅋㅋㅋ 이거 뭔데 등차수열인가 뭔가하는 계산법인데
//    나같은 예체능충에게는 처음들어보는 공식이다....ㅋㅋㅋㅋㅋㅋㅋ 퍄 기본 수학지식이 부족하니까 아쉬운부분이 있넹
//    가우스계산법과 방식은 비슷한거같은데, 살짝 이해안되는부분도 있당...


    public static void main(String[] args) {
        걷기반12_부족한금액계산하기 m = new 걷기반12_부족한금액계산하기();
        int price = 3;
        int money = 20;
        int count = 4;
        System.out.println(m.Solution(price, money, count));
    }
}
