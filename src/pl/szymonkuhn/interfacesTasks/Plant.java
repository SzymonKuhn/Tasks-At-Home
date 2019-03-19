package pl.szymonkuhn.interfacesTasks;

public interface Plant extends Being {


    @Override
    default boolean isAlive (){
        return getAge() < 1000;
    }
}
