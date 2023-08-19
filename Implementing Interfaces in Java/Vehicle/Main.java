interface Vehicle {
    void start();
    void accelerate();
    void brake();
}


class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car engine started.");
    }

    @Override
    public void accelerate() {
        System.out.println("Car is accelerating.");
    }

    @Override
    public void brake() {
        System.out.println("Car is braking.");
    }
}

class Motorcycle implements Vehicle {
    @Override
    public void start() {
        System.out.println("Motorcycle engine started.");
    }

    @Override
    public void accelerate() {
        System.out.println("Motorcycle is accelerating.");
    }

    @Override
    public void brake() {
        System.out.println("Motorcycle is braking.");
    }
}

public class Main {
    public static void main(String[] args) {
       
        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();

        System.out.println("Playing with the car:");
        car.start();
        car.accelerate();
        car.brake();

        System.out.println("\nPlaying with the motorcycle:");
        motorcycle.start();
        motorcycle.accelerate();
        motorcycle.brake();

      
        System.out.println("\nUsing polymorphism:");
        Vehicle[] vehicles = new Vehicle[2];
        vehicles[0] = car;
        vehicles[1] = motorcycle;

        for (Vehicle vehicle : vehicles) {
            vehicle.start();
            vehicle.accelerate();
            vehicle.brake();
            System.out.println("-------------");
        }
    }
}
