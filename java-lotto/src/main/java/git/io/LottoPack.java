package git.io;

import java.util.List;
import java.util.stream.IntStream;

import static git.io.LottoTicket.issue;

public class LottoPack {
    private final RandomLottoGenerator randomLottoGenerator;
    private final List<LottoTicket> lottoTickets;

    public LottoPack(RandomLottoGenerator randomLottoGenerator, List<LottoTicket> lottoTickets) {
        this.randomLottoGenerator = randomLottoGenerator;
        this.lottoTickets = lottoTickets;
    }

    public void buy(Integer count) {
        IntStream.range(0, count)
                .forEach(i -> lottoTickets.add(issue(randomLottoGenerator.generate())));
    }

    public int size() {
        return lottoTickets.size();
    }
}
