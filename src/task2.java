import java.util.Scanner;

public class task2 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = 0;

        while (true) {
            try {
                n = Integer.parseInt(s.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Повторите ввод ");
            }
        }

        Transport car = new Car("Автомобиль");
        System.out.println("Цена за автомобиль: " + car.Cost(n));
        System.out.println("Время автомобиля: " + car.Time(n));

        Transport bicycle = new Bicycle("Велосипед");
        System.out.println("Цена за велосипед: " + bicycle.Cost(n));
        System.out.println("Время велосипеда: " + bicycle.Time(n));

        Transport cart = new Cart("Повозка");
        System.out.println("Цена за повозку: " + cart.Cost(n));
        System.out.println("Время повозки: " + cart.Time(n));
    }

    public static abstract class Transport {

        public Transport(String name) {
        }

        public abstract double Cost(int distance);
        public abstract int Time(int distance);

    }

    public static class Car extends Transport {
        private static final double COST_PER_KM = 1.5;
        private static final int TIME_PER_KM = 1;

        public Car(String name) {
            super(name);
        }

        @Override
        public double Cost(int distance) {
            return distance * COST_PER_KM;
        }

        @Override
        public int Time(int distance) {
            return distance * TIME_PER_KM;
        }
    }

    public static class Bicycle extends Transport {
        private static final double COST_PER_KM = 0.45;
        private static final int TIME_PER_KM = 3;

        public Bicycle(String name) {
            super(name);
        }

        @Override
        public double Cost(int distance) {
            return distance * COST_PER_KM;
        }

        @Override
        public int Time(int distance) {
            return distance * TIME_PER_KM;
        }
    }

    public static class Cart extends Transport {
        private static final double COST_PER_KM = 0.8;
        private static final int TIME_PER_KM = 5;

        public Cart(String name) {
            super(name);
        }

        @Override
        public double Cost(int distance) {
            return distance * COST_PER_KM;
        }

        @Override
        public int Time(int distance) {
            return distance * TIME_PER_KM;
        }
    }

}