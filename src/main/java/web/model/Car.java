package web.model;

public class Car {
    private String vinNumber;
    private int power;
    private int weight;

    public Car(String vinNumber, int power, int weight) {
        this.vinNumber = vinNumber;
        this.power = power;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Car{" +
                "vinNumber='" + vinNumber + '\'' +
                ", power=" + power +
                ", weight=" + weight +
                '}';
    }

    public String getVinNumber() {
        return vinNumber;
    }

    public void setVinNumber(String vinNumber) {
        this.vinNumber = vinNumber;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
