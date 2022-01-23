package railwaystation;

public abstract class Train {

    protected String name;
    private int numberOfWagons;
    public static final int LENGTH = 15;

    public Train(int numberOfWagons) {
        this.numberOfWagons = numberOfWagons;
    }

    public Train(String name, int numberOfWagons) {
        this(numberOfWagons = numberOfWagons);
        this.name = name;

    }

    public int getTotalLength() {
        return numberOfWagons * LENGTH;
    }

    public abstract int calculateTravellingPeople();

    public String getName() {
        return name;
    }

    public int getNumberOfWagons() {
        return numberOfWagons;
    }
}
