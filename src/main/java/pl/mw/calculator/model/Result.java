package pl.mw.calculator.model;

public class Result {
    double value;
    String message;

    public Result(double value, String message) {
        this.value = value;
        this.message = message;
    }

    public double getValue() {
        return value;
    }

    public String getMessage() {
        return message;
    }
}
