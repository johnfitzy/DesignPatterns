package FactoryPattern;

import java.text.NumberFormat;

/**
 *
 */
public class VehicleFactory {

    public static Vehicle getVehicle(final VehicleType vehicleType) {

        if (vehicleType != null) {

            switch (vehicleType) {

                case CAR:
                    return new Car();

                case TRUCK:
                    return new Truck();

                case MOTORBIKE:
                    return new MotorBike();
            }
        } else {
            throw new RuntimeException("Vehicle type was null");
        }

        return null;
    }
}
