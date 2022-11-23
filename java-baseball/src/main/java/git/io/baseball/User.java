package git.io.baseball;

public record User(Integer number, Integer batting, UserHistory histories) {
    public Integer myNumber() {
        return number;
    }
    @Override
    public String toString() {
        return """
                USER [ NUMBER: %d & BATTING: %d ]
               """
                .formatted(number, batting);
    }
}
