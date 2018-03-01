package FactoryPattern;

/**
 *
 */
public class Car implements Vehicle {

    private VehicleType vehicleType;
    private int numWheels;
    private boolean running;


    Car()  {
        this.vehicleType = VehicleType.CAR;
        this.numWheels = 4;
    }

    @Override
    public VehicleType getVehicleType() {
        return this.vehicleType;
    }

    @Override
    public int getNumWheels() {
        return this.numWheels;
    }

    @Override
    public void startVehicle() {
        System.out.println("---- starting car -----");
        this.running = true;
    }

    @Override
    public void stopVechile() {
        System.out.println("---- stopping car -----");
        this.running = false;
    }

    @Override
    public boolean isRunning() {
        return this.running;
    }
}
