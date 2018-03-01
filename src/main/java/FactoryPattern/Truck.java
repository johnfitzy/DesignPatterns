package FactoryPattern;

/**
 *
 */
public class Truck implements Vehicle{

    private VehicleType vehicleType;
    private int numWheels;
    private boolean running;


    Truck()  {
        this.vehicleType = VehicleType.TRUCK;
        this.numWheels = 8;
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
        System.out.println("---- starting truck -------");
        this.running = true;
    }

    @Override
    public void stopVechile() {
        System.out.println("---- stopping truck -----");
        this.running = false;
    }

    @Override
    public boolean isRunning() {
        return this.running;
    }
}
