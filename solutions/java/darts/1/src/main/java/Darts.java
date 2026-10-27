class Darts {
    int score(double xOfDart, double yOfDart) {
        double distFromCenter = Math.pow(Math.pow(xOfDart, 2) + Math.pow(yOfDart ,2), 0.5);
        if (distFromCenter <= 1) return 10;
        else if (distFromCenter <= 5) return 5;
        else if (distFromCenter <= 10) return 1;
        else return 0;
    }
}
