package algorithm;


import java.util.Scanner;

class 걷기반과제_BUS {
    boolean operate;
    String operateSituation;
    int passneger;
    int charge;
    int speed;
    int fuel;

    private static int busNum = 1000;

    // 유일한 인스턴스 생성
    private static 걷기반과제_BUS instance = new 걷기반과제_BUS();

    // 유일한 생성자 구현
    private 걷기반과제_BUS() { }

    // 외부에서 접근 가능한 getter 메서드 구현
    public static 걷기반과제_BUS getInstance() {
        if( instance == null) {
            instance = new 걷기반과제_BUS();
        }
        return instance;
    }

    // 차를 만들어주는 메서드
    // Car 객체를 데이터타입으로 지정해주어서 해당 메서드에서 인스턴스가 생성되게 함

    public 걷기반과제_BUS createbus() {
        걷기반과제_BUS bus = new 걷기반과제_BUS();
        return bus; // 반환값은 인스턴스를 반환할 수 있도록 함
    }
    // 차 고유번호 생성 메서드
    // 인스턴스가 새로 생성될 때마다 static 변수 carnum의 값이 1씩 상승함
    public int getBusNum() {
        busNum++;
        return busNum;
    }

//   기름 양 확인 후 운행여부 실행 메소드 시작//
    public boolean now_fuel (int fuel) {
        this.operate = true;
        if ( this.fuel <= 0 ){
            this.operate = false;
        }
        System.out.println(this.operateSituation(this.operate, this.fuel));
        return this.operate;
    }
//   기름 양 확인 후 운행여부 확인 메소드 종료//

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


//  승객탑승 메서드 시작//
    public int passengerBoarding(){
        if (this.operate == true) {          //operate(운행여부)가 true일때만 승객탑승가능
            if( this.passneger <= 45 ){      //승객 수가 45명(최대승객수) 이하일때만 추가로 탑승 가능
                ++this.passneger;
            }
        }
        return this.passneger;
    }
//  승객탑승 메서드 종료//
//    탑승 승객 수 확인 메서드 시작//
    public int checkPassenger(){
        System.out.println("현재 승객 수는 "+this.passneger+"입니다.");
        return this.passneger;
    }
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
    public int CheckSpeed(){
        System.out.println("현재 운행 속도는"+this.speed+"입니다.");
        return this.speed;
    }





    public static void main(String[] args){
        걷기반과제_BUS bus = new 걷기반과제_BUS();
        bus.getBusNum();
        System.out.println("버스 번호 : "+bus.busNum);
        bus.fuel = 50;           //연료량 입력
        bus.now_fuel(bus.fuel);//연료량을 대입해서 운행여부 판단하기

        bus.passengerBoarding();
        bus.passengerBoarding(); //승객탑승메서드 호출
        bus.checkPassenger();
//        System.out.println("현재 승객 수는 "+bus.passneger+"입니다."); //현재 승객수
//        System.out.printf("주행하실 속도를 입력해주세요  >>  ");
        bus.transeSpeed();
        bus.CheckSpeed();

        System.out.println();
        걷기반과제_BUS bus1 = new 걷기반과제_BUS();
        bus1.getBusNum();
        System.out.println("버스 번호 : "+bus1.busNum);
        bus1.fuel = 0;           //연료량 입력
        bus1.now_fuel(bus1.fuel);//연료량을 대입해서 운행여부 판단하기

        bus1.passengerBoarding();
        bus1.passengerBoarding(); //승객탑승메서드 호출
        bus1.checkPassenger();
//        System.out.println("현재 승객 수는 "+bus.passneger+"입니다."); //현재 승객수
//        System.out.printf("주행하실 속도를 입력해주세요  >>  ");
        bus1.transeSpeed();
        bus1.CheckSpeed();
    }

}
