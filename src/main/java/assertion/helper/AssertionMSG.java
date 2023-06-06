package assertion.helper;

public record AssertionMSG(Object actual, Object expected, String operation) {

    public String getSuccessAssertionMsg() {
        return "Asserting that: <" + actual + "> is " + (operation != null ? operation + " " : "") + "<" + expected + ">";
    }

    public String getErrorAssertionMsg() {
        return "Actual: <" + actual + "> Expected: " + (operation != null ? operation + " " : "") + "<" + expected + ">";
    }
}
