package railwaystation;

import java.util.ArrayList;
import java.util.List;

public class RailwayStation {
    private List<Train> trains = new ArrayList<>();

    public void addTrain(Train train) {
        if (trains.size() >= 10) {
            throw new IllegalArgumentException("Too much trains!");
        }
        trains.add(train);
    }

    public List<Train> getTrains() {
        return trains;
    }

    public Train getLongestTrain() {
        int size = trains.get(0).getTotalLength();
        List<Train> result = new ArrayList<>();
        for (int i = 0; i < trains.size(); i++) {
            if (size < trains.get(i).getTotalLength()) {
                result.add(trains.get(i));
                size = trains.get(i).getTotalLength();
            }
        }
        return result.get(result.size() - 1);
    }

    public int getHowManyTrainsHaveName() {
        int counter = 0;
        for (Train scopedTrain : trains) {
            if (!(scopedTrain.getName() == null)) {
                counter = counter + 1;
            }
        }
        return counter;
    }

    public List<Train> getTrainsWithPassengersMoreThan(int capacity) {
        List<Train> result = new ArrayList<>();
        for (Train train : trains) {
            if (train.getNumberOfWagons() * 70 > capacity) {
                result.add(train);
            }
        }
        return result;
    }
}