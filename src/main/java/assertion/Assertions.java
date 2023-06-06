package assertion;

public class Assertions {
    private final AssertionExecutor executor;

    public Assertions(AssertionExecutor executor) {
        this.executor = executor;
    }
}
