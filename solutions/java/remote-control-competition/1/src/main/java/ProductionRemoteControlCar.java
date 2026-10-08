class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {
    private int distance = 0;
    private int numOfVictories = 0;

    @Override
    public void drive() {
        this.distance += 10;
    }

    public int getDistanceTravelled() {
        return this.distance;
    }

    public int getNumberOfVictories() {
        return this.numOfVictories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.numOfVictories = numberOfVictories;
    }


    @Override
    public int compareTo(ProductionRemoteControlCar o) {
        if (o.numOfVictories < this.numOfVictories) {
            return -1;
        } else if (o.numOfVictories == this.numOfVictories) {
            return 0;
        } else {
            return 1;
        }
    }
}
