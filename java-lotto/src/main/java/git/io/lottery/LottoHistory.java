package git.io.lottery;

import java.util.List;

import static git.io.lottery.LottoHistory.Grade.*;

public class LottoHistory {
    private List<Integer> jackpot;
    public LottoHistory(List<Integer> jackpot) {
        this.jackpot = jackpot;
    }

    public Grade matches(Lotto lotto) {

        List<Integer> distinctNumbers = lotto.getDistinctNumbers();
        distinctNumbers.removeAll(jackpot);
        int count = distinctNumbers.size();

        return of(6 - count);
    }

    public enum Grade {
        ONE(6, 1, 1_000_000_000),
        TWO(5, 2, 500_000_000),
        THREE(4, 3, 100_000_000),
        FOUR(3, 4, 100_000),
        BANG(0, 0, 0);

        private final Integer matches;
        private final Integer grade;
        private final Integer award;

        Grade(Integer matches, Integer grade, Integer award) {
            this.matches = matches;
            this.grade = grade;
            this.award = award;
        }

        public static Grade of(Integer matches) {
            for (Grade grade : Grade.values()) {
                if (grade.matches.equals(matches)) return grade;
            }
            return BANG;
        }
    }
}
