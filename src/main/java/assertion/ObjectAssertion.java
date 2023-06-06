package assertion;

import assertion.helper.AssertionMSG;
import assertion.helper.AssertionRecord;

import java.util.Objects;

import static assertion.helper.AssertionHelper.defineExecutor;

public class ObjectAssertion<T> {
    private final T actual;
    private final AssertionExecutor executor;

    public ObjectAssertion(T actual) {
        this.actual = actual;
        this.executor = null;
    }

    public ObjectAssertion(T actual, AssertionExecutor executor) {
        this.actual = actual;
        this.executor = executor;
    }

    public AssertionExecutor isNull() {
        return defineExecutor(executor, new AssertionRecord(
                actual, "Null",
                () -> Objects.isNull(actual),
                new AssertionMSG(actual, "Null", null)
        ));
    }

    public AssertionExecutor isNotNull() {
        return defineExecutor(executor, new AssertionRecord(
                actual, "Not Null",
                () -> !Objects.isNull(actual),
                new AssertionMSG(actual, "Not Null", null)
        ));
    }

    public AssertionExecutor isEqualTo(T expected) {
        return defineExecutor(executor, new AssertionRecord(
                actual, expected,
                () -> Objects.isNull(actual),
                new AssertionMSG(actual, expected, "Equal To")
        ));
    }
}
