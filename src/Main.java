import java.util.*;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
        AbstractFactory test = new SpaceXFactory();
        List<Collection> resList = new ArrayList<>();
        fillUpCollection(test, resList::add);
        System.out.println(resList);
    }

    public static <T> void fillUpCollection(AbstractFactory<T> factory, Consumer<Collection<T>> consumer) {
        Collection<T> rowsInPage = new ArrayList<>();
        rowsInPage.add(factory.getNewDevice());
        consumer.accept(rowsInPage);
    }

}
