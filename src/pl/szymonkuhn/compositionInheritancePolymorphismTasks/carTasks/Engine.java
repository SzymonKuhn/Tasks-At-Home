package pl.szymonkuhn.compositionInheritancePolymorphismTasks.carTasks;

public class Engine {
    private String brand;
    private double capacity;
    private boolean started = false;
    private EngineType engineType;

    public Engine(String brand, EngineType engineType, double capacity) {
        this.brand = brand;
        this.engineType = engineType;
        this.capacity = capacity;
    }

    public void startEngine() {
        started = true;
    }

    public void stopEngine() {
        started = false;
    }

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return engineType.toString();
    }

    public boolean isStarted() {
        return started;
    }

    public double getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "Silnik marki " + brand +
                ". Jest to silnik typu " + engineType +
                ", o pojemności " + capacity +
                ".";
    }
}
