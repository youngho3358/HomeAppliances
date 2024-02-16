package airConditioner;

import java.util.Scanner;

import main.HomeAppliances;

public class AirConditioner implements HomeAppliances {
	
	private int temperature;
	private boolean isOn = false;
	private int option=0;
	
	// 에어컨 번호 선택 getter / setter
	public int getOption() {
		return option;
	}
	public void setOption(int option) {
		this.option = option;
	}
	
	// 에어컨 on/off getter / setter
	public boolean isOn() {
		return isOn;
	}
	public void setOn(boolean isOn) {
		this.isOn = isOn;
	}
	
	// 온도 getter / setter
	public int getTemperature() {
		return temperature;
	}
	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}
	
	// 옵션 출력, 입력 받기
	public int chooseOption() {
			Scanner sc = new Scanner(System.in);
			System.out.println("<<< 기능 선택 >>>");
			System.out.println("1. 전원 켜기");
			System.out.println("2. 전원 끄기");
			System.out.println("3. 온도 올리기");
			System.out.println("4. 온도 내리기");
			System.out.println("5. 이전으로");
			System.out.print("번호를 입력하세요 >>> ");
			option = sc.nextInt();
			return option;
	}
	
	// 선택 기능으로 메소드 실행
	public void doOption(int option) {
		if (option == 1) choose1();
		else if (option == 2) choose2();
		else if (option == 3) choose3();
		else if (option == 4) choose4();
	}
	
	public void choose1() {
		if(isOn == false) turnOn();
		else System.out.println("에어컨이 이미 켜져있습니다.");
		System.out.println();
	}
	
	public void choose2() {
		if(isOn == true) turnOff();
		else System.out.println("에어컨이 이미 꺼져있습니다.");
		System.out.println();
	}
	
	public void choose3() {
		if(isOn == true) {
			System.out.println("현재 온도를 1도 올립니다.");
			setTemperature(getTemperature() + 1);
			System.out.println("현재 온도 : " + getTemperature());
			System.out.println();
		}
		else System.out.println("에어컨을 먼저 켜주세요"); 
	}
	
	public void choose4() {
		if (isOn == true) {
			System.out.println("현재 온도를 1도 내립니다.");
			setTemperature(getTemperature() - 1);
			System.out.println("현재 온도 : " + getTemperature());
			System.out.println();
		}
		else System.out.println("에어컨을 먼저 켜주세요"); 
	}
	
	
	
	// 에어컨 실행
	@Override
	public void turnOn() {
		System.out.println("에어컨을 켭니다.");
		isOn = true;
		temperature = 25;
		System.out.println("기본 설정 온도 : " + getTemperature());
	}

	// 에어컨 종료
	@Override
	public void turnOff() {
		System.out.println("에어컨을 끕니다.");
		isOn = false;
	}
	

}