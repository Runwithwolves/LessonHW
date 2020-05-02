package Lesson11HW;


import java.util.ArrayList;
import java.util.List;

public class SalesShop {
    private List<Car> cars = new ArrayList<>();
    

    public void addAutoShop(Car car) throws OutOfFreePlaceException {
        if (cars.size()>6) {
            throw new OutOfFreePlaceException();
        }
        if (car.getLength()>400) {
            throw new TooBigCarException();
        }
        cars.add(car);
    }

    public void tooBigCar(Car car) throws TooBigCarException {
        throw new TooBigCarException();
    }

    public void Remove(Car car) {
        cars.remove(car);
    }

    public void printCars() {
        for(Car car : cars){
            System.out.println(car);
        }

    }

    public void removeAutoShop(Car car) {
        cars.remove(car);
    }
}
