package Airport.air_cargo_pallet_lifter;

import Airport.airport.GateID;
import Airport.base.AirCargoPallet;

public interface IAirCargoPalletVehicle {
    void executeRequest(GateID gateID);
    void store(AirCargoPallet airCargoPallet);
    void setFlashingLightOn();
    void move(int speedInMPH);
    void stop();
    void setGate(GateID gateID);
    void connect(IAirCargoPalletLifter airCargoPalletLifter);
    void transferPalletToLifter();
    void disconnectFromLifter();
    void returnToAirCargoPalletPackingUnit();
    void setFlashingLightOff();
    void returnToAirportResourcePool();
}
