

class Car {
    private String brand;
    private int speed;
    private String fuelType;

    Car(String brand, int speed, String fuelType) {
        this.brand = brand;
        this.speed = speed;
        this.fuelType = fuelType;
    }

    public String getBrand() {
        return brand;
    }

    public int getSpeed() {
        return speed;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSpeed(int speed) {
        if (speed >= 0) {
            this.speed = speed;
        }
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
        System.out.println("Fuel Type: " + fuelType);
    }
}

public class CarDetails {
    public static void main(String[] args) {
        Car car = new Car("Tesla", 120, "Electric");
        System.out.println(car.getBrand());
        System.out.println(car.getSpeed());
        car.setSpeed(150);
        car.setFuelType("Hybrid");
        car.display();
    }
}