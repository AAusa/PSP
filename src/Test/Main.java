package Test;

import Test.Car;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        final int MAX = 10;

        ArrayList<Car> cars = new ArrayList<Car>();
        int [] numberPlates = {1234, 2435, 2353, 3235};
        String [] colors = {"blue", "red", "green"};
        for(int i = 0; i < MAX; i++) {
            cars.add(new Car(numberPlates[r.nextInt(4)],colors[r.nextInt(3)]));
        }
    }
}