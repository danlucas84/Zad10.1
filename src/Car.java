public class Car extends Vehicle {

    private boolean isAirCondition;

    public boolean isAirCondition() {
        return isAirCondition;
    }

    public void setAirCondition(boolean airCondition) {
        isAirCondition = airCondition;
    }

    public Car(String name, double tankCapacity, double averageCombustion, boolean isAirCondition) {
        super(name, tankCapacity, averageCombustion);
        this.isAirCondition = isAirCondition;
    }

    double rangeCalculation() {
        double range = 0;
        if (isAirCondition == true) {
            range = getTankCapacity() + (0.8 * getTankCapacity());

        }
        return range;
    }
}
