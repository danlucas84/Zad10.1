public class Vehicle {

    String name;
    private double tankCapacity;
    private  double averageCombustion;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public void setTankCapacity(double tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    public double getAverageCombustion() {
        return averageCombustion;
    }

    public void setAverageCombustion(double averageCombustion) {
        this.averageCombustion = averageCombustion;
    }

    public Vehicle(String name, double tankCapacity, double averageCombustion) {
        this.name = name;
        this.tankCapacity = tankCapacity;
        this.averageCombustion = averageCombustion;
    }

    //double rangeCalculation(){
       // double range;
       // return range;

    void vehicleInfo(){
        System.out.println("Info o pojezdzie"+ "nazwa" + name +"Srednie zuzycie na 100 km" + getAverageCombustion()+ "pojnosc baku" + getTankCapacity());
    }

}


