abstract class Transport {
    public abstract void drive();
}

class Car extends Transport {
    @Override
    public void drive() {
        System.out.println("Автомобиль едет по дороге.");
    }
}

class Bicycle extends Transport {
    @Override
    public void drive() {
        System.out.println("Велосипед движется по тротуару.");
    }
}

class Motorcycle extends Transport {
    @Override
    public void drive() {
        System.out.println("Мотоцикл разгоняется на шоссе.");
    }
}

interface TransportFactory {
    Transport createTransport();
}

class CarFactory implements TransportFactory {
    @Override
    public Transport createTransport() {
        return new Car();
    }
}

class BicycleFactory implements TransportFactory {
    @Override
    public Transport createTransport() {
        return new Bicycle();
    }
}

class MotorcycleFactory implements TransportFactory {
    @Override
    public Transport createTransport() {
        return new Motorcycle();
    }
}

public class Main {
    public static void main(String[] args) {
        TransportFactory carFactory = new CarFactory();
        Transport car = carFactory.createTransport();
        car.drive(); // Выводит: Автомобиль едет по дороге.

        TransportFactory bicycleFactory = new BicycleFactory();
        Transport bicycle = bicycleFactory.createTransport();
        bicycle.drive(); // Выводит: Велосипед движется по тротуару.

        TransportFactory motorcycleFactory = new MotorcycleFactory();
        Transport motorcycle = motorcycleFactory.createTransport();
        motorcycle.drive(); // Выводит: Мотоцикл разгоняется на шоссе.
    }
}
