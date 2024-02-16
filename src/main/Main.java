package main;

import java.util.Scanner;

import airConditioner.AirConditioner;

public class Main {
	public static void main(String[] args) {
		AirConditioner airConditioner = new AirConditioner();
		Refrigerator refrigerator = new Refrigerator();
		
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("가전제품 선택 : 1. 냉장고, 2. 에어컨, 3. 종료");
			int option = sc.nextInt();
			
			if(option == 1) {
				if(refrigerator.isOpen()) 	refrigerator.turnOff();
				else 						refrigerator.turnOn();
			}
			
			if(option == 2) {
				if(airConditioner.isOn()) 	airConditioner.turnOff();
				else 						airConditioner.turnOn();
			}
			
			if(option == 3) 
				System.out.println("종료합니다.");
				break;
		}
	}
}
