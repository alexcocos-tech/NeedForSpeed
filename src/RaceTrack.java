public class RaceTrack {
private int distance;

public RaceTrack(int distance){
    this.distance = distance;
}

    public boolean carCanFinish(NeedForSpeed car) {
        int potentialDistance = 0;
        int potentialBattery = 100;

        // Simulate driving until the battery is drained or the distance is covered
        while (potentialBattery >= car.batteryDrain) {
            potentialDistance += car.speed;
            potentialBattery -= car.batteryDrain;

            if (potentialDistance >= distance) {
                return true;
            }
        }

        return false;
    }
}

