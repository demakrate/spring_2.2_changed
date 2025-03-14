package web.Service;

import web.model.Car;

import java.util.List;

public interface Service {
    public List<Car> getCars(int count_cars);
}
