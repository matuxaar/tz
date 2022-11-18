public class task2 {
    public static void main(String[] args) {

    }
}

class Transport {

    int releaseYear;
    String brand;
    String model;
    String typeFuel;
    int fuelRate;


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
                "releaseYear=" + releaseYear +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", typeFuel='" + typeFuel + '\'' +
                ", fuelRate=" + fuelRate +
                '}';
    }
}

class Trucks extends Transport {
    int bodyVolume;
    int loadCapacity;

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

    @Override
    public void reFuel() {
        System.out.println("Cargo-passenger transport was refueled!");
    }

    @Override
    public void fixCar() {
        System.out.println("Cargo-passenger transport was fixed!");
    }
}

class truckOrder{
    String startPoint, endPoint;
    String cargoType;
    int volume, weight;



}

enum BodyType {
    TENTED,
    REFRIGERATORS,
    TANK,
    DUMPTRUCK
}