package railwaystation;

public class CargoTrain extends Train {

    public CargoTrain(int numberOfWagons) {
        super(numberOfWagons);
    }

    public int calculateTravellingPeople() {
        int staff;
        staff = (int) Math.floor(getNumberOfWagons() / 10);
        if (staff < 1) {
            return 1;
        }
        else return staff;
    }
}