package railwaystation;

public class CargoTrain extends Train {

    public CargoTrain(int numberOfWagons) {
        super(numberOfWagons);
    }

    @Override
    public int calculateTravellingPeople() {
        int numberOfPeople = (int) getNumberOfWagons() / 10;
        if (numberOfPeople == 0) {
            return 1;
        } else {
            return numberOfPeople;
        }
    }
}
