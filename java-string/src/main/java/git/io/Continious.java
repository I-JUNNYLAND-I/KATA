package git.io;

import static git.io.Operate.findByCode;
import static git.io.Operate.isOperand;
import static java.lang.Long.getLong;
import static java.lang.Long.parseLong;
import static java.lang.String.valueOf;

public class Continious {
    private final Long result;

    private Continious(String expression) {
        this.result = operand(expression);
    }

    public static Long of(String expression) {
        return new Continious(expression).getResult();
    }

    private Long operand(String expression) {
        //    private static final String OPERATION_REGULAR = "^[+\\-*/[0-9]]*$";

        String[] split = expression.split(" ");

        for (int i = 0; i < split.length; i++) {
            if(isOperand(split[i])){
                split[i+1] = valueOf(findByCode(split[i]).execute(parseLong(split[i - 1]), parseLong(split[i + 1])));
            }
        }

        return parseLong(split[split.length-1]);
    }

    public Long getResult() {
        return result;
    }
}
