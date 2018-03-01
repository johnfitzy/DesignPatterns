package FactoryPattern;

/**
 *
 */
public class MotorBike implements Vehicle {

    private VehicleType vehicleType;
    private int numWheels;
    private boolean running;


    MotorBike()  {
        this.vehicleType = VehicleType.MOTORBIKE;
        this.numWheels = 2;
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
        System.out.println("---- starting motor bike -------");
        this.running = true;
    }

    @Override
    public void stopVechile() {
        System.out.println("---- stopping motor bike -----");
        this.running = false;
    }

    @Override
    public boolean isRunning() {
        return this.running;
    }
}
