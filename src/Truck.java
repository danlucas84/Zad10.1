public class Truck extends Car {

private double loadWeight;

    public Truck(String name, double tankCapacity, double averageCombustion, boolean isAirCondition) {
        super(name, tankCapacity, averageCombustion, isAirCondition);
    }

    public double getLoadWeight() {
        return loadWeight;
    }

    public void setLoadWeight(double loadWeight) {
        this.loadWeight = loadWeight;
    }

    @Override
    double rangeCalculation() {
        double range = 0;
        if (isAirCondition() == true) {
            range = getTankCapacity() + (1.6 * getTankCapacity());

        }
        return range;
    }
}
