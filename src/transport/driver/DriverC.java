package transport.driver;
//Задание 4

import transport.Truck;

public class DriverC extends Driver<Truck>{
    public DriverC(String name, boolean hasDrivingLicense, int experience) {
        super(name, hasDrivingLicense, experience);
    }

    @Override
    public void startMove(Truck transport) {
        transport.start();
    }

    @Override
    public void stopMove(Truck transport) {
        transport.finish();
    }

    @Override
    public void refill(Truck transport) {
        System.out.println("Водитель"+ getName() + " заправляет грузовой автомобиль " + transport.getBrand());

    }
}
