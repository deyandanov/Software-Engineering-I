package Airport.airport;

import Airplane.Aircraft.Airplane;

public interface IRunwayManagement {
    RunwayCheckPointID provideRunwayCheckPointID(Airplane airplane);
}
