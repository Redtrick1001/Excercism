
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public static int[] getLastWeek() {
        return new int[]{0, 2, 5, 3, 7, 8, 4};
    }

    public int getToday() {
        return this.birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        this.birdsPerDay[birdsPerDay.length - 1] ++;
    }

    public boolean hasDayWithoutBirds() {
        for (int bird: this.birdsPerDay) {
            if (bird <= 0) return true;
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int maxIndex = numberOfDays > this.birdsPerDay.length ?
                this.birdsPerDay.length :
                numberOfDays;


        int total = 0;
        for (int i = 0; i < maxIndex; i++) {
            total += this.birdsPerDay[i];
        }
        return total;
    }

    public int getBusyDays() {
        int busyDays = 0;
        for (int day: this.birdsPerDay){
            busyDays += day >= 5? 1: 0;
        }
        return busyDays;
    }
}
