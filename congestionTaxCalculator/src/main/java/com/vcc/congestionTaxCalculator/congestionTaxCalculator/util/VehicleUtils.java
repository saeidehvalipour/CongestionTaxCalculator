package com.vcc.congestionTaxCalculator.congestionTaxCalculator.util;

import com.vcc.congestionTaxCalculator.congestionTaxCalculator.Constants;
import com.vcc.congestionTaxCalculator.congestionTaxCalculator.Vehicle;



public class VehicleUtils {

    public static boolean isTollFreeVehicle(Vehicle vehicle) {
        if (vehicle == null) return false;
        String vehicleType = vehicle.getVehicleType();
        return Constants.tollFreeVehicles.contains(vehicleType);
    }
}
