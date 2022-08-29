package git.io;

import java.util.EnumSet;
import java.util.Optional;
import java.util.function.BiFunction;

import static java.lang.Boolean.FALSE;


enum Operate {
    PLUS("+", (left, right) -> left + right),
    MINUS("-", (left, right) -> left - right),
    DIVIDE("/", (left, right) -> left / right),
    MULTIPLY("*", (left, right) -> left * right);

    private final String code;
    private final BiFunction<Long, Long, Long> resultSet;

    Operate(String code, BiFunction<Long, Long, Long> resultSet) {
        this.code = code;
        this.resultSet = resultSet;
    }

    public static Boolean isOperand(String code) {
        Optional<Operate> first = EnumSet.allOf(Operate.class).stream()
                .filter(element -> element.code.equals(code))
                .findFirst();

        return first.isEmpty() == FALSE;
    }


    public Long execute(Long left, Long right) {
        return resultSet.apply(left, right);
    }

    public static Operate findByCode(String code) {
        return EnumSet.allOf(Operate.class).stream()
                .filter(element -> element.code.equals(code))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("없음"));
    }
}
