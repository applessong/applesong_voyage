public class 걷기반09_핸드폰번호가리기 {

    public String Solution1(String number) {
        String answer = "";
        String aa = "";
        for( int i = 0; i <(number.length()-4) ; i++){
            aa+= "*";
        }
        String cc = number.substring(number.length()-4);

        answer = aa+cc;
        return answer;
    }

//      별찍기로 number의 길이-4 만큼 별을 찍어준 후, number의 뒷 4자리만 더해주는 방법


    public String Solution2(String number) {
        return number.substring(0, number.length()-4).replaceAll("[0-9]", "*")
                + number.substring( number.length()-4);
    }
//        정규표현식과 replaceAll함수를 이용한 문자, 문자열을 치환해주는 방법




    public static void main(String[] args){
        걷기반09_핸드폰번호가리기 Solution = new 걷기반09_핸드폰번호가리기();
        String number = "01023263565";

        System.out.println(Solution.Solution1(number));
    }


}
