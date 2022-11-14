public class CarFactory extends AbstractFactory<Car> {

    @Override
    Car getNewDevice() {
        return new Car();
    }

}
