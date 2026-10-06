class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {
        switch (operation) {
            case "+" -> {
                return operand1 + " " + operation + " " + operand2 + " = " + (operand1 + operand2);
            } case "*" -> {
                return operand1 + " " + operation + " " + operand2 + " = " + (operand1 * operand2);
            } case "/" -> {
                String output;
                try {
                    output = operand1 + " " + operation + " " + operand2 + " = " + (operand1 / operand2);

                } catch (ArithmeticException e) {
                    throw new IllegalOperationException("Division by zero is not allowed", e);
                }
                return output;
            } case "" -> throw new IllegalArgumentException("Operation cannot be empty");
            case null -> throw new IllegalArgumentException("Operation cannot be null");
            default -> throw new IllegalOperationException("Operation '" + operation + "' does not exist");
        }
    }
}
