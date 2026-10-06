class NeedForSpeed {
    public int speed;
    public int batteryDrain;
    private int distanceDriven = 0;
    private int batteryPercent = 100;

    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return this.batteryPercent < this.batteryDrain;
    }

    public int distanceDriven() {
        return this.distanceDriven;
    }

    public void drive() {
        if (this.batteryPercent != 0) {
            this.distanceDriven += this.speed;
            this.batteryPercent -= this.batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {
    private int distance;

    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        int maxDist = (100 / car.batteryDrain) * car.speed;
        return maxDist >= this.distance;
    }
}
