package FactoryPattern;

/**
 *
 */
public interface Vehicle {

    VehicleType getVehicleType();
    int getNumWheels();
    void startVehicle();
    void stopVechile();
    boolean isRunning();

}
