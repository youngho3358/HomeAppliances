package main;

import java.util.Scanner;

public class Refrigerator implements HomeAppliances{

    private int temperature;
    private boolean isOpen = false;
    
    public int showOption() {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("\n1. 열기");
    	System.out.println("2. 닫기");
    	System.out.println("3. 온도 내리기");
    	System.out.println("4. 온도 올리기");
    	System.out.println("5. 이전으로");
    	System.out.print("입력 >>> ");
    	return sc.nextInt();
    }
    
    public void doOption(int option) {
    	if(option == 1) turnOn();
    	else if(option == 2) turnOff();
    	else if(option == 3) upTem();
    	else if(option == 4) downTem();
    }
    
    // 열기
	@Override
    public void turnOn() {
		if(isOpen == false) {
			temperature = 0;
	        System.out.println("\n냉장고를 엽니다. 현재 설정온도 : " + temperature);
	        isOpen = true;
		}
		else System.out.println("\n이미 냉장고가 열려있습니다.");
    }
	
	// 닫기
    @Override
    public void turnOff() {
    	if(isOpen == true) {
	        System.out.println("냉장고를 닫습니다.");
	        isOpen = false;
    	}
    	else System.out.println("이미 냉장고가 닫혀있습니다.");
    }
    
    // 온도 내리기
    public void upTem() {
    	if (temperature > -20) {
	    	temperature = temperature -1;
	    	System.out.println("\n온도를 1도 내립니다. 현재 온도 : " + temperature);
    	}
    	else System.out.println("\n최저 온도는 -20도 입니다. 현재 온도 : " + temperature);
    }
    
    // 온도 올리기
    public void downTem() {
    	if (temperature < 10) {
	    	temperature = temperature +1;
	    	System.out.println("\n온도를 1도 내립니다. 현재 온도 : " + temperature);
    	}
    	else System.out.println("\n최고 온도는 10도 입니다. 현재 온도 : " + temperature);
    }
    
}
