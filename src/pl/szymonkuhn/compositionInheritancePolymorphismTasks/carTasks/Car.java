package pl.szymonkuhn.compositionInheritancePolymorphismTasks.carTasks;

public class Car {
    private Brand brand;
    private Engine engine;
    private Entertainment entertainment;

    public Car(Brand brand, Engine engine, Entertainment entertainment) {
        this.brand = brand;
        this.engine = engine;
        this.entertainment = entertainment;
    }

    public void startCar(){
        engine.startEngine();
    }

    public void stopCar() {
        engine.stopEngine();
    }


    public String getBrand() {
        return brand.toString();
    }

    public Engine getEngine() {
        return engine;
    }

    public Entertainment getEntertainment() {
        return entertainment;
    }

    @Override
    public String toString() {
        return "Samochód marki " + brand +
                ". " + engine.toString() +
                " Na wyposażeniu zestaw stereo." + entertainment.toString();
    }
}
