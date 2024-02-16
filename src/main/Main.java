package main;

import java.util.Scanner;

import airConditioner.AirConditioner;

public class Main {
	public static void main(String[] args) {
		AirConditioner airConditioner = new AirConditioner();
		Refrigerator refrigerator = new Refrigerator();
		
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("\n제어할 가전제품 선택 : 1. 냉장고, 2. 에어컨, 3. 종료");
			System.out.print("입력 >>> ");
			int option = sc.nextInt();
			
			if(option == 1) {
				int refOption=0;
				while(refOption!=5) {
					refOption = refrigerator.showOption();
					refrigerator.doOption(refOption);
				}
			}
			
			if(option == 2) {
				int airOption;
				while(airConditioner.getOption()!=5) {
					// 옵션 선택
					airOption = airConditioner.chooseOption();
					// 옵션 실행
					airConditioner.doOption(airOption);
				}
				System.out.println("이전으로 이동합니다.");
			}
			
			if(option == 3) {
				System.out.println("\n종료합니다.");
				break;
			}
		}
	}
}
