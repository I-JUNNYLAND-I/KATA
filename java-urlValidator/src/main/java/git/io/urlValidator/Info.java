package git.io.urlValidator;

import java.util.Arrays;

import static java.lang.String.format;
import static java.util.Arrays.stream;

public class Info {
    private final Integer damage;
    private final Integer defense;
    private final Integer health;

    public Info(Integer damage, Integer defense, Integer health) {
        this.damage = damage;
        this.defense = defense;
        this.health = health;
    }
    public static Info combine(Info... data){
        return new Info(stream(data).mapToInt(e -> e.damage).sum(),
                stream(data).mapToInt(e -> e.defense).sum(),
                stream(data).mapToInt(e -> e.health).sum()
        );
    }
    public static Info none() {
        return new Info(0,0,0);
    }
    @Override
    public String toString() {
        return format("""INFO [damage = %s , defense = %s , health = $health ]""",damage,defense,health);
    }
}
