package Test;

public class Car {
    private int numberPlate;
    private String color;

    public Car(int numberPlate, String color) {
        this.numberPlate = numberPlate;
        this.color = color;
    }

    public Car() {
    }

    public void setNumberPlate(int numberPlate) {
        this.numberPlate = numberPlate;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberPlate() {
        return numberPlate;
    }

    public String getColor() {
        return color;
    }
}
