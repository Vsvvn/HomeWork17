package transport;
//Задание 1,3

public class Truck extends Transport implements Competing{

    public Truck(String brand) {
        super(brand);
    }

    public Truck(String brand,
                 String model,
                 double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void start() {
        System.out.println("Грузовой автомобиль" + getBrand() + " начаинает движение");
    }

    @Override
    public void finish() {
        System.out.println("Грузовой автомобиль" + getBrand() + " заканчивает движение");
    }

    @Override
    public void pitStop() {
        System.out.println("На пит-стоп заезжает грузовой автомобиль марки " + getBrand() + " модели " + getModel());
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга показывает "+ ((int)(Math.random()*12)) +
                " мин, грузовой автомобиль марки " + getBrand() + " модели " + getModel());
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальную скорость " + ((int) (Math.random() * 120)) +
                " км/ч, показывает грузовой автомобиль марки " + getBrand() + " модели " + getModel());
    }
}
