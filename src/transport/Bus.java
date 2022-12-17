package transport;
//Задание 1,3

public class Bus extends Transport implements Competing{

    public Bus(String brand) {
        super(brand);
    }

    public Bus(String brand,
               String model,
               double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void start() {
        System.out.println("Автобус " + getBrand() + " начаинает движение");
    }

    @Override
    public void finish() {
        System.out.println("Автобус" + getBrand() + " заканчивает движение");
    }

    @Override
    public void pitStop() {
        System.out.println("На пит-стоп заезжает автобус марки " + getBrand() + " модели " + getModel());
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга показывает "+ ((int)(Math.random()*15)) +
                " мин, автобус марки " +  getBrand() + " модели " + getModel());
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальную скорость " + ((int) (Math.random() * 100)) +
                " км/ч, показывает автобус марки " + getBrand() + " модели " + getModel());

    }

    @Override
    public String toString() {
        return "Автобус: " + super.toString();
    }
}
