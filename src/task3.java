public class task3 {
    public static void main(String[] args) {
        Transport transport = new CommonTransport(1990, "Mercedes", "kek", "poison", 20);

        Transport truck = new Truck(transport, 35, 15000);
        System.out.println(truck.reFuel());

    }
}

interface Transport {
    public String reFuel();
    public String fixCar();
    public String startDriving();
    public String turnCar();
    public String stopDriving();
}

class CommonTransport implements Transport {
    int releaseYear = 0;
    String brand;
    String model;
    String typeFuel;
    //litres for 100 kilometers - fuelRate
    int fuelRate;

    public CommonTransport(int releaseYear, String brand, String model, String typeFuel, int fuelRate) {
        this.releaseYear = releaseYear;
        this.brand = brand;
        this.model = model;
        this.typeFuel = typeFuel;
        this.fuelRate = fuelRate;
    }

    @Override
    public String reFuel() {
        return " was refueled!";
    }

    @Override
    public String fixCar() {
        return " was fixed!";
    }

    @Override
    public String startDriving() {
        return " started moving!";
    }

    @Override
    public String turnCar() {
        return " turned!";
    }

    @Override
    public String stopDriving() {
        return " stopped!";
    }
}

abstract class TruckDecorator implements Transport {
    Transport transport;
    public TruckDecorator(Transport transport) {
        this.transport = transport;
    }

}

class Truck extends TruckDecorator {

    //in m^3
    int bodyVolume;
    int loadCapacity;

    public Truck(Transport transport, int bodyVolume, int loadCapacity) {
        super(transport);
        this.bodyVolume = bodyVolume;
        this.loadCapacity = loadCapacity;
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

    public String sealBody() {
        return "Seal the body of the truck!";
    }

    public String loadCargo() {
        return "Truck loaded with cargo!";
    }

    @Override
    public String reFuel() {
        return "Truck" + transport.reFuel();
    }

    @Override
    public String fixCar() {
        return "Truck" + transport.fixCar();
    }

    @Override
    public String startDriving() {
        return "Truck" + transport.startDriving();
    }

    @Override
    public String turnCar() {
        return "Truck" + transport.turnCar();
    }

    @Override
    public String stopDriving() {
        return "Truck" + transport.stopDriving();
    }
}

enum BodyType {
    TENTED,
    REFRIGERATORS,
    TANK,
    DUMPTRUCK
}

abstract class PassengerDecorator implements Transport {
    Transport transport;
    public PassengerDecorator(Transport transport) {
        this.transport = transport;
    }
}

class Passenger extends PassengerDecorator {

    int passengerCapacity;

    public Passenger(Transport transport, int passengerCapacity) {
        super(transport);
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public String reFuel() {
        return "Truck" + transport.reFuel();
    }

    @Override
    public String fixCar() {
        return "Truck" + transport.fixCar();
    }

    @Override
    public String startDriving() {
        return "Truck" + transport.startDriving();
    }

    @Override
    public String turnCar() {
        return "Truck" + transport.turnCar();
    }

    @Override
    public String stopDriving() {
        return "Truck" + transport.stopDriving();
    }
}

abstract class CargoPassengerDecorator implements Transport {
    Transport transport;
    public CargoPassengerDecorator(Transport transport) {
        this.transport = transport;
    }
}

class CargoPassenger extends CargoPassengerDecorator {

    int passengerCapacity;
    int loadCapacity;

    public CargoPassenger(Transport transport, int passengerCapacity, int loadCapacity) {
        super(transport);
        this.passengerCapacity = passengerCapacity;
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String reFuel() {
        return "Truck" + transport.reFuel();
    }

    @Override
    public String fixCar() {
        return "Truck" + transport.fixCar();
    }

    @Override
    public String startDriving() {
        return "Truck" + transport.startDriving();
    }

    @Override
    public String turnCar() {
        return "Truck" + transport.turnCar();
    }

    @Override
    public String stopDriving() {
        return "Truck" + transport.stopDriving();
    }
}

interface Order {
    public void orderPath();
}

class CommonOrder implements Order{
    String startPoint, endPoint;

    public CommonOrder(String startPoint, String endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }
    @Override
    public void orderPath() {
        System.out.printf("%s is start point and %s is end point! \n", startPoint, endPoint);
    }
}

abstract class TruckOrderDecorator implements Order {
    Order order;

    public TruckOrderDecorator(Order order) {
        this.order = order;
    }
}

class TruckOrder extends TruckOrderDecorator {
    int cargoVolume, cargoWeight;
    String cargoType;

    public TruckOrder(Order order, int cargoVolume, int cargoWeight, String cargoType) {
        super(order);
        this.cargoVolume = cargoVolume;
        this.cargoWeight = cargoWeight;
        this.cargoType = cargoType;
    }

    @Override
    public void orderPath() {
        order.orderPath();
    }
}

abstract class PassengerOrderDecorator implements Order {
    Order order;
    public PassengerOrderDecorator(Order order) {
        this.order = order;
    }
}

class PassengerOrder extends PassengerOrderDecorator {
    int numberPassenger, numberSeats;

    public PassengerOrder(Order order, int numberPassenger, int numberSeats) {
        super(order);
        this.numberPassenger = numberPassenger;
        this.numberSeats = numberSeats;
    }

    @Override
    public void orderPath() {
        order.orderPath();
    }
}


