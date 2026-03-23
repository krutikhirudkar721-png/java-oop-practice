// Q3: Create a CarRental class to calculate rent based on car type.

class CarRental {

    int carId;
    String carType;
    float rent;

    void getCar(int id, String type) {
        carId = id;
        carType = type;
    }

    float getRent() {
        if (carType.equalsIgnoreCase("Small Car"))
            rent = 1000;
        else if (carType.equalsIgnoreCase("Van"))
            rent = 800;
        else if (carType.equalsIgnoreCase("SUV"))
            rent = 2500;

        return rent;
    }

    void showCar() {
        System.out.println("Car ID: " + carId);
        System.out.println("Car Type: " + carType);
        System.out.println("Rent: " + getRent());
    }

    public static void main(String[] args) {
        CarRental c = new CarRental();
        c.getCar(101, "SUV");
        c.showCar();
    }
}
