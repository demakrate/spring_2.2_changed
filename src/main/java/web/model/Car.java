package web.model;

public class Car {
    private String model;
    private int number;
    private int price;

    public Car(String model, int number, int price) {
        this.model = model;
        this.number = number;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public int getNumber() {
        return number;
    }

    public int getPrice() {
        return price;
    }
}
