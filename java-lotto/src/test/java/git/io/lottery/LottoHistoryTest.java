package git.io.lottery;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class LottoHistoryTest {

    private List<Integer> getlist(){ArrayList<Integer> result = new ArrayList<>();for (int i = 0; i < 6; i++) {result.add(i);}return result;}

    RandomValueGenerate randomValueGenerate = (Origin,Bound,Count) -> getlist();
    @Test
    void match(){
        LottoHistory lottoHistory = new LottoHistory(getlist());
        LottoHistory.Grade result = lottoHistory.matches(new Lotto(randomValueGenerate));

        Assertions.assertThat(result).isEqualTo(LottoHistory.Grade.ONE);
    }
}
