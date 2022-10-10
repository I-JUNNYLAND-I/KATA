import git.io.LottoTicket;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public  class LottoTicketTest {

    private static final List<Integer> TEST_NUM = List.of(1, 2, 3, 4, 5, 6);

    @Test
    void test() {
        Assertions.assertThatCode(() -> {
            LottoTicket lottoTicket = LottoTicket.issue(TEST_NUM);

            Assertions.assertThat(lottoTicket.size()).isEqualTo(6);
        }).doesNotThrowAnyException();
    }


}
