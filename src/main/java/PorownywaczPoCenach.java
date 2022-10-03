import java.util.Comparator;

public class PorownywaczPoCenach implements Comparator<Car> {
    public int compare(Car car, Car t1) {
        return car.getPrice() - t1.getPrice();
    }
}
