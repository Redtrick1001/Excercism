public class Lasagna {
    public int expectedMinutesInOven() {
        return 40;
    }

    public int remainingMinutesInOven(int timeRemaining) {
        return expectedMinutesInOven() - timeRemaining;
    }

    public int preparationTimeInMinutes(int numLayers) {
        return numLayers * 2;
    }

    public int totalTimeInMinutes(int numLayers, int timeInOven) {
        return preparationTimeInMinutes(numLayers) + timeInOven;
    }
}
