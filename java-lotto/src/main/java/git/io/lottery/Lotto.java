package git.io.lottery;

import java.util.List;

public class Lotto {
    private List<Integer> distinctNumbers;
    private static final int MAX_SIZE = 6;
    private static final int ORIGIN = 1;
    private static final int BOUND = 45;

    public Lotto(RandomValueGenerate randomValueGenerate) {
        List<Integer> distinctNumbers = randomValueGenerate.generate(ORIGIN,BOUND,MAX_SIZE);
        if(distinctNumbers.size() != MAX_SIZE) {
            throw new IllegalArgumentException("6 자리가 들어와야 한다");
        }

        if(distinctNumbers.size() == MAX_SIZE) {
            this.distinctNumbers = distinctNumbers;
        }
    }

    public List<Integer> getDistinctNumbers() {
        return distinctNumbers;
    }

    public int size() {
        return this.distinctNumbers.size();
    }
}
