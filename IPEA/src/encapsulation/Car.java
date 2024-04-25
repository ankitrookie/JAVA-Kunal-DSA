package encapsulation;

public class Car {
    private String make;
    private String modal;
    private int year;
    private int speed;

    public Car(String make, String modal, int year, int speed) {
        this.make = make;
        this.modal = modal;
        this.year = year;
        this.speed = speed;
    }

    public String getMake() {
        return make;
    }

    public String getModal() {
        return modal;
    }

    public int getYear() {
        return year;
    }

    public int getSpeed() {
        return speed;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
