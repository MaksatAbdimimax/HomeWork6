public class Car {
    private int year;
    private String model;
    public static int counter;
    public static int fuelAmount = 1000;

    public Car(int year, String model) {
        this.year = year;
        this.model = model;
        counter++;
        fuelAmount -= 50;
    }

    public int getYear() {
        return year;
    }

    public String getModel() {
        return model;
    }

    public void makeSignal() {
        System.out.println("Car " + this.model + " beeeeeeep");
    }


    public static void buyFuel(int amount) {
        Car.fuelAmount += amount;
    }
}
