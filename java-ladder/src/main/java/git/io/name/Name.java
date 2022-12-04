package git.io.name;

public record Name(String name) {
    public Name {
        if (name.isEmpty() || name.isBlank()) {
            throw new IllegalArgumentException("...");
        }
        if (name.length() > 5) {
            throw new IllegalArgumentException("...");
        }
    }
}
