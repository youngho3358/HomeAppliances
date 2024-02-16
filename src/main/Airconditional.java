package main;

public class Airconditional implements HomeAppliances{

    private int temperature;

    @Override
    public void turnOn() {
        System.out.println("냉장고를 킵니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("냉장고를 끕니다.");
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
