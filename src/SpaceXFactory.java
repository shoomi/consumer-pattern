public class SpaceXFactory extends AbstractFactory<Magazzilla> {

    @Override
    Magazzilla getNewDevice() {
        return new Magazzilla();
    }
}
