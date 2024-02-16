package main;

public class Refrigerator implements HomeAppliances{

    private int temperature;
    private boolean isOpen = false;
    
    

    public boolean isOpen() {
		return isOpen;
	}

	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}

	@Override
    public void turnOn() {
        System.out.println("냉장고를 엽니다.");
        isOpen = true;
    }

    @Override
    public void turnOff() {
        System.out.println("냉장고를 닫습니다.");
        isOpen = false;
    }

    public void upTemp(int raiseNum) {
        temperature += raiseNum;
    }

    public void downTemp(int lowerNum) {
        temperature -= lowerNum;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}
