package assertion;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.List;

public class Assertion {

    private Assertion() {}

    public static ObjectAssertion<Object> assertThat(Object actual) {
        return new ObjectAssertion<>(actual);
    }

//    public static BooleanAssertion assertThat(Boolean actual) {
//        return new BooleanAssertion(actual);
//    }
//
//    public static IntegerAssertion<Byte> assertThat(Byte actual) {
//        return new IntegerAssertion<>(actual);
//    }
//
//    public static IntegerAssertion<Short> assertThat(Short actual) {
//        return new IntegerAssertion<>(actual);
//    }
//
//    public static IntegerAssertion<Integer> assertThat(Integer actual) {
//        return new IntegerAssertion<>(actual);
//    }
//
//    public static IntegerAssertion<Long> assertThat(Long actual) {
//        return new IntegerAssertion<>(actual);
//    }
//
//    public static DecimalAssertion<Float> assertThat(Float actual) {
//        return new DecimalAssertion<>(actual);
//    }
//
//    public static DecimalAssertion<Double> assertThat(Double actual) {
//        return new DecimalAssertion<>(actual);
//    }
//
//    public static TextAssertion assertThat(String actual) {
//        return new TextAssertion(actual);
//    }
//
//    public static LocalDateTimeAssertion assertThat(LocalDateTime actual) {
//        return new LocalDateTimeAssertion(actual);
//    }
//
//    public static ZonedDateTimeAssertion assertThat(ZonedDateTime actual) {
//        return new ZonedDateTimeAssertion(actual);
//    }
//
//    public static StatusCodeAssertion assertThat(HttpStatusCode actual) {
//        return new StatusCodeAssertion(actual);
//    }
//
//    public static <T> ObjectAssertion<T> assertThat(T actual) {
//        return new ObjectAssertion<>(actual);
//    }
//
//    public static NumberListAssertion<Integer> assertThat(Integer[] actual) {
//        return new NumberListAssertion<>(Arrays.stream(actual).toList());
//    }
//
//    public static NumberListAssertion<Double> assertThat(Double[] actual) {
//        return new NumberListAssertion<>(Arrays.stream(actual).toList());
//    }
//
//    public static StringListAssertion assertThat(String[] actual) {
//        return new StringListAssertion(Arrays.stream(actual).toList());
//    }
//
//    public static LocalDateTimeListAssertion assertThat(LocalDateTime[] actual) {
//        return new LocalDateTimeListAssertion(Arrays.stream(actual).toList());
//    }
//
//    public static ZonedDateTimeListAssertion assertThat(ZonedDateTime[] actual) {
//        return new ZonedDateTimeListAssertion(Arrays.stream(actual).toList());
//    }
//
//    public static  <T> ObjectListAssertion<T> assertThat(T[] actual) {
//        return new ObjectListAssertion<>(Arrays.stream(actual).toList());
//    }
//
//    public static <T> ObjectListAssertion<T> assertThat(List<T> actual) {
//        return new ObjectListAssertion<>(actual);
//    }
}
