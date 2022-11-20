public class task2 {
    public static void main(String[] args) {
        /*Trucks truck = new Trucks(2005, "Mercedes", "Actros", "Petrol", 20, 35, 10000);
        Passenger passenger = new Passenger(2013, "MAN", "Lion`s Coach", "Petrol", 20, 61);

        TruckOrder truckOrder = new TruckOrder("Lida", "Minsk", 20, 5000, "Laptop`s");
        truckOrder.orderPath();
        truckOrder.checkFreeLoadCapacity(truck);
        truckOrder.checkFreeVolume(truck);
        truckOrder.checkLoadOrder();
        truckOrder.loadCargo(truck);
        truck.choiceBodyType(BodyType.TENTED);*/

    }
}

/*class Transport {

    int releaseYear;
    String brand;
    String model;
    String typeFuel;
    //litres for 100 kilometers - fuelRate
    int fuelRate;

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Transport(int releaseYear, String brand, String model, String typeFuel, int fuelRate) {
        this.releaseYear = releaseYear;
        this.brand = brand;
        this.model = model;
        this.typeFuel = typeFuel;
        this.fuelRate = fuelRate;
    }

    public void reFuel() {
        System.out.println("Transport was refueled!");
    }

    public void fixCar() {
        System.out.println("Transport was fixed!");
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand = '" + brand + '\'' +
                ", model = '" + model + '\'' +
                ", releaseYear = " + releaseYear +
                ", typeFuel = '" + typeFuel + '\'' +
                ", fuelRate = " + fuelRate +
                '}';
    }


}

class Trucks extends Transport {
    //in m^3
    int bodyVolume;
    int loadCapacity;

    public int getBodyVolume() {
        return bodyVolume;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public Trucks(int releaseYear, String brand, String model, String typeFuel, int fuelRate, int bodyVolume, int loadCapacity) {
        super(releaseYear, brand, model, typeFuel, fuelRate);
        this.bodyVolume = bodyVolume;
        this.loadCapacity = loadCapacity;
    }

    public void sealBody() {
        System.out.println("Seal the body of the truck!");
    }

    public void loadCargo() {
        System.out.println("Truck loaded with cargo!");
    }

    @Override
    public void reFuel() {
        System.out.println("Truck was refueled!");
    }

    @Override
    public void fixCar() {
        System.out.println("Truck was fixed!");
    }


    public void choiceBodyType(BodyType bodyType) {
        switch (bodyType) {
            case TENTED -> System.out.println("Tented body type needed only for manufactured goods!");
            case TANK -> System.out.println("Tank body type needed for liquids!");
            case REFRIGERATORS -> System.out.println("Refrigerator body type needed for manufactured " +
                    "goods and perishable products!");
            case DUMPTRUCK -> System.out.println("Dump truck needed for bulk cargoes " +
                    "and viscous liquids!");
        }
    }
}

class Passenger extends Transport {
    int passengerCapacity;

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public Passenger(int releaseYear, String brand, String model, String typeFuel, int fuelRate, int passengerCapacity) {
        super(releaseYear, brand, model, typeFuel, fuelRate);
        this.passengerCapacity = passengerCapacity;
    }

    public void salonDisinfection() {
        System.out.println("Salon was disinfected!");
    }

    @Override
    public void reFuel() {
        System.out.println("Passenger transport was refueled!");
    }

    @Override
    public void fixCar() {
        System.out.println("Passenger transport was fixed!");
    }
}

class CargoPassenger extends Transport {
    int passengerCapacity;
    int loadCapacity;

    public CargoPassenger(int releaseYear, String brand, String model, String typeFuel, int fuelRate, int passengerCapacity, int loadCapacity) {
        super(releaseYear, brand, model, typeFuel, fuelRate);
        this.passengerCapacity = passengerCapacity;
        this.loadCapacity = loadCapacity;
    }

    public void tripReady() {
        System.out.println("Ready for a long journey!");
    }

    @Override
    public void reFuel() {
        System.out.println("Cargo-passenger transport was refueled!");
    }

    @Override
    public void fixCar() {
        System.out.println("Cargo-passenger transport was fixed!");
    }
}

//this class is common for orders
class Order{
    String startPoint, endPoint;

    public Order(String startPoint, String endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public void orderPath() {
        System.out.printf("%s is start point and %s is end point! \n", startPoint, endPoint);
    }

}

//this class is for creating orders for trucks
class TruckOrder extends Order {
    int cargoVolume, cargoWeight;
    String cargoType;

    public TruckOrder(String startPoint, String endPoint, int cargoVolume, int cargoWeight, String cargoType) {
        super(startPoint, endPoint);
        this.cargoVolume = cargoVolume;
        this.cargoWeight = cargoWeight;
        this.cargoType = cargoType;
    }

    public void loadCargo(Transport transport) {
        System.out.printf("Load cargo in %s %s! \n", transport.getBrand(), transport.getModel());
    }

    public void unloadCargo(Transport transport) {
        System.out.printf("Unload cargo from %s %s! \n", transport.getBrand(), transport.getModel());
    }

    public void checkFreeLoadCapacity(Trucks truck) {
        int freeCapacity = truck.loadCapacity - cargoWeight;
        System.out.println("Free capacity of truck is " + freeCapacity + " kilograms.");
    }

    public void checkFreeVolume(Trucks truck) {
        int freeVolume = truck.bodyVolume - cargoVolume;
        System.out.println("Free volume of the truck is " + freeVolume + " cubic metres.");
    }

    public void checkLoadOrder() {
        System.out.printf("The truck is loaded with %s! \n", cargoType);
    }

}

//this class if for creating orders for passenger and cargo-passenger
class PassengerOrder extends Order {
    int numberPassenger, numberSeats;

    public PassengerOrder(String startPoint, String endPoint, int numberPassenger, int numberSeats) {
        super(startPoint, endPoint);
        this.numberPassenger = numberPassenger;
        this.numberSeats = numberSeats;
    }

    public void checkFreeNumberSeats(Passenger passenger) {
        int freeSeats = passenger.passengerCapacity - numberSeats;
        System.out.println("Free number of seats is " + freeSeats + "!");
    }

}


enum BodyType {
    TENTED,
    REFRIGERATORS,
    TANK,
    DUMPTRUCK
}*/