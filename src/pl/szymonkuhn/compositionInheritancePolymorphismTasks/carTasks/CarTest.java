package pl.szymonkuhn.compositionInheritancePolymorphismTasks.carTasks;

public class CarTest {
    public static void main(String[] args) {
        Engine engineBMWPetrol = new Engine("BMW", EngineType.PETROL, 2.0);
        Entertainment entertainment = new Entertainment(EntertainmentBrand.JBL);
        Car car = new Car (Brand.BMW, engineBMWPetrol, entertainment);

        System.out.println(car.toString());

        car.startCar();

        entertainment.radioOn();
        entertainment.volumeUp();
        entertainment.volumeUp();
        entertainment.volumeUp();

        System.out.println(car.toString());




    }

}
