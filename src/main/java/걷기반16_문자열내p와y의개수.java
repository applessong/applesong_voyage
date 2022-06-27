public class 걷기반16_문자열내p와y의개수 {
    boolean solution1(String s) {
        boolean answer = true;
        int pCount = 0;
        int yCount = 0;
        for (int i = 0 ; i < s.length() ; i++){
//                              문자열의 길이를 반환하는 메소드는 length뒤에 ()를 붙여준다
//                              ()없으면 배열의 길이를 반환해주는 메소드라서 작동안함
            if ("p".equals(s.charAt(i)+"") || "P".equals(s.charAt(i)+"")){
//                 .equals메소드는 문자열(str)비교후 동일하면 true로 반환하는 메소드
//                 근데 .charAt()은 문자열(str)의 특정번째 글자를 문자(char)로 반환함
//                 그래서 .charAt()으로 문자로 추출 후 +"" 을 통해서 문자열로 다시 변환해줌
                pCount += 1;
            } else if ("y".equals(s.charAt(i)+"") || "Y".equals(s.charAt(i)+"")){
                yCount += 1;
            }
        }

//        다른방법1 s.toLowerCase()로 대문자를 모두 소문자로 치환한 후 "p".equals조건식만 돌린다. (Upper는 대문자)
//        다른방법2 문자열을 s.split("");으로 쪼개서 배열에 담은 후 for문에서 charAt이 아니라 아예 배열로 돌려돌려한다
//        두가지를 합친다


        if (pCount == yCount){
            answer = true;
        } else {
            answer = false;
        }
        return answer;
    }

    public static void main(String[] args){
        걷기반16_문자열내p와y의개수 Solution = new 걷기반16_문자열내p와y의개수();
        String s = "ppppyyyYy";

        System.out.println(Solution.solution1(s));
    }

}
