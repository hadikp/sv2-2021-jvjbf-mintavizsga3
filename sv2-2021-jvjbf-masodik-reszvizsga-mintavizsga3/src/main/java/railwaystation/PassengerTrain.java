package railwaystation;

public class PassengerTrain extends Train {

    public boolean hasDiningCar;
    public static final int PEOPLE_NUMBER_OF_WAGON = 70;

    public PassengerTrain(int numberOfWagons) { //nincs név és étkezőkocsi
        super(numberOfWagons);
        this.hasDiningCar = false;
    }

    public PassengerTrain(String name, int numberOfWagons) {
        super(name, numberOfWagons);
        this.hasDiningCar = true;
    }

    @Override
    public int calculateTravellingPeople() {
        if (hasDiningCar) {
            return (getNumberOfWagons() - 1) * PEOPLE_NUMBER_OF_WAGON;
        } else {
            return getNumberOfWagons() * PEOPLE_NUMBER_OF_WAGON;
        }

    }

    public boolean hasDiningCar() {
        return hasDiningCar;
    }
}
