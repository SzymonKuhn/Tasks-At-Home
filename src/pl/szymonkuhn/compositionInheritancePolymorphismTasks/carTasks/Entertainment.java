package pl.szymonkuhn.compositionInheritancePolymorphismTasks.carTasks;

public class Entertainment {
    EntertainmentBrand entertainmentBrand;
    private boolean radioOn;
    private int volume = 5;

    public Entertainment(EntertainmentBrand entertainmentBrand) {
        this.entertainmentBrand = entertainmentBrand;
    }

    public void volumeUp() {
        volume++;
    }

    public void volumeDown() {
        volume--;
    }

    public void radioOn() {
        radioOn = true;
    }

    public void radioOff() {
        radioOn=false;
    }

    public String getBrand() {
        return entertainmentBrand.toString();
    }

    public boolean isRadioOn() {
        return radioOn;
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return " Marka zestawu rozrywki: " + entertainmentBrand.toString();
    }
}
