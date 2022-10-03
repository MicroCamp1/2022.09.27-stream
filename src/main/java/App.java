import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class App {
    public static void main(String[] args) {
        /*List<String> list = new ArrayList<String>();

        list.add("zbyszek");
        list.add("mateusz");
        list.add("artur");
        list.add("janusz");

        System.out.println(list);

        Collections.sort(list);

        System.out.println(list);*/

        List<Car> list = new ArrayList<Car>();

        list.add(new Car("BMW", "3", 200));
        list.add(new Car("Audi", "A3", 100));
        list.add(new Car("Toyota", "Corolla", 50));
        list.add(new Car("Kia", "Ceed", 150));

        System.out.println(list);

        Collections.sort(list,
                (car1, car2) -> {
                    System.out.println("Cos");
                    return car1.getBrand().compareTo(car2.getBrand());
        });

        list.sort((car1, car2) -> car1.getPrice()-car2.getPrice());
        System.out.println(list);

        Collections.sort(list,
                (car1, car2) -> car1.getPrice()-car2.getPrice());

        System.out.println(list);

        Function<Integer, String> funkcja = liczba -> liczba+"jhdf";
        System.out.println(funkcja.apply(7));

        BiFunction<Integer, Double, String> biFunction =
                (liczba, cos) -> liczba + cos + "";

        System.out.println(biFunction.apply(3, 5.5));

        Supplier<Car> dostawca =
                () -> new Car("asdf", "sadf", 123);

        System.out.println(dostawca.get());

        Consumer<Car> consumer = car -> {
            System.out.println(car.getBrand());
            System.out.println(car.getModel());
            System.out.println(car.getPrice());
        };
        consumer.accept(dostawca.get());
    }
}
