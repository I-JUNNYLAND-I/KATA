package git.io;

import java.util.List;

public class LottoTicket{
    private final List<Integer> numbers;

    public LottoTicket(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public static LottoTicket issue(List<Integer> numbers) {
        return new LottoTicket(numbers);
    }

    public Integer size() {
        return numbers.size();
    }
}
