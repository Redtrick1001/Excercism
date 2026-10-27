class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        String[] digits = String.valueOf(numberToCheck).split("");
        int total = 0;
        for (int i = 0; i < digits.length; i++) {
            total +=  Math.pow(Integer.parseInt(digits[i]), digits.length);
        }

        return total == numberToCheck;

    }

}
