package airConditioner;

import main.HomeAppliances;

public class AirConditioner implements HomeAppliances {
	
	private int temperature;
	
	// 온도 getter / setter
	public int getTemperature() {
		return temperature;
	}
	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}
	
	// 에어컨 실행
	@Override
	public void turnOn() {
		System.out.println("에어컨을 켭니다.");
		temperature = 22;
		System.out.println("현재 온도 : " + getTemperature());
	}

	// 에어컨 종료
	@Override
	public void turnOff() {
		System.out.println("에어컨을 끕니다.");
	}
	
	
	

}