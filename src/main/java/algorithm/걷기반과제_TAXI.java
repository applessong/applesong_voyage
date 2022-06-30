package algorithm;

import java.util.Scanner;

public class 걷기반과제_TAXI {
    boolean operate;    //운행여부
    boolean passneger = true;  //승객여부, 초기값은 승객없음으로 탑승가능 상태
    int chargeBasic = 5;     //기본요금
    int chargeAdditional;   //추가요금
    int distanceForDestination;//목적지까지거리
    int distanceBasic = 2;   //기본거리
    String destination;     //목적지명
    int speed;
    int fuel;
    private static int taxiNum = 500;

//  택시번호 생성, 택시 생성 후 택시번호 출력 메서드 시작//
    public int getTaxiNum() {
        taxiNum++;
        return taxiNum;
    }

//  택시번호 생성, 택시 생성 후 택시번호 출력 메서드 종료//

//    연료 체크 후 운행상태 결정. 운행상태메세지 메서드를 이용해 운행상태 출력 시작//
    public boolean now_fuel () {
        System.out.printf("연료체크를 시작합니다. 현재 연료량을 입력해주세요.  >>  ");
        Scanner scanner = new Scanner(System.in);
        int fuelScanner = scanner.nextInt();
        this.fuel = fuelScanner;

        this.operate = true;
        if ( this.fuel <= 10 ){
            this.operate = false;
        }
        System.out.println(this.operateSituation(this.operate, this.fuel));
        System.out.println();
        return this.operate;
    }
//    연료 체크 후 운행상태 결정. 운행상태메세지 메서드를 이용해 운행상태 출력 종료//

//    연료 체크값을 가지고와서 상태에 따른 운행상태 메세지를 지정 시작//
    public String operateSituation(boolean operate, int fuel) {
        String answer = "";
        if ( this.operate == true ){
            if ( this.fuel >= 10) {
                answer = "연료체크 완료. 운행을 시작합니다. 안전운행 되세요.";
            }
        } else if ( this.operate == false ){
            answer = "연료체크 완료. 연료 부족으로 운행을 종료합니다.";
        }
        return answer;
    }
//    연료 체크값을 가지고와서 상태에 따른 운행상태 메세지를 지정 종료//

//    택시 상태를 체크 후 택시상태 변경, 탑승가능/불가능 메세지 출력 시작//
    public boolean passengerBoarding(){
        System.out.println("택시를 이용하고자 하는 승객이 나타났습니다.");
        if (this.passneger == true) {
            System.out.println("환영합니다. 목적지까지 안전하게 모시겠습니다.");
            this.distanceforDestination();
            this.transeSpeed();
            System.out.println();
            this.passneger = !passneger;
        } else {
            System.out.println("죄송하지만 이미 다른 승객이 탑승중입니다. 다음 택시를 이용해주십시오.");
            System.out.println();
        }
        return this.passneger;
    }
//    택시 상태를 체크 후 택시상태 변경, 탑승가능/불가능 메세지 출력 종료//

//    목적지 입력받고 목적지까지의 거리 리턴메소드 시작//
    public int distanceforDestination () {

        System.out.println("아래 선택지 중에서 목적지를 입력해주세요.");
        System.out.println("애니츠, 베른북부, 아르데타인, 슈테른, 로웬, 페이튼");
        Scanner scanner = new Scanner(System.in);
        String destinationScanner = scanner.nextLine();
        this.destination = destinationScanner;
        switch(this.destination){
            case "애니츠": this.distanceForDestination = 1; break;
            case "베른북부": this.distanceForDestination = 2; break;
            case "아르데타인": this.distanceForDestination = 3; break;
            case "슈테른": this.distanceForDestination = 4; break;
            case "로웬": this.distanceForDestination = 5; break;
            case "페이튼": this.distanceForDestination = 6; break;
        }
        if (distanceForDestination > 2 ){
            System.out.println("2대륙이하의 이동은 기본요금 5실링으로 이용이 가능하지만,");
            System.out.println("2대륙을 초과하는 거리는 1대륙당 3실링의 추가요금이 발생합니다.");
        } else {
            System.out.println("2대륙이하의 이동은 기본요금 5실링으로 추가요금 없이 이용이 가능합니다.");
        }
        System.out.println("목적지를 "+destination+"으로 설정했습니다. 경로를 검색 후 출발합니다.");

        return this.distanceForDestination;
    }
//    목적지 입력받고 목적지까지의 거리 리턴메소드 종료//

//    거리당 요금 추가 메서드 시작//
    public int chargeAdditionalForDistace(){
        if ( this.distanceBasic < this.distanceForDestination ){
            chargeAdditional = (this.distanceForDestination-this.distanceBasic)*3;
        } else {
            chargeAdditional= 0;
        }
        return chargeAdditional;
    }
//    거리당 요금 추가 메서드 종료//

//    거리당 추가요금 포함해서 결제금액 확인 후 승객하차 메서드 시작//
    public boolean paymentCharge(){
        this.chargeAdditionalForDistace();
        int totalCharge = chargeBasic+chargeAdditional;
        System.out.println("목적지에 도착하였습니다. 이용 요금은 "+totalCharge+"실링 입니다. 이용해주셔서 감사합니다.");
        System.out.println();
        this.passneger = true;
        this.destination = "";
        this.chargeAdditional = 0;
        return this.passneger;
    }
//    거리당 추가요금 포함해서 결제금액 확인 후 승객하차 메서드 종료//


//  속도변경 메서드 시작//
    public int transeSpeed(){
        if ( this.operate == true) {
            System.out.printf("주행하실 속도를 입력해주세요  >>  ");
            Scanner scanner = new Scanner(System.in);
            int speedScanner = scanner.nextInt();
            this.speed = speedScanner;
        }
        System.out.println("운행속도를 "+this.speed+"노트로 변경합니다.");
        return this.speed;
    }
//  속도변경 메서드 종료//

//    거리당 요금 추가 메서드 시작//
    public int chargeFor() {
        if ( distanceForDestination > distanceBasic ){

        }

        return chargeAdditional;
    }
//    거리당 요금 추가 메서드 종료//


    public 걷기반과제_TAXI(){
        taxiNum = getTaxiNum();
        System.out.println("택시 번호 : "+ this.getTaxiNum());
        now_fuel();
        passengerBoarding();    //승객탑승 운행시작
        passengerBoarding();    //이미 승객이 탑승중이라 탑승불가능
        paymentCharge();        //처음 탄 승객 요금 결제 후 다시 탑승가능상태로 변경
        passengerBoarding();    //새로운 승객 탑승 운행시작

    }
    public static void main(String[] args){
        걷기반과제_TAXI taxi = new 걷기반과제_TAXI();

    }
}
