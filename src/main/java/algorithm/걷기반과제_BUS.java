package algorithm;


import java.util.Scanner;

class 걷기반과제_BUS {
    boolean operate;
    int passneger;
    int charge;
    int speed;
    int fuel;
    int maxpassnger;

    private static int busNum = 1000;

//    // 유일한 인스턴스 생성
//    private static 걷기반과제_BUS instance = new 걷기반과제_BUS();
//
//    // 유일한 생성자 구현
//    private 걷기반과제_BUS() { }
//
//    // 외부에서 접근 가능한 getter 메서드 구현
//    public static 걷기반과제_BUS getInstance() {
//        if( instance == null) {
//            instance = new 걷기반과제_BUS();
//        }
//        return instance;
//    }
//
//    // 버스를 만들어주는 메서드
//    // Car 객체를 데이터타입으로 지정해주어서 해당 메서드에서 인스턴스가 생성되게 함
//
//    public 걷기반과제_BUS createbus() {
//        걷기반과제_BUS bus = new 걷기반과제_BUS();
//        return bus; // 반환값은 인스턴스를 반환할 수 있도록 함
//    }


//  버스 고유번호 생성 메서드 시작//
// 인스턴스가 새로 생성될 때마다 static 변수 carnum의 값이 1씩 상승함
    public int getBusNum() {
        busNum++;
        return busNum;
    }
//  버스 고유번호 생성 메서드 종료//


//  기름 양 확인 후 운행여부 실행 메소드 시작//
    public boolean now_fuel (int fuel) {
        this.operate = true;
        if ( this.fuel <= 0 ){
            this.operate = false;
        }
        System.out.println(this.operateSituation(this.operate, this.fuel));
        return this.operate;
    }
//  기름 양 확인 후 운행여부 확인 메소드 종료//


//  운행 여부와 연료량 부족메세지송출 메소드 시작//
    public String operateSituation(boolean operate, int fuel) {
        String answer = "";
        if ( this.operate == true ){
            if ( this.fuel >= 10) {
                answer = "정상운행중입니다.";
            }
            else if ( 10 > this.fuel && this.fuel >0){
                answer = "연료가 부족합니다.";
            }
        } else if ( this.operate == false ){
            answer = "연료 부족으로 운행을 종료합니다.";
        }
        return answer;
    }
//  운행 여부와 연료량 부족메세지송출 메소드 종료//

//  연령 확인 후 요금 책정 메서드 시작//
    public int chargeFromAge(){
        System.out.printf("탑승객의 나이를 입력해주세요  >>  ");
        Scanner scanner = new Scanner(System.in);
        int ageScanner = scanner.nextInt();
        this.charge = ageScanner;
        if ( this.charge <= 7 ){
            System.out.println("미취학 아동은 무료 탑승이 가능합니다.");
        } else if (this.charge <= 13){
            System.out.println("초등학생의 요금은 5메소 입니다.");
        } else if (this.charge <= 20){
            System.out.println("청소년의 요금은 8메소입니다.");
        }else if (this.charge <= 65){
            System.out.println("일반 성인의 요금은 12메소입니다.");
        }else{
            System.out.println("경로우대 요금은 8메소입니다.");
        }
        return this.charge;
    }
//  연령 확인 후 요금 책정 메서드 종료//

//  승객탑승 메서드 시작//
    public int passengerBoarding(){
        if (this.operate == true) {          //operate(운행여부)가 true일때만 승객탑승가능
            if( this.passneger <= this.maxpassnger ) {      //승객 수가 45명(최대승객수) 이하일때만 추가로 탑승 가능
                this.chargeFromAge();
                ++this.passneger;
            } else {
                System.out.println("탑승가능 인원 초과로 탑승이 불가능합니다.");
            }
        } else {
            System.out.println("운행중 중지 된 버스이므로 탑승이 불가능합니다.");
        }
        System.out.println("현재 승객 수는 "+this.passneger+"입니다.");
        return this.passneger;
    }
//  승객탑승 메서드 종료//


////  탑승 승객 수 확인 메서드 시작//
//    public void checkPassenger(){
//        System.out.println("현재 승객 수는 "+this.passneger+"입니다.");
//    }
////  탑승 승객 수 확인 메서드 종료//       금액 확인과 승객수 체크 한번에 합쳐버림


//  속도변경 메서드 시작//
    public int transeSpeed(){
        if ( this.operate == true) {
            System.out.printf("주행하실 속도를 입력해주세요  >>  ");
            Scanner scanner = new Scanner(System.in);
            int speedScanner = scanner.nextInt();
            this.speed = speedScanner;
        }
        return this.speed;
    }
    public void CheckSpeed(){
        System.out.println("현재 운행 속도는"+this.speed+"입니다.");
    }
//  속도변경 메서드 종료//




    public static void main(String[] args){
        걷기반과제_BUS bus = new 걷기반과제_BUS();
        bus.getBusNum();
        bus.maxpassnger = 45;
        System.out.println("버스 번호 : "+bus.busNum);
        bus.fuel = 50;           //연료량 입력
        bus.now_fuel(bus.fuel);//연료량을 대입해서 운행여부 판단하기
        bus.transeSpeed();
        bus.CheckSpeed();
//
        bus.passengerBoarding();
        bus.passengerBoarding(); //승객탑승메서드 호출


        System.out.println();

        걷기반과제_BUS bus1 = new 걷기반과제_BUS();
        bus1.getBusNum();
        bus1.maxpassnger = 25;
        System.out.println("버스 번호 : "+bus1.busNum);
        bus1.fuel = 5;           //연료량 입력
        bus1.now_fuel(bus1.fuel);//연료량을 대입해서 운행여부 판단하기
        bus1.transeSpeed();
        bus1.CheckSpeed();

        bus1.passengerBoarding();
        bus1.passengerBoarding();
        bus1.passengerBoarding();
        bus1.passengerBoarding();
        bus1.passengerBoarding(); //승객탑승메서드 호출
    }

}
