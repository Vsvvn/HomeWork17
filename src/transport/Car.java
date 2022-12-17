package transport;
//Задание 1,3

public class Car extends Transport implements Competing {

    public Car(String brand) {
        super(brand);
    }

    public Car(String brand,
               String model,
               double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void start() {
        System.out.println("Легковой автомобиль " + getBrand() + " начаинает движение");
    }

    @Override
    public void finish() {
        System.out.println("Легковой автомобиль " + getBrand() + " заканчивает движение");
    }

    @Override
    public void pitStop() {
        System.out.println("На пит-стоп заезжает легковой автомобиль марки " + getBrand() + " модели " + getModel());
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга " + ((int) (Math.random() * 7)) +
                " мин, показывает легковой автомобиль марки " + getBrand() + " модели " + getModel());
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальную скорость " + ((int) (Math.random() * 150)) +
                " км/ч, показывает легковой автомобиль марки " + getBrand() + " модели " + getModel());

    }
}
