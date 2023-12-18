public enum OperationArithmeticEnum {
    ADDITION ("Addition"),
    SUBTRACTION ("subtraction"),
    MULTIPLICATION ("Multiplication"),
    DIVISION ("Division"),
    MIN("Min"),
    MAX("Max");

    private final String operationArithmetic;
    OperationArithmeticEnum(String OperationArithmetic) {
        this.operationArithmetic = OperationArithmetic;
    }

    public String getOperationArithmetic() {
        return operationArithmetic;
    }
}
