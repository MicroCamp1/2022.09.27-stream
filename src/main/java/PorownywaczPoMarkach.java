import java.util.Comparator;

public class PorownywaczPoMarkach implements Comparator<Car> {
    public int compare(Car car, Car t1) {
        return car.getBrand().compareTo(t1.getBrand());
    }
}
