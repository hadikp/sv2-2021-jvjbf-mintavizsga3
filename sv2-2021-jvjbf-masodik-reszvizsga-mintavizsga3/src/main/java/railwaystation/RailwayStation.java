package railwaystation;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class RailwayStation {

    private List<Train> trains = new ArrayList<>();

    public void addTrain(Train train) {
        if (trains.size() < 10) {
            trains.add(train);
        } else {
            throw new IllegalArgumentException("Too much trains!");
        }
    }

    public List<Train> getTrains() {
        return trains;
    }

    public Train getLongestTrain() {
        return trains.stream().max(Comparator.comparing(Train::getTotalLength)).get();
    }

    public long getHowManyTrainsHaveName() {
        return trains.stream().filter(train -> train.getName() != null).count();
    }

    public List<Train> getTrainsWithPassengersMoreThan(int number) {
        return trains.stream().filter(x -> x.calculateTravellingPeople() > number).collect(Collectors.toList());
    }
}
