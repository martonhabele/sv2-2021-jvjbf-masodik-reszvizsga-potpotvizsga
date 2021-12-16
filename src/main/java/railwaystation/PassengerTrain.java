package railwaystation;

public class PassengerTrain extends Train {
    private boolean hasDiningCar;

    public PassengerTrain(int numberOfWagons) {
        super(numberOfWagons);
        this.hasDiningCar = false;
    }

    public PassengerTrain(String name, int numberOfWagons) {
        super(name, numberOfWagons);
        this.hasDiningCar = true;
    }

    public int calculateTravellingPeople() {
        if (hasDiningCar == true) {
            return getNumberOfWagons() * 70 - 70;
        }
        else {
            return getNumberOfWagons() * 70;
        }
    }

    public boolean hasDiningCar() {
        return hasDiningCar;
    }
}