package git.io.result;

public record Result(String result) {
    public Result {
        if (!result.matches("^[0-9]*$") && !result.equals("GG")) {
            throw new IllegalArgumentException("...");
        }

    }
}
